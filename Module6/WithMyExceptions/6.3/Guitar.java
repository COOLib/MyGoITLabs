public class Guitar extends MusicInstrument {

    Guitar guitar;

    public Guitar(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        System.out.println("Guitar starts playing");
    }

    public void tune() {
        try {
            if (guitar.getName().equals("")){
                throw new MyMusicInstrumentException("Exception");
            }
            throw new IllegalStateException("Exception");
            //System.out.println("Guitar is tuning now");
        }catch (MyMusicInstrumentException e){
            System.out.println("Error! This guitar has no name.");
        }
        catch (Exception e) {
            System.out.println("Can't tune guitar");
        }
    }
}