import java.util.ArrayList;

public class MusicShop {

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstruments> Instruments = new ArrayList<MusicInstruments>();

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName(){return name;}

    public void addInstrument(MusicInstruments instrument){
        Instruments.add(instrument);}

    public void setQuantity(int quantity){
        quantityOfInstruments = quantity;
    }

    public void setPriceOfInstrument(int price){ }
}