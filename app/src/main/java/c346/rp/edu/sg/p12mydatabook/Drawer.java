package c346.rp.edu.sg.p12mydatabook;

/**
 * Created by 15031777 on 10/8/2017.
 */

public class Drawer {

    private String title;
    private String text;

    public Drawer(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
