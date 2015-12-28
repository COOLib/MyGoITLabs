/**
 * Created by COOLib on 28.12.2015.
 */
public class MyFlowerException extends Exception {

    private String nameOfFlower;

    public MyFlowerException(String name) {
        this.nameOfFlower = name;
    }

    public String getNameOfFlower() {
        return nameOfFlower;
    }

}
