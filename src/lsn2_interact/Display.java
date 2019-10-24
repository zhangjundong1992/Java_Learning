package lsn2_interact;

class Display {
    private int value = 0;
    private int limit = 0;

    Display(int limit) {
        this.limit = limit;
    }

    int getValue() {
        return value;
    }

    void increase() {
        value++;
        if (value >= limit) {
            value = 0;
        }
    }
}
