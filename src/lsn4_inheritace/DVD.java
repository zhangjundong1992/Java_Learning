package lsn4_inheritace;

public class DVD extends Item {
    private String director;

    public DVD(String title, int playingTime, boolean gotIt, String comment, String director) {
        super(title, playingTime, gotIt, comment);
        this.director = director;
    }

    @Override
    public void print() {
        System.out.print("DVD: ");
        super.print();
        System.out.println(": " + director);
    }

    public void director() {
        System.out.println(director);
    }
}
