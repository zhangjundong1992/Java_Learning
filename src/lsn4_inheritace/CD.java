package lsn4_inheritace;

public class CD extends Item {
    private String artist;

    public CD(String title, int playingTime, boolean gotIt, String comment, String artist) {
        super(title, playingTime, gotIt, comment);
        this.artist = artist;
    }

    @Override
    public void print() {
        System.out.print("CD: ");
        super.print();
        System.out.println(": " + artist);
    }

    public void artist() {
        System.out.println(artist);
    }
}
