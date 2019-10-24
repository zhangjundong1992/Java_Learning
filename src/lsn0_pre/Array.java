package lsn0_pre;

import java.util.Scanner;

public class Array {

    public static void Ave() {
        Scanner in = new Scanner(System.in);//java用于读取输入的对象

        int[] numbers = new int[100];//保存所有输入的数组
        double sum = 0;//和
        int cnt = 0;//计数器
        int x;//记录输入

        x = in.nextInt();

        while (x != -1) {
            numbers[cnt] = x;
            sum += x;
            cnt++;
            x = in.nextInt();
        }

        if (cnt > 0) {

            double ave = sum / cnt;

            System.out.println("average:" + ave);

            for (int i = 0; i < cnt; i++) {
                if (numbers[i] > ave) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
