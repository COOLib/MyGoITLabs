public class Rose extends Flower {

    Rose flower;

    public Rose(String name, String color, String aroma) {
        super(name, color, aroma);
    }

    public void plant() {
        try {

            if (flower.getName().equals("")) {
                throw new MyFlowerException("Exception");
            }
            throw new Exception("Exception");
            // System.out.println("Rose was planted");
        } catch (MyFlowerException e) {
            System.out.println("Error! this flower has no any name.");
        } catch (Exception e) {
            System.out.println("Can't plant this flower");
        }
    }

    public void grow() {
        System.out.println("Rose is growing");
    }
}
