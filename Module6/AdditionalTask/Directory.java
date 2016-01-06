
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

    public ArrayList<String> namesOfContainedFiles() throws MyUncheckedException, MyUncheckedException2{
        ArrayList<String> names = new ArrayList<String>();
        for (File file : files) {
            try {

                if (file.getSize() > 10000) {
                    throw new MyFileException("Exception");
                }
                if (file.getSize() <= 0){
                    throw new MyFileException2("Exception 2");
                }
                names.add(file.getName());
                System.out.println(file.getName());
            }
            catch (MyFileException e){
                System.out.println("Error! Size of file must be less than 10000 !!!");
                throw new MyUncheckedException("Unchecked Exception");
            }
            catch (MyFileException2 e){
                System.out.println("Error! Size of file must be more than 0 !!!");
                throw new MyUncheckedException2("Unchecked Exception 2");
            }
        }
        return names;
    }
}