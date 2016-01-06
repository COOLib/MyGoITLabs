import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<MusicInstrument> instruments = new ArrayList<MusicInstrument>();
    private ArrayList<String> allInstrumentNames;

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<MusicInstrument> getList() {
        return instruments;
    }

    public void addInstrument(MusicInstrument instrument) {
        instruments.add(instrument);
    }

    public ArrayList<String> getNamesOfInstrument() {
        for (MusicInstrument inst : instruments) {
            allInstrumentNames.add(inst.getName());
        }
        return allInstrumentNames;
    }

    public void tuneInstrument(MusicInstrument inst) throws MyMusicInstrumentException, MyMusicInstrumentException2 {
        if (inst.getName().equals("")) {
            throw new MyMusicInstrumentException("Exception");
        }
        if (inst.getSize() > 1000){
            throw new MyMusicInstrumentException2("Exception 2");
        }
        inst.tune();
    }
}