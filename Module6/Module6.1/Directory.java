
import java.util.ArrayList;
import java.util.Date;

public class Directory {

    private String name;
    private Date date;
    private ArrayList<File> files = new ArrayList<File>();

    public ArrayList<File> getListOfFiles() {
        return files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public Directory(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public boolean isEmpty() {
        return false;
    }

    public ArrayList<String> namesOfContainedFiles() throws IllegalStateException {
        ArrayList<String> names = new ArrayList<String>();
        for (File file : files) {
            if (file.getSize() > 10000) {
                throw new IllegalStateException("Exception");
            }
            names.add(file.getName());
            System.out.println(file.getName());
        }
        return names;
    }
}