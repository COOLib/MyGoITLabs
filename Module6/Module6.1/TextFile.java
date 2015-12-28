import java.util.Date;

public class TextFile extends File {

    public TextFile(String name, int size, Date date) {
        super(name, size, date);
    }

    public void open() {
        try {
            throw new IllegalStateException("Exception");
            //System.out.println("Text file was opened.");
        } catch (IllegalStateException e) {
            System.out.println("There is no such file at this place!");
        }
    }

    public void close() {
        System.out.println("Text file was closed.");
    }
}