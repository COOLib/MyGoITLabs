
public class Piano extends MusicInstrument {

    public Piano(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        try {
            throw new Exception("Exception");
            //System.out.println("Piano starts playing");
        } catch (Exception e) {
            System.out.println("Can' tune Piano");
        }
    }

    public void tune() {
        System.out.println("Piano is tuning now");
    }
}