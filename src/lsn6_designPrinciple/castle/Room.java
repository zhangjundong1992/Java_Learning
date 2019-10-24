package lsn6_designPrinciple.castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();//扩展的地方用容器

    Room(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }

    //设置房间的相邻方向上的房间
    void setExits(String direction, Room room) {
        exits.put(direction, room);
    }

    //获取指定方向上的房间
    Room getExit(String direction) {
        return exits.get(direction);
    }

    //获取出口信息
    String getExitDesc() {
        StringBuilder sb = new StringBuilder();
        exits.forEach((key, value) -> sb.append(key).append(" "));
        return sb.toString();
    }
}
