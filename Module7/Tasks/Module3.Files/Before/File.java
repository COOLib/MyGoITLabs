import java.util.Date;

public abstract class File {

     /*Here, instead of creating a String and output to the console in each subclass,
      You can call it from a superclass
     */

    private String name;
    private int size;
    private Date date;

    public File(String name, int size, Date date) {
        this.name = name;
        this.size = size;
        this.date = date;
    }

    public String getName() {return name;}
    public int getSize() {return size;}
    public Date getDate() {return date;}

    public abstract void open();
    public abstract void close();
}