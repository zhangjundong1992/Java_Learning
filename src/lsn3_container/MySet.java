package lsn3_container;

import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("first");
        set.add("second");
        set.add("first");


        System.out.println(set);
    }
}
