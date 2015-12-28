import java.util.ArrayList;

public class MusicShop {

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstrument> Instruments = new ArrayList<MusicInstrument>();
    private ArrayList<String> allInstrumentNames;

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addInstrument(MusicInstrument instrument) {
        Instruments.add(instrument);
    }

    public void setNamesOfInstruments(MusicInstrument instrument) {
        instrument.setName("Grand Piano");
    }

    public ArrayList<String> getNamesOfInstrument() {
        for (MusicInstrument inst : Instruments) {
            allInstrumentNames.add(inst.getName());
        }
        return allInstrumentNames;
    }
}