package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitProductTest extends TestCase {

  public void test() {
    final Function2 f = new DigitProduct();
    assertEquals(Z.ZERO, f.z(Z.ZERO));
    assertEquals(Z.FOUR, f.z(Z.FOUR));
    assertEquals(Z.EIGHT, f.z(24));
    assertEquals(Z.ZERO, f.z(401));
    assertEquals(Z.ZERO, f.z(5035588244943512881L));
  }
}
