package irvine.math.z;

import java.util.Set;

import irvine.math.function.Functions;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class InverseSigmaTest extends TestCase {

  public void test() {
    for (int k = 1; k < 150; ++k) {
      final Set<Z> inv = InverseSigma.inverseSigma(Z.valueOf(k), 1);
      for (final Z t : inv) {
        assertEquals(t.toString(), k, Functions.SIGMA.i(t));
      }
      assertEquals(inv.size(), InverseSigma.countInverseSigma(Z.valueOf(k)).intValueExact());
    }
  }
}
