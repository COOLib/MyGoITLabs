import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Directory d = new Directory("Directory", new Date());

        d.addFile(new AudioFile("Audifile", 2000, new Date()));
        d.addFile(new Picture("just picture", 1000, new Date()));
        d.addFile(new TextFile("simple text", 5356, new Date()));
        d.addFile(new Picture("big picture", 40000, new Date()));

        try {
            System.out.println(d.namesOfContainedFiles());

        } catch (IllegalStateException e) {
            System.out.println("An error has occurred in the program. Size of file is too big.");
            System.out.println("Program can't show even it's name.");
        }
    }
}