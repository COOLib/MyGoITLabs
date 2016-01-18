import Files.File;
import Flowers.Flower;
import MusicShop.MusicInstrument;

import java.util.Collection;

/**
 * Created by COOLib on 18.01.2016.
 */
public class MyCollectionPrinter {

    public static void printingOfFiles(Collection<File> collection) {

        System.out.printf("%14s%10s%10s", "File name" + " | ", "Size" + " | ", "Date");
        System.out.println();
        int firstColumn = 14;
        int secondColumn = 10;
        for (File file : collection) {
            int k = firstColumn + secondColumn + file.getDate().toString().length();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < k; i++) {
                if (i == (firstColumn - 2) || i == (firstColumn + secondColumn - 2)) {
                    builder.append("+");
                } else {
                    builder.append("-");
                }
            }
            System.out.println(builder);
            System.out.printf("%14s%10s", file.getName() + " | ", file.getSize() + " | ");
            System.out.println(file.getDate().toString());
        }
    }

    public static void printingOfFlowers(Collection<Flower> collection) {

        System.out.printf("%14s%10s%10s", "Flower name" + " | ", "Color" + " | ", "Smell");
        System.out.println();
        int firstColumn = 14;
        int secondColumn = 10;
        int x = 0;
        int m = 0;
        for (Flower flower : collection) {
            m++;
            if (m == 1) {
                int k = firstColumn + secondColumn + flower.getAroma().length();
                x = k;
                for (Flower flower1 : collection) {
                    int n = firstColumn + secondColumn + flower1.getAroma().length();
                    if (k < n) {
                        x = n;
                    }
                }
            }
        }
        for (Flower flower : collection) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < x; i++) {
                if (i == (firstColumn - 2) || i == (firstColumn + secondColumn - 2)) {
                    builder.append("+");
                } else {
                    builder.append("-");
                }
            }
            System.out.println(builder);
            System.out.printf("%14s%10s", flower.getName() + " | ", flower.getColor() + " | ");
            System.out.println(flower.getAroma());
        }
    }

    public static void printingOfInstruments(Collection<MusicInstrument> instruments) {
        System.out.printf("%14s%14s%10s%10s", "Inst  name" + " | ", "Style" + " | ", "Size" + " | ", "Weight");
        System.out.println();
        int firstColumn = 14;
        int secondColumn = 14;
        int thirdColumn = 10;
        int fourthColumn = 10;
        int x = firstColumn + secondColumn + thirdColumn + fourthColumn;
        for (MusicInstrument inst : instruments) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < x; i++) {
                if (i == (firstColumn - 2) || i == (firstColumn + secondColumn - 2) || i == (firstColumn + secondColumn + thirdColumn - 2)) {
                    builder.append("+");
                } else {
                    builder.append("-");
                }
            }
            System.out.println(builder);
            System.out.printf("%14s%14s%10s%10s", inst.getName() + " | ", inst.getStyle() + " | ", inst.getSize() + " | ", inst.getWeight());
            System.out.println();
        }
    }

}
