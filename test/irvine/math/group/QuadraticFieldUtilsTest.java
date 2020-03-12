package irvine.math.group;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QuadraticFieldUtilsTest extends TestCase {

  public void testFundamentalUnit() {
    assertEquals("[1, 1]", Arrays.toString(QuadraticFieldUtils.fundamentalUnitPair(Z.FIVE)));
    assertEquals(CR.PHI, QuadraticFieldUtils.fundamentalUnit(Z.FIVE));
    assertEquals(Z.NEG_ONE, QuadraticFieldUtils.fundamentalUnitNorm(Z.FIVE));

    assertEquals("[2, 1]", Arrays.toString(QuadraticFieldUtils.fundamentalUnitPair(Z.EIGHT)));
    assertEquals("[3, 1]", Arrays.toString(QuadraticFieldUtils.fundamentalUnitPair(Z.valueOf(13))));
    assertEquals("[8, 2]", Arrays.toString(QuadraticFieldUtils.fundamentalUnitPair(Z.valueOf(17))));

    assertEquals("[46, 8]", Arrays.toString(QuadraticFieldUtils.fundamentalUnitPair(Z.valueOf(33))));
    assertEquals(CR.valueOf(33).sqrt().multiply(CR.FOUR).add(CR.valueOf(23)), QuadraticFieldUtils.fundamentalUnit(Z.valueOf(33)));

    try {
      QuadraticFieldUtils.fundamentalUnit(Z.ZERO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testClassNumber() {
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.FIVE));
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.EIGHT));
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.valueOf(12)));
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.valueOf(13)));
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.valueOf(17)));
    assertEquals(1, QuadraticFieldUtils.classNumber(Z.valueOf(21)));
    assertEquals(2, QuadraticFieldUtils.classNumber(Z.valueOf(40)));
    assertEquals(57, QuadraticFieldUtils.classNumber(Z.valueOf(41617)));
    assertEquals(63, QuadraticFieldUtils.classNumber(Z.valueOf(57601)));
  }

  public void testRegulator() {
    assertEquals(0.4812, QuadraticFieldUtils.regulator(Z.FIVE).doubleValue(), 1e-3);
    assertEquals(0.8814, QuadraticFieldUtils.regulator(Z.EIGHT).doubleValue(), 1e-3);
    assertEquals(1.317, QuadraticFieldUtils.regulator(Z.valueOf(12)).doubleValue(), 1e-3);
    assertEquals(1.567, QuadraticFieldUtils.regulator(Z.valueOf(21)).doubleValue(), 1e-3);
    assertEquals(1.818, QuadraticFieldUtils.regulator(Z.valueOf(40)).doubleValue(), 1e-3);
  }
}
