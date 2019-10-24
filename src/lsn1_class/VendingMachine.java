package lsn1_class;

public class VendingMachine {

    private int price = 10;
    private int balance = 0;
    private int total = 0;

    VendingMachine() {

    }

    public VendingMachine(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void showPrompt() {
        System.out.println("Welcome");
    }

    public void insertMoney(int amout) {
        balance += amout;
    }

    public void showBalance() {
        System.out.println(balance);
    }

    public void getFood() {
        if (balance >= price) {
            System.out.println("Here you are.");
            balance -= price;
            total += price;
        }
    }
}
