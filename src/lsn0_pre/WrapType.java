package lsn0_pre;

//包裹类型
public class WrapType {

    public static void Func() {

        //1.对应的包裹类型
        boolean x = false;
        Boolean y = false;

        int i = 5;
        Integer j = 5;

        //2.用包裹类型得到int类型的一些属性，比如最大值
        System.out.println(Integer.MAX_VALUE);

        //3.使用一些静态方法
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('二'));
        System.out.println(Character.isDigit('a'));

        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLowerCase('A'));

        System.out.println(Character.toLowerCase('A'));

    }
}
