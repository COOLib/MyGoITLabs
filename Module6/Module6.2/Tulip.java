public class Tulip extends Flower {

    public Tulip(String name, String color, String aroma) {
        super(name, color, aroma);
    }

    public void plant() {
        try {
            throw new Exception("Exception");
            //   System.out.println("Tulip was planted");
        } catch (Exception e) {
            System.out.println("Can't plant this flower");
        }
    }

    public void grow() {
        System.out.println("Tulip is growing");
    }
}
