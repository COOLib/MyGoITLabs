public class Pipe extends MusicInstrument {

    Pipe pipe;

    public Pipe(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        try {
            if (pipe.getName().equals("")) {
                throw new MyMusicInstrumentException("Exception");
            }
            throw new Exception("Exception");
            //System.out.println("Pipe starts playing");
        } catch (MyMusicInstrumentException e) {
            System.out.println("Error! This pipe has no name.");
        } catch (Exception e) {
            System.out.println("Can't tune Pipe");
        }
    }

    public void tune() {
        System.out.println("Pipe is tuning now");
    }
}