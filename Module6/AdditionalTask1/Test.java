public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        test.tuning();
    }

    public void tuning (){

        MusicShop shop = new MusicShop("Instruments");

        shop.addInstrument(new Guitar("Guitar", "liric", 20, 50));
        shop.addInstrument(new Piano("Piano", "classic", 100, 100));
        shop.addInstrument(new  Piano("Piano", "powerfull", 1010, 100));
        shop.addInstrument(new Pipe("", "loud", 80, 40));

        for (MusicInstrument instrument : shop.getList())
            try {
                shop.tuneInstrument(instrument);
            } catch (MyMusicInstrumentException e) {
                System.out.println("We don't know what instrument we trying to tune!");
                System.out.println("Instrument must have a name!");
                throw new UncheckedException("Unchecked Exception");
            }
            catch (MyMusicInstrumentException2 e){
                System.out.println("Error! Size of instrument must be less than 1000");
                throw new UncheckedException2("Unchecked Exception 2");
            }
    }
}
