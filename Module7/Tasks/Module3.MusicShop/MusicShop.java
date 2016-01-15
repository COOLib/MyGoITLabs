import java.util.ArrayList;

public class MusicShop {

    /* Здесь методы addInstrument и getNamesOfInstruments совершают     одинаковые действия,
     практически дублируя друг друга.
    Список имен можно получить обычным образом,
     вытягивая имена из элементов списка инструментов
    */

    private String name;
    private int quantityOfInstruments;
    private ArrayList<MusicInstruments> Instruments = new ArrayList<MusicInstruments>();
    private ArrayList<String> allInstrumentNames;

    public MusicShop(String name) {
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

    /*Каждый раз при вызове метода getNamesOfInstruments
     в коллекцию добавляется полный список инструментов и не удаляется
    */

    public ArrayList<String> getNamesOfInstrument() {
        for (MusicInstruments inst : Instruments) {
            allInstrumentNames.add(inst.getName());
        }
        return allInstrumentNames;
    }
}