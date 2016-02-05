import caesar.caesarEncryption.CaesarAlgorithm;
import org.junit.*;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.Assert.*;

/**
 * Created by COOLib on 05.02.2016.
 */
public class FileEncryptionTest {

    private static String str= "Just simle code!";
    private static String string = "yjhi hxbat rdst!";
    private static File file;
    private static CaesarAlgorithm algorithm;

    @BeforeClass
    public static void setUp() throws Exception {
        file = new File("EncryptedTestFile.txt");
        CaesarAlgorithm algorithm =new CaesarAlgorithm();
        algorithm = new CaesarAlgorithm();
    }

    @Test
    public void testEncryptFile() throws Exception {

        FileEncryption.encryptFile(str);
        BufferedReader buff = new BufferedReader(new FileReader("EncryptedFile.txt"));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = buff.readLine()) != null) {
            sb.append(s);
        }
        String result = sb.toString();

        Assert.assertEquals(string, result);
    }

    @Test
    public void testDecryptFile() throws Exception {

        FileEncryption.encryptFile(str);
        final String result = FileEncryption.decryptFile();

        Assert.assertEquals(str, result);
    }
}