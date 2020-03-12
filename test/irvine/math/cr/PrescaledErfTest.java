package irvine.math.cr;

import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PrescaledErfTest extends TestCase {

  public void testErf() {
    assertEquals("0.000000000000000000000000000000", CR.ZERO.erf().toString(30));
    assertEquals("0.112462916018284892203275071744", CR.valueOf(new Q(1, 10)).erf().toString(30));
    assertEquals("0.222702589210478454140139006800", CR.valueOf(new Q(2, 10)).erf().toString(30));
    assertEquals("0.328626759459127427638914047867", CR.valueOf(new Q(3, 10)).erf().toString(30));
    assertEquals("0.428392355046668455103603845320", CR.valueOf(new Q(4, 10)).erf().toString(30));
    assertEquals("0.520499877813046537682746653892", CR.valueOf(new Q(5, 10)).erf().toString(30));
    assertEquals("0.603856090847925922562622436057", CR.valueOf(new Q(6, 10)).erf().toString(30));
    assertEquals("0.677801193837418472975628809244", CR.valueOf(new Q(7, 10)).erf().toString(30));
    assertEquals("0.742100964707660486167110586503", CR.valueOf(new Q(8, 10)).erf().toString(30));
    assertEquals("0.796908212422832128518724785142", CR.valueOf(new Q(9, 10)).erf().toString(30));
    assertEquals("0.842700792949714869341220635083", CR.ONE.erf().toString(30));
    assertEquals("0.999999999998462540205571965150", CR.FIVE.erf().toString(30));
    assertEquals("0.8", CR.ONE.erf().toString(1));
  }
}
