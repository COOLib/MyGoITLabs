
public class Piano extends MusicInstrument {

    Piano piano;

    public Piano(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        try {
            if (piano.getName().equals("")) {
                throw new MyMusicInstrumentException("Exception");
            }
            throw new Exception("Exception");
            //System.out.println("Piano starts playing");
        } catch (MyMusicInstrumentException e) {
            System.out.println("Error! This piano has no name.");
        } catch (Exception e) {
            System.out.println("Can' tune Piano");
        }
    }

    public void tune() {
        System.out.println("Piano is tuning now");
    }
}