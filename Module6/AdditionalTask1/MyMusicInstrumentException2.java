/**
 * Created by COOLib on 06.01.2016.
 */
public class MyMusicInstrumentException2 extends Exception {

    private String nameOfInstrument;
    private static MusicInstrument count;

    public MyMusicInstrumentException2(String name) {
        this.nameOfInstrument = name;
    }

    public String getNameOfInstrument() {
        return nameOfInstrument;
    }
}
