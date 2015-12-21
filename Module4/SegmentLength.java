/**
 * Created by COOLib on 21.12.2015.
 */
public class SegmentLength {

    public double calculateSegmentLength(int xA, int xB, int yA, int yB) {
        double lengthOfSegment;
        lengthOfSegment = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        return lengthOfSegment;
    }
}
