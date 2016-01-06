/**
 * Created by COOLib on 05.01.2016.
 */
public class MyUncheckedException2 extends RuntimeException{

    private String nameOfFile;

    public MyUncheckedException2(String name){
        this.nameOfFile = name;
    }

    public String getNameOfFile(){
        return nameOfFile;
    }
}
