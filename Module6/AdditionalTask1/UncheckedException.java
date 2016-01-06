/**
 * Created by COOLib on 06.01.2016.
 */
public class UncheckedException extends RuntimeException {

    private String nameOfInstrument;
    private static MusicInstrument count;

    public UncheckedException(String name) {
        this.nameOfInstrument = name;
    }

    public String getNameOfInstrument() {
        return nameOfInstrument;
    }
}
