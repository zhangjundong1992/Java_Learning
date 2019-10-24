package lsn0_pre;

import java.util.Scanner;

public class MyString {

    public static void Func() {

        String s = "你好";
        String t = new String("世界");

        String numbers = "012345679";

        System.out.println(s.charAt(0));
        System.out.println(numbers.substring(6));
        System.out.println(numbers.substring(2, 5));//注意，是选取2，3，4位置的字符，不包括5

        String u = "abcd";
        String v = u.toUpperCase();

        System.out.println(u);//注意，toUpperCase()方法并不改变原字符串！！！
        System.out.println(v);

        //1.字符串的创建
        String s1 = "zjd";
        String s2 = new String("wxl");

        //2.字符串的连接
        String s3 = "王小龙" + "大笨蛋";
        String s4 = "Im " + 18;//自动类型转换

        System.out.println(s4);

        //3.字符串输入

        Scanner in = new Scanner(System.in);
        String s5;
        s5 = in.next();
        System.out.println(s5);

        String s6;
        s6 = in.nextLine();
        System.out.println(s6);

        //4.字符串的比较（注意字符串是引用类型）
        String s7 = s5;//令s5=”123“测试
        String s8 = "123";

        System.out.println(s7 == "123");//“==”比较的是指针的地址
        System.out.println(s7.equals("123"));//equal()比较的是字符串的值

        System.out.println(s8 == "123");//“123”jvm在静态区创建一个“123”的字符串对象

        //4.字符串大小的比较
        String s9 = "abd";
        String s10 = "abb";

        System.out.println(s9.compareTo(s10));

        //5、访问字符串的字符
        String s11 = "0123456789";
        System.out.println(s11.charAt(2));

        for (int i = 0; i < s11.length(); i++) {
            System.out.println(s11.charAt(i));

        }
    }
}
