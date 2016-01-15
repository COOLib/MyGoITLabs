import java.util.ArrayList;

public class MusicShop1 {

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstruments> instruments = new ArrayList<MusicInstruments>();

    public MusicShop1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MusicInstruments> getInstruments(){
        return instruments;
    }

    public void addInstrument(MusicInstruments instrument) {
        instruments.add(instrument);
    }

    public void setQuantity(int quantity) {
        quantityOfInstruments = quantity;
    }
}