package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PrimeDivisionTest extends AbstractFactorTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mF = new PrimeDivision();
  }

  public void testFactorial50() {
    final FactorSequence fs = new FactorSequence();
    Z f = Z.ONE;
    for (long i = 2L; i <= 50L; ++i) {
      f = f.multiply(Z.valueOf(i));
    }
    fs.add(f);
    mF.factor(fs);
    assertEquals(15, fs.omega());
    assertEquals(47, fs.getExponent(Z.valueOf(2L)));
    assertEquals(22, fs.getExponent(Z.valueOf(3L)));
    assertEquals(12, fs.getExponent(Z.valueOf(5L)));
    assertEquals(8, fs.getExponent(Z.valueOf(7L)));
    assertEquals(4, fs.getExponent(Z.valueOf(11L)));
    assertEquals(3, fs.getExponent(Z.valueOf(13L)));
    assertEquals(2, fs.getExponent(Z.valueOf(17L)));
    assertEquals(2, fs.getExponent(Z.valueOf(19L)));
    assertEquals(2, fs.getExponent(Z.valueOf(23L)));
    assertEquals(1, fs.getExponent(Z.valueOf(29L)));
    assertEquals(1, fs.getExponent(Z.valueOf(31L)));
    assertEquals(1, fs.getExponent(Z.valueOf(37L)));
    assertEquals(1, fs.getExponent(Z.valueOf(41L)));
    assertEquals(1, fs.getExponent(Z.valueOf(43L)));
    assertEquals(1, fs.getExponent(Z.valueOf(47L)));
  }

}
