import Files.*;
import Flowers.*;
import MusicShop.*;
import MusicShop.MusicInstrument;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Set<File> set = new HashSet<File>();

        set.add(new AudioFile("AudioFile", 24500, new Date()));
        set.add(new AudioFile("AudioFile2", 200, new Date()));
        set.add(new TextFile("TextFile", 5000, new Date()));
        set.add(new Picture("Picture", 150000, new Date()));
        set.add(new Picture("Picture2", 1000, new Date()));

        //  MyCollectionPrinter.printingOfFiles(set);

        System.out.println();

        ArrayList<File> files = new ArrayList<File>();

        files.add(new AudioFile("AudioFile", 24500, new Date()));
        files.add(new AudioFile("AudioFile2", 200, new Date()));
        files.add(new TextFile("TextFile", 5000, new Date()));
        files.add(new Picture("Picture", 150000, new Date()));
        files.add(new Picture("Picture2", 1000, new Date()));

        //MyCollectionPrinter.printingOfFiles(files);

        System.out.println();

        ArrayList<Flower> flowers = new ArrayList<Flower>();

        flowers.add(new Astra("Astra", "Colored", "smells nice"));
        flowers.add(new Tulip("Tulip", "Red", "nice smell"));
        flowers.add(new Daisy("Daisy", "White", "funny smell"));
        flowers.add(new Rose("Rose", "Red", "smells very nice"));
        flowers.add(new Astra("Astra", "Colored", "smells nice"));

        //MyCollectionPrinter.printingOfFlowers(flowers);

        List<MusicInstrument> instrumentsList = new LinkedList<MusicInstrument>();

        instrumentsList.add(new Guitar("Guitar", "liric", 20, 50));
        instrumentsList.add(new Piano("Piano", "classic", 100, 100));
        instrumentsList.add(new Piano("Piano", "powerfull", 100, 100));
        instrumentsList.add(new Pipe("", "loud", 80, 40));

        MyCollectionPrinter.printingOfInstruments(instrumentsList);


    }
}
