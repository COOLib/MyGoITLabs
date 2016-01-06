/**
 * Created by COOLib on 28.12.2015.
 */
public class MyFileException extends Exception {

    private String nameOfFile;

    public MyFileException(String name){
        this.nameOfFile = name;
    }

    public String getNameOfFile(){
        return nameOfFile;
    }
}
