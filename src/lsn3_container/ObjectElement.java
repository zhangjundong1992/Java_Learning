package lsn3_container;

/*
 * 注意区别在使用foreach时，普通数组跟对象数组的区别
 * 其实质是，对象数组存储的是指针，即使是指针的副本，指向的也是相同的对象！！！*/
public class ObjectElement {
    public int para;

    public String toString(){
        return para+"";
    }

    public static void main(String[] args) {
        //值类型的foreach,只是副本
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        for (var i : nums) {
            i = 0;
        }
        for (var i : nums) {
            System.out.println(i);
        }

        //而引用类型的副本，指向的是相同的对象
        ObjectElement[] values = new ObjectElement[10];
        for (int i = 0; i < values.length; i++) {
            values[i] = new ObjectElement();
            values[i].para = i;
        }
        for (var ve : values) {
            ve.para = 0;
        }
        for (var ve : values) {
            System.out.println(ve.para);
        }

        //toString()方法
        var oe=new ObjectElement();
        oe.para=5;
        System.out.println(oe);
    }
}
