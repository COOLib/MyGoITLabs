package MusicShop;

public abstract class MusicInstrument {

    private String name;
    private String style;
    private int size;
    private int weight;

    public MusicInstrument(String name, String style, int size, int weight) {
        this.name = name;
        this.style = style;
        this.size = size;
        this.weight = weight;
    }


    public String getName(){return name;}
    public String getStyle(){return style;}
    public int getSize(){return size;}
    public int getWeight() {return weight;}

    public abstract void play();

    public abstract void tune();
}