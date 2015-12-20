import java.util.ArrayList;

public class MusicShop {

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstruments> Instruments = new ArrayList<MusicInstruments>();
    private ArrayList<String> allInstrumentNames;

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName(){return name;}

    public void addInstrument(MusicInstruments instrument){
        Instruments.add(instrument);}

    public void setQuantity(int quantity){
        quantityOfInstruments = quantity;
    }

    public ArrayList<String> getNamesOfInstrument(){
        for (MusicInstruments inst : Instruments){
            allInstrumentNames.add(inst.getName());
        }
        return allInstrumentNames;
    }
}