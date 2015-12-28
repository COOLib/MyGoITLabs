import java.util.Date;

public class TextFile extends File {

    TextFile file;

    public TextFile(String name, int size, Date date) {
        super(name, size, date);
    }

    public void open() {
        try {
            if (file.getName().equals("")) {
                throw new MyFileException("MyException");
            }
            throw new IllegalStateException("Exception");
            //System.out.println("Text file was opened.");
        } catch (IllegalStateException e) {
            System.out.println("There is no such file at this place!");
        } catch (MyFileException e) {
            System.out.println("Error! There is no name for this flower!");
        }
    }

    public void close() {
        System.out.println("Text file was closed.");
    }
}