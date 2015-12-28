public class Rose extends Flower {

    public Rose(String name, String color, String aroma) {
        super(name, color, aroma);
    }

    public void plant() {
        try {
            throw new Exception("Exception");
            // System.out.println("Rose was planted");
        } catch (Exception e) {
            System.out.println("Can't plant this flower");
        }
    }

    public void grow() {
        System.out.println("Rose is growing");
    }
}
