import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite {

    public void writeFile(String s) {

        try {
            FileEncryption.encryptFile(s);

        } catch (IOException e) {
            System.out.println("Error! Trouble with a string!");
            e.printStackTrace();
        }
    }

    public void writeHandleStringToFile() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
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
