import Files.File;

import java.util.ArrayList;
import java.util.List;

public class CaesarToCollection {

    private List<CaesarAlgorithm> algorithmList = new ArrayList<CaesarAlgorithm>();

    // Привожу коллекцию файлов к коллекции строк и кодирую каждую строку
    public List<String> encryptionCaesar(List<File> collection) {

        if (collection.equals(null)) {
            return null;
        }
        List<String> myList = new ArrayList<String>();
        for (File file : collection) {
            if (file == null) {
                myList.add("Null reference");
                algorithmList.add(null);
            } else {
                CaesarAlgorithm algorithm = new CaesarAlgorithm();
                algorithmList.add(algorithm);
                myList.add(algorithm.encoding(file.toString()));
            }
        }
        return myList;
    }

    // Декодирую коллекцию строк в результирующую коллекцию строк
    public List<String> decryptionCaesar(List<String> collection) {

        List<String> myList = new ArrayList<String>();
        for (int i = 0; i < collection.size(); i++) {
            CaesarAlgorithm algorithm = algorithmList.get(i);
            String s;
            if (algorithm == null){
                s = "Null reference";
            } else {
                s = algorithm.decoding(collection.get(i));
            }
            myList.add(s);
        }
        return myList;
    }
}
