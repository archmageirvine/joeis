package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitNonzeroProductTest extends TestCase {

  public void test() {
    final Function2 f = new DigitNonzeroProduct();
    assertEquals(Z.ONE, f.z(Z.ZERO));
    assertEquals(Z.FOUR, f.z(Z.FOUR));
    assertEquals(Z.EIGHT, f.z(24));
    assertEquals(Z.FOUR, f.z(401));
    assertEquals(53084160000L, f.l(5035588244943512881L));
  }
}
