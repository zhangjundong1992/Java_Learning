package lsn6_designPrinciple;

public class HandlerBye extends Handler {
    @Override
    public void doCmd(String word) {
        System.out.println("感谢您的光临。再见！");
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
