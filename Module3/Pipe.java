public class Pipe extends MusicInstruments{

    public Pipe(String name, String style, int size, int weight) {
        super(name, style, size,weight);
    }

    public void play(){
        System.out.println("Pipe starts playing");
    }

    public void tune(){
        System.out.println("Pipe is tuning now");
    }
}