public class Tulip extends Flower{

    public Tulip(String name, String color, String aroma) {
        super(name, color, aroma);
    }
    public void plant(){
        System.out.println("Tulip was planted");
    }
    public void grow(){
        System.out.println("Tulip is growing");
    }
}
