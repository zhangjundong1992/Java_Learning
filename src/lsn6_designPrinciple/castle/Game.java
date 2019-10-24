package lsn6_designPrinciple.castle;

import java.util.HashMap;
import java.util.Scanner;

class Game {
    private Room currentRoom;
    private HashMap<String, Handler> handlers = new HashMap<>();

    Game() {
        createRooms();
        handlers.put("go", new HandlerGo());
        handlers.put("help", new HandlerHelp());
        handlers.put("bye", new HandlerBye());
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom;

        //	制造房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        //设置相邻关系
        outside.setExits("east", lobby);
        outside.setExits("south", study);
        outside.setExits("west", pub);
        lobby.setExits("west", outside);
        lobby.setExits("up", pub);
        pub.setExits("east", outside);
        pub.setExits("down", lobby);
        study.setExits("north", outside);
        study.setExits("east", bedroom);
        bedroom.setExits("west", study);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
    }

    private void showPrompt() {
        System.out.println("现在你在" + currentRoom);
        System.out.print("出口有：" + currentRoom.getExitDesc());
        System.out.println();
    }

    // 以下为用户命令
    private void printHelp() {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    void play() {
        Scanner in = new Scanner(System.in);
        printWelcome();
        while (true) {
            //获取输入
            String line = in.nextLine();
            String[] words = line.split(" ");

            //判断是否存在对应操作
            var handler = handlers.get(words[0]);
            if (handler == null) continue;

            //处理操作
            var cmd = words.length > 1 ? words[1] : "";
            handler.doCmd(cmd);

            //判断是否完结
            if (handler.isBye()) break;
        }
    }
}
