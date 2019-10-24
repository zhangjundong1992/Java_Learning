package lsn3_container;

import java.util.ArrayList;

class NoteBook {

    private ArrayList<String> notes = new ArrayList<>();

    void add(String s) {
        notes.add(s);
    }

    void add(int index, String s) {
        notes.add(index, s);
    }

    void removeNote(int index) {
        notes.remove(index);
    }

    int getSize() {
        return notes.size();
    }

    String getNote(int index) {
        return notes.get(index);
    }

    //关注一下toArray()的用法
    String[] list() {
        var res = new String[notes.size()];
        notes.toArray(res);
        return res;
    }

    public static void main(String[] args) {
        NoteBook note = new NoteBook();

        note.add("first");
        note.add("second");
        note.add(1, "new");
        note.add(2, "third");

        note.removeNote(0);
        note.removeNote(1);

        var lst = note.list();
        for (String s : lst) {
            System.out.println(s);
        }
    }
}
