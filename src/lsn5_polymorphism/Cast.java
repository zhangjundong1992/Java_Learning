package lsn5_polymorphism;

import lsn4_inheritace.*;

public class Cast {
    public static void main(String[] args) {
        //1、向上造型
        Item item = new Item("item", 0, false, "item");
        CD cd = new CD("Jay", 0, false, "mf", "Jay");
        DVD dvd = new DVD("雏菊", 0, false, "beautiful", "not known");

        //        item = cd;//可以向上造型
//        dvd = item;//不能向下造型
        CD cd1 = (CD) item;//强制造型，不安全


    }
}
