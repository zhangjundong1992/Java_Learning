package lsn4_inheritace;

public class Main {
    public static void main(String[] args) {
        Database db=new Database();

        CD cd=new CD("Jay",0,false,"mf","Jay");
        DVD dvd=new DVD("雏菊",0,false,"beautiful","not known");

        db.add(cd);
        db.add(dvd);

        db.list();

    }
}
