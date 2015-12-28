import java.util.Date;

public class Picture extends File {

    public Picture(String name, int size, Date date) {
        super(name, size, date);
    }

    public void open() {
        try {
            throw new IllegalStateException("Exception");
            //System.out.println("Picture was opened.");
        } catch (IllegalStateException e) {
            System.out.println("There is no such file at this place!");
        }
    }

    public void close() {
        System.out.println("Picture was closed.");
    }
}