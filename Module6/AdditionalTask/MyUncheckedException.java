/**
 * Created by COOLib on 05.01.2016.
 */
public class MyUncheckedException extends RuntimeException{

    private String nameOfFile;

    public MyUncheckedException(String name){
        this.nameOfFile = name;
    }

    public String getNameOfFile(){
        return nameOfFile;
    }
}
