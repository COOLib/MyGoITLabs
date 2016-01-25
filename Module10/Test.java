public class Test {
    public static void main(String[] args) {

        String s = new String("This message must be encoded in file!");

       ReadAndWrite rnw = new ReadAndWrite();

        rnw.writeHandleStringToFile();

        String s1 = rnw.readFile();
        System.out.println(s1);


    }
}
