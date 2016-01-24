import caesar.caesarEncryption.CaesarAlgorithm;

import java.io.*;

public class FileEncryption {

    private static CaesarAlgorithm algorithm;
    private static File f;


    public static void encryptFile(String str) throws IOException {

        f = new File("EncryptedFile.txt");
        try {
            if (!f.exists()) f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (final PrintWriter writer = new PrintWriter(f.getAbsoluteFile())) {
            int i;
            algorithm = new CaesarAlgorithm();
            String myString = algorithm.encoding(str);

            writer.print(myString);
        }
    }

    public static String decryptFile() throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        if (!f.exists()) {
            throw new FileNotFoundException();
        }

        try {
            BufferedReader buff = new BufferedReader(new FileReader(f.getCanonicalFile()));
            try {
                String s;
                while ((s = buff.readLine()) != null) {
                    sb.append(algorithm.decoding(s));
                }
            } finally {
                buff.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
