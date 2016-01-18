package Flowers;

public class Rose extends Flower{

    public Rose(String name, String color, String aroma) {
        super(name, color, aroma);
    }
    public void plant(){
        System.out.println("Rose was planted");
    }
    public void grow(){
        System.out.println("Rose is growing");
    }
}
