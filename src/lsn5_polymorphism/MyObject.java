package lsn5_polymorphism;

import java.util.Objects;

public class MyObject {
    private int para1 = 0;
    private String para2 = "hello";

    @Override
    public String toString() {
        return "MyObject{" +
                "para1=" + para1 +
                ", para2='" + para2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return para1 == myObject.para1 &&
                Objects.equals(para2, myObject.para2);
    }


    public static void main(String[] args) {
        Object oj = new Object();
        //1、toString()
        System.out.println(oj);//默认调用
        String s = "aa" + oj;//默认调用

        MyObject mo=new MyObject();
        System.out.println(mo);

        //2、equals()
        MyObject mo1=new MyObject();
        System.out.println(mo.equals(mo1));

    }

}
