package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class QuadraticSieveTest extends TestCase {

  public void test1() {
    final QuadraticSieve qs = new QuadraticSieve();
    final FactorSequence fs = qs.factorize(new Z("5437594367338124311187537"));
    assertEquals(2, fs.omega());
    assertEquals(1, fs.getExponent(Z.valueOf(234235342543L)));
    assertEquals(1, fs.getExponent(Z.valueOf(23214235342559L)));
  }
}
