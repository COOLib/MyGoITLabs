/**
 * Created by COOLib on 28.12.2015.
 */
public class MyMusicInstrumentException extends Exception {
    private String nameOfInstrument;

    public MyMusicInstrumentException(String name) {
        this.nameOfInstrument = name;
    }

    public String getNameOfInstrument() {
        return nameOfInstrument;
    }
}
