import java.util.ArrayList;

public class MusicShop1 {

    /* Здесь методы addInstrument и getNamesOfInstruments совершают практически одинаковые действия,
     практически дублируя друг друга.
    */

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstruments> Instruments = new ArrayList<MusicInstruments>();

    public MusicShop1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addInstrument(MusicInstruments instrument) {
        Instruments.add(instrument);
    }

    public void setQuantity(int quantity) {
        quantityOfInstruments = quantity;
    }
}