import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Directory d = new Directory("Directory", new Date());

        d.addFile(new AudioFile("Audiofile", 2000, new Date()));
        d.addFile(new Picture("just picture", 1000, new Date()));
        d.addFile(new TextFile("simple text", 5356, new Date()));
        d.addFile(new Picture("big picture", 40000, new Date()));


        d.namesOfContainedFiles();
    }
}