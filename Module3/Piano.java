
public class Piano extends MusicInstruments{

    public Piano(String name, String style, int size, int weight) {
        super(name, style, size,weight);
    }

    public void play(){
        System.out.println("Piano starts playing");
    }

    public void tune(){
        System.out.println("Piano is tuning now");
    }
}