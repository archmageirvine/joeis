package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ErfTest extends TestCase {

  public void testErf() {
    assertEquals("0.000000000000000000000000000000", CrFunctions.ERF.cr(CR.ZERO).toString(30));
    assertEquals("0.112462916018284892203275071744", CrFunctions.ERF.cr(CR.valueOf(new Q(1, 10))).toString(30));
    assertEquals("0.222702589210478454140139006800", CrFunctions.ERF.cr(CR.valueOf(new Q(2, 10))).toString(30));
    assertEquals("0.328626759459127427638914047867", CrFunctions.ERF.cr(CR.valueOf(new Q(3, 10))).toString(30));
    assertEquals("0.428392355046668455103603845320", CrFunctions.ERF.cr(CR.valueOf(new Q(4, 10))).toString(30));
    assertEquals("0.520499877813046537682746653892", CrFunctions.ERF.cr(CR.valueOf(new Q(5, 10))).toString(30));
    assertEquals("0.603856090847925922562622436057", CrFunctions.ERF.cr(CR.valueOf(new Q(6, 10))).toString(30));
    assertEquals("0.677801193837418472975628809244", CrFunctions.ERF.cr(CR.valueOf(new Q(7, 10))).toString(30));
    assertEquals("0.742100964707660486167110586503", CrFunctions.ERF.cr(CR.valueOf(new Q(8, 10))).toString(30));
    assertEquals("0.796908212422832128518724785142", CrFunctions.ERF.cr(CR.valueOf(new Q(9, 10))).toString(30));
    assertEquals("0.842700792949714869341220635083", CrFunctions.ERF.cr(CR.ONE).toString(30));
    assertEquals("0.999999999998462540205571965150", CrFunctions.ERF.cr(CR.FIVE).toString(30));
    assertEquals("0.8", CrFunctions.ERF.cr(CR.ONE).toString(1));
  }
}
