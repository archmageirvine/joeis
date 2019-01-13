package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StruveTest extends TestCase {

  public void testStruve() {
    // tests v=1/2
    for (double x = 0.0; x < 15.0; x += 0.01) {
      assertEqualsLocal((Math.sqrt(2.0) / Math.sqrt(x * Math.PI)) * (1.0 - Math.cos(x)), Struve.struve(0.5, x), 1E-6);
    }
  }

  public void testKnownValuesFromAbramowitzStegunAndMaple() {
    assertEquals(0.118743, Struve.struve(0, 10), 1E-6);
    assertEquals(-0.433107, Struve.struve(-1, 4), 1E-6);
    assertEquals(0.240694, Struve.struve(-2, 4), 1E-6);
    assertEquals(0.152624, Struve.struve(-3, 4), 1E-6);
    assertEquals(-0.439789, Struve.struve(-4,  4), 1E-6);
    assertEquals(-8.24933, Struve.struve(-8, 4), 1E-5);
    assertEquals(1.2486751, Struve.struve(2, 4), 1E-6);
    assertEquals(0.0036733, Struve.struve(8, 4), 1E-5);
    assertEquals(0.0007935728801, Struve.struve(9, 4), 1E-7);
    assertEquals(0.0001544763075, Struve.struve(10, 4), 1E-7);
    assertEquals(-6.387375962, Struve.struve(-2, 0.1), 1E-7);
    assertEquals(0.1229944544, Struve.struve(-2, 30), 1E-4);
    assertTrue(Double.isNaN(Struve.struve(-2, 32)));
  }
}
