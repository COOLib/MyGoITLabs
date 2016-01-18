package Flowers;

public class Daisy extends Flower {

    public Daisy(String name, String color, String aroma) {
        super(name, color, aroma);
    }

    public void plant() {
        System.out.println("Daisy was planted");
    }

    public void grow() {
        System.out.println("Daisy is growing");
    }
}
