package lsn10_jdbc;

import java.sql.*;

public class demo01 {
    public static void main(String[] args) {
//        selectAll();
//        System.out.println(selectByUsernamePassword("zjd", "123"));
//        System.out.println(selectByUsernamePassword("zjd", "1234"));
//        selectUserByPage(1, 5);
//        selectUserByPage(2, 3);
//        insert("wxl", "123");
//        System.out.println(selectByUsernamePassword("wxl", "123"));
//        delete(28);
//        update(4, "321");
        transferMoney("siki", "zjd", 1000);
    }

    /*选择所有的user*/
    private static void selectAll() {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;

        try {
            con = JDBCUtils.getConnection();
            /*执行sql语句*/
            String sql = "SELECT * FROM user;";
            assert con != null;
            statement = con.prepareStatement(sql);
            res = statement.executeQuery();
            /*对结果集进行处理*/
            while (res.next()) {
//                System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
                System.out.println(res.getInt("id") + " " + res.getString("username") + " " + res.getString("password"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, res);
        }
    }

    /*根据用户名和密码选择*/
    private static boolean selectByUsernamePassword(String username, String password) {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;

        try {
            con = JDBCUtils.getConnection();

            /*有sql注入的风险*/
//            statement = con.createStatement();
//            String sql = "select * from user where username = xxx and password = xxx;";
//            res = statement.executeQuery(sql);
//            return res.next();

            /*解决sql注入*/
            String sql = "select * from user where username = ? and password = ?;";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            res = statement.executeQuery();
            return res.next();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, res);
        }
        return false;
    }

    /*分页查询*/
    private static void selectUserByPage(int pageNum, int pageSize) {
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;

        try {


            con = JDBCUtils.getConnection();

            /*执行sql语句*/
            String sql = "SELECT * FROM user limit ? , ?;";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setInt(1, (pageNum - 1) * pageSize);
            statement.setInt(2, pageSize);
            res = statement.executeQuery();

            /*对结果集进行处理*/
            while (res.next()) {
                System.out.println(res.getInt("id") + " " + res.getString("username") + " " + res.getString("password"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, res);
        }
    }

    /*插入*/
    private static void insert(String username, String password) {
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "insert into user(username,password) values(?,?)";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            int res = statement.executeUpdate();
            System.out.println(res);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, null);
        }

    }

    /*删除*/
    private static void delete(int id) {
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "delete from user where id = ?";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            int res = statement.executeUpdate();
            System.out.println(res);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, null);
        }

    }

    /*更新*/
    private static void update(int id, String newPwd) {
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = JDBCUtils.getConnection();
            String sql = "update user set password = ? where id = ?";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setString(1, newPwd);
            statement.setInt(2, id);

            int res = statement.executeUpdate();
            System.out.println(res);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, null);
        }

    }

    /*转账*/
    private static void transferMoney(String user_out, String user_in, int count) {
        Connection con = null;
        PreparedStatement statement = null;

        try {
            con = JDBCUtils.getConnection();

            /*开启事务*/
            con.setAutoCommit(false);

            String sql = "update user set balance = balance - ? where username = ?";
            assert con != null;
            statement = con.prepareStatement(sql);
            statement.setInt(1, count);
            statement.setString(2, user_out);
            int res = statement.executeUpdate();
            System.out.println(res);

//            int i = 10 / 0;

            sql = "update user set balance = balance + ? where username = ?";
            statement = con.prepareStatement(sql);
            statement.setInt(1, count);
            statement.setString(2, user_in);
            res = statement.executeUpdate();
            System.out.println(res);

            /*提交事务*/
            con.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(con, statement, null);
        }
    }

}
