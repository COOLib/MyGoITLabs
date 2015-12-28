import java.util.Date;

public class AudioFile extends File {

    public AudioFile(String name, int size, Date date) {
        super(name, size, date);
    }

    public void open() {
        try {
            throw new IllegalStateException("Exception");
            // System.out.println("Audio file was opened.");
        } catch (IllegalStateException e) {
            System.out.println("There is no such file at this place!");
        }
    }

    public void close() {
        System.out.println("Audio file was closed.");
    }
}