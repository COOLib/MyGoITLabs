import java.util.Date;

public abstract class File {

     /* Здесь, вместо создания строки и вывода в консоль в каждом подклассе,
     можно вызывать её из суперкласса
     */

    private String name;
    private int size;
    private Date date;
    private String opened = new String(" file is opened.");
    private String closed = new String(" file is closed.");

    public File(String name, int size, Date date) {
        this.name = name;
        this.size = size;
        this.date = date;
    }

    public String getName() {return name;}
    public int getSize() {return size;}
    public Date getDate() {return date;}

    public void open(){
        System.out.println(this.getName() + this.opened + this.getDate());
    }
    public void close(){
        System.out.println(this.getName() + this.closed + this.getDate());
    }
}