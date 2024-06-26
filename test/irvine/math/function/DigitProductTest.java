package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitProductTest extends TestCase {

  public void test() {
    final Function2D f = new DigitProduct();
    assertEquals(Z.ZERO, f.z(Z.ZERO));
    assertEquals(Z.FOUR, f.z(Z.FOUR));
    assertEquals(Z.EIGHT, f.z(24));
    assertEquals(Z.ZERO, f.z(401));
    assertEquals(Z.ZERO, f.z(5035588244943512881L));
  }

  public void testDigitProduct() {
    assertEquals(0, Functions.DIGIT_PRODUCT.l(0));
    assertEquals(1, Functions.DIGIT_PRODUCT.l(1));
    assertEquals(0, Functions.DIGIT_PRODUCT.l(10));
    assertEquals(1, Functions.DIGIT_PRODUCT.l(11));
    assertEquals(2, Functions.DIGIT_PRODUCT.l(21));
    assertEquals(2, Functions.DIGIT_PRODUCT.l(12));
    assertEquals(2, Functions.DIGIT_PRODUCT.l(2));
    assertEquals(362880, Functions.DIGIT_PRODUCT.l(123456789));
    assertEquals(362880, Functions.DIGIT_PRODUCT.l(-123456789));
  }

}
