import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by COOLib on 24.01.2016.
 */
public class ReadAndWrite {

    public void writeFile(String s) {

        String str = new String();
        try {
            FileEncryption.encryptFile(s);

        } catch (IOException e) {
            System.out.println("Error! Trouble with a string!");
            e.printStackTrace();
        }
    }

    public String readFile() {
        String s = "";
        try {
            s = FileEncryption.decryptFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error! There is no such file!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

}
