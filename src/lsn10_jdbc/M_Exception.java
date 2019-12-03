package lsn10_jdbc;


public class M_Exception {
    public static void main(String[] args) {
//        try {
//            ArrayList<Integer> list = null;
//            list.add(1);
//        }
//        catch (NullPointerException e) {
//            System.out.println(e.toString());
//            throw e;
//        }

        try {
            test(10);
            test(11);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }


    }

    private static void test(int arg) throws Exception {

        if (arg > 10) {
            System.out.println(arg);
            return;
        }

        throw new Exception("11");
    }
}
