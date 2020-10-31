import java.util.ArrayList;

public class Notebook {

    ArrayList<String> notes = new ArrayList<String>();

    void addNote(String note) {
        notes.add(note);
    }

    int getSize() {
        return notes.size();
    }

    void listAll() {
//		for (int i = 0; i < count; i++) {
//			System.out.println("No " + i + ": " + notes[i]);
//		}
        for (String note : notes) {
            System.out.println(note);
        }
    }

    String getNote(int index) {
        return notes.get(index);
    }

    void removeNote(int index) {
        notes.remove(index);
    }

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.addNote("AAAAAAAAA");
        notebook.addNote("BBBBBBBBB");
        notebook.addNote("CCCCCCCCC");

        notebook.listAll();
        System.out.println("The Size of notebook is " + notebook.getSize());

        int index = 2;
        notebook.getNote(index);

        notebook.removeNote(index);

        notebook.listAll();
        System.out.println("The Size of notebook is " + notebook.getSize());
    }

}