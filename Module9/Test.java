import Files.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        CaesarAlgorithm algorithm = new CaesarAlgorithm();
        MyIntCharStringTransformer transform = new MyIntCharStringTransformer();
        CaesarAlgorithm algorithm1 = new CaesarAlgorithm();
        MyIntCharStringTransformer transform1 = new MyIntCharStringTransformer();

        File file = new AudioFile("My File", 200, new Date());
        File file1 = new TextFile("Text File", 1200, new Date());

        String fileString = file.toString();
        String fileString1 = file1.toString();

        String enc = algorithm.encoding(fileString);
        System.out.println(enc);

        String enc1 = algorithm1.encoding(fileString1);
        System.out.println(enc1);
        System.out.println();

        System.out.println(algorithm.decoding(enc));
        System.out.println(algorithm1.decoding(enc1));

        System.out.println();



        List<File> list = new ArrayList<File>();

        list.add(new AudioFile("My File", 200, new Date()));
        list.add(new TextFile("Text File", 1200, new Date()));
        list.add(new Picture("My Picture", 14200, new Date()));
        list.add(null);

        CaesarToCollection toCollection = new CaesarToCollection();

        List<String> encryptCollection = toCollection.encryptionCaesar(list);

        for (String myFile : encryptCollection){
            System.out.println(myFile);
        }
        System.out.println();

        List<String> decryptCollection = toCollection.decryptionCaesar(encryptCollection);

        for (String myString : decryptCollection){
            System.out.println(myString);
        }

    }

}
