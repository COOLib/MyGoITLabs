public abstract class Flower {

private String name;
private String color;
private String aroma;

public Flower(String name, String color, String aroma) {
this.name = name;
this.color = color;
this.aroma = aroma;
}

public String getName() {return name;}
public int getColor() {return color;}
public int getAroma() {return aroma;}

public abstract void plant();
public abstract void grow();
}