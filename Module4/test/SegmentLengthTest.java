import org.junit.Assert;

public class SegmentLengthTest {

   private final int xA = 3;
   private final int xB = 8;
   private final int yA = 4;
   private final int yB = 10;
   private final SegmentLength segmentLength = new SegmentLength();

    @org.junit.Test
    public void testCalculateSegmentLength() throws Exception {

        final double result = segmentLength.calculateSegmentLength(xA, xB, yA, yB);
        final double testResult = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));

        Assert.assertEquals(testResult,result,0.01);
    }
}