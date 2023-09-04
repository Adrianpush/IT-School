package session11.livesession.datatransformationsystem;

import java.util.List;

public abstract class Raport {

    protected String title;
    protected List<String> data;

    Raport(String title, List<String> data) {
        this.title = title;
        this.data = data;
    }

    public abstract void showPreview();

    public void displayMetadata() {
        System.out.println("Title: " + title);
    }
}

