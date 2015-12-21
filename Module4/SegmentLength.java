/**
 * Created by COOLib on 21.12.2015.
 */
public class SegmentLength {
    private double lengthOfSegment;

    public double calculateSegmentLength(int xA, int xB, int yA, int yB){
        lengthOfSegment = Math.sqrt(Math.pow((xB - xA),2) + Math.pow((yB - yA),2));
        return lengthOfSegment;
    }

    public void showCalculation(){
        System.out.println(lengthOfSegment);
    }

}
