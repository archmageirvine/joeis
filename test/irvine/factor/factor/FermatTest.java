package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the Fermat factoring algorithm
 *
 * @author Sean A. Irvine
 */
public class FermatTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new Fermat();
  }

  public void testPowerOf2() {
    final Fermat fermat = new Fermat();
    Z n = Z.TWO;
    for (int i = 1; i < 200; i += 3) {
      final FactorSequence fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      fermat.factor(fs, n);
      assertEquals(i, fs.getExponent(Z.TWO));
      assertEquals(1, fs.omega());
      n = n.shiftLeft(3);
    }
  }

}
