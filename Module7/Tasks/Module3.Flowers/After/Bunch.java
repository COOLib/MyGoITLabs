import java.util.ArrayList;

public class Bunch {

    private String name;
    private int numberOfFlowers;
    private ArrayList<Flower> flowers = new ArrayList<Flower>();

    public Bunch(String name, int number) {
        this.name = name;
        this.numberOfFlowers = number;
    }

    public String getName() {return name;}
    public int getNumber() {return numberOfFlowers;}

    public void initFlower(){
        flowers.add(new Astra("Astra", "Colored", "smells nice"));
        flowers.add(new Tulip("Tulip", "Red", "nice smell"));
        flowers.add(new Daisy("Daisy", "White", "funny smell"));
        flowers.add(new Rose("Rose", "Red", "smells very nice"));
    }

    public void namesOfContainedFlowers() {
        for (Flower flower : flowers)
            flower.getName();
    }
}