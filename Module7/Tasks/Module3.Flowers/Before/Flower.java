public abstract class Flower {

 /* Here, instead of creating a String and output to the console in each subclass,
      You can call it from a superclass
     */

    private String name;
    private String color;
    private String aroma;

    public Flower(String name, String color, String aroma) {
        this.name = name;
        this.color = color;
        this.aroma = aroma;
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public String getAroma() {return aroma;}

    public abstract void plant();
    public abstract void grow();
}