
public class Main {
    public static void main(String[] args) {

        MusicShop shop = new MusicShop("Instruments");
        
        shop.addInstrument(new Guitar("Guitar", "liric", 20, 50));
        shop.addInstrument(new Piano("Piano", "classic", 100, 100));
        shop.addInstrument(new  Piano("Piano", "powerfull", 100, 100));
        shop.addInstrument(new Pipe("", "loud", 80, 40));

        for (MusicInstrument instrument : shop.getList())
            try {
                shop.tuneInstrument(instrument);
            } catch (MyMusicInstrumentException e) {
                System.out.println("We don't know what instrument we trying to tune!");
            }
    }
}
