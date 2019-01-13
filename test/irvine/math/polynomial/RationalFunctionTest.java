package irvine.math.polynomial;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RationalFunctionTest extends TestCase {

  public void test() {
    final Polynomial<Z> num = Polynomial.create(1, 2);
    final Polynomial<Z> den = Polynomial.create(3, -1);
    assertEquals("(1+2x)/(3-x)", new RationalFunction<>(num, den).toString());
  }
}
