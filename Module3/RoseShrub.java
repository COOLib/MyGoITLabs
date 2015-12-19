import java.util.ArrayList;

public class RoseShrub {

    private int height;
    private int numberOfFlowers;
    private ArrayList<Rose> roses;

    public RoseShrub(int height, int number) {
        this.height = height;
        this.numberOfFlowers = number;
    }


    public int getHeight() {return height;}
    public int getNumber() {return numberOfFlowers;}

    public void plant(){}

    public void grow(){
        roses = new ArrayList<Rose>(this.numberOfFlowers);
        for(Rose rose : roses)
            roses.add(new Rose("Rose", "Red", "smells very nice"));
    }
}