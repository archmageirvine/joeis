package irvine.math.z;

import java.util.Arrays;
import java.util.Random;

import junit.framework.TestCase;

/**
 * @author Sean A. Irvine
 */
public class ZUtilsTest extends TestCase {

  public void testRandom() {
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final Z b = Z.ONE.shiftLeft(r.nextInt(1024));
      final Z v = ZUtils.random(b);
      assertTrue(v.signum() >= 0);
      assertTrue(v.compareTo(b) < 0);
    }
  }

  public void testDigitCounts() {
    assertEquals("[2, 3, 3, 1, 2, 1, 1, 1, 0, 1]", Arrays.toString(ZUtils.digitCounts(new Z("123456900212147"))));
  }

  public void testToZFromString() {
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("12,-1")));
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("12 -1")));
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("12, -1")));
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("[12,-1]")));
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("[  12,-1]")));
    assertEquals("[12, -1]", Arrays.toString(ZUtils.toZ("(12, -1 )")));
    assertEquals("[12, -1, 42, 0]", Arrays.toString(ZUtils.toZ("{12, -1, 42,  0}")));
    assertEquals("[12, -1, 42, 0]", Arrays.toString(ZUtils.toZ("{12 -1 42  0}")));
  }

  public void testCRT() {
    assertEquals(Z.EIGHT, ZUtils.chineseRemainderTheorem(new Z[] {Z.ZERO, Z.THREE}, new Z[] {Z.TWO, Z.FIVE}));
  }
}
