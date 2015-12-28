public class Guitar extends MusicInstrument {

    public Guitar(String name, String style, int size, int weight) {
        super(name, style, size, weight);
    }

    public void play() {
        System.out.println("Guitar starts playing");
    }

    public void tune() {
        System.out.println("Guitar is tuning now");
    }
}