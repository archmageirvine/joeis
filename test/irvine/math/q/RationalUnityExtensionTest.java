package irvine.math.q;

import java.util.Arrays;

import irvine.math.polynomial.Polynomial;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RationalUnityExtensionTest extends TestCase {

  public void testUnity3() {
    final RationalUnityExtension q3 = new RationalUnityExtension(3);
    assertEquals("\\Q(z)", q3.toString());
    final Polynomial<Q> p = q3.create(Arrays.asList(Q.HALF, Q.ONE, Q.TWO));
    assertTrue(q3.contains(p));
    final Polynomial<Q> r = q3.add(p, p);
    assertEquals("1+2z+4z^2", r.toString());
    final Polynomial<Q> s = q3.multiply(p, p);
    assertEquals("17/4+5z+3z^2", s.toString());
    assertEquals("z^2", q3.pow(q3.x(), 20).toString());
  }
}
