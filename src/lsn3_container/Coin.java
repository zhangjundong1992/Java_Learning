package lsn3_container;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;

public class Coin {

    //Java里哈希表只允许使用对象类型，值类型须使用对应的包裹类型声明
    private HashMap<Integer, String> coinnames = new HashMap<>();

    Coin() {
        coinnames.put(1, "penney");
        coinnames.put(10, "dime");
        coinnames.put(25, "quarter");
        coinnames.put(50, "half-dollar");
        coinnames.put(50, "五毛");//!!!会自动覆盖
//        System.out.println(coinnames.size());
//        System.out.println(coinnames);

        coinnames.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });
    }

    String getName(int count) {
        return coinnames.getOrDefault(count, "NOT FOUND");
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = in.nextInt();
        Coin coin = new Coin();
//        String name = coin.getName(count);
//        System.out.println(name);

    }
}
