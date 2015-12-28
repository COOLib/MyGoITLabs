public class Pipe extends MusicInstrument {

    public Pipe(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        try {
            throw new Exception("Excepyion");
            //System.out.println("Pipe starts playing");
        } catch (Exception e) {
            System.out.println("Can't tune Pipe");
        }
    }

    public void tune() {
        System.out.println("Pipe is tuning now");
    }
}