public abstract class Flower {

    private String name;
    private String color;
    private String aroma;
    private String planted = " was planted.";
    private String growing = " is growing.";

    public Flower(String name, String color, String aroma) {
        this.name = name;
        this.color = color;
        this.aroma = aroma;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getAroma() {
        return aroma;
    }

    public void plant() {
        System.out.println(this.getName() + this.planted);
    }

    public void grow() {
        System.out.println(this.getName() + this.growing);
    }
}