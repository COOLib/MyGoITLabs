public class Astra extends Flower {

    Astra flower;

    public Astra(String name, String color, String aroma) {
        super(name, color, aroma);
    }

    public void plant() {
        try {
            if (flower.getName().equals("")){
                throw new MyFlowerException("Exception");
            }
            throw new Exception("Exception");
            //System.out.println("Astra was planted");
        }catch (MyFlowerException e){
            System.out.println("Error! this flower has no any name.");
        }
        catch (Exception e) {
            System.out.println("Can't plant this flower");
        }
    }

    public void grow() {
        System.out.println("Astra is growing");
    }
}
