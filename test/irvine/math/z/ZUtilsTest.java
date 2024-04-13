package irvine.math.z;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import junit.framework.TestCase;

/**
 * @author Sean A. Irvine
 */
public class ZUtilsTest extends TestCase {

  public void testMax() {
    assertEquals(Z.ONE, ZUtils.max(Z.ZERO, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, ZUtils.max(Z.ONE, Z.ZERO, Z.NEG_ONE, Z.ONE));
    assertEquals(Z.ONE, ZUtils.max(Z.ONE));
    assertNull(ZUtils.max());
  }

  public void testMin() {
    assertEquals(Z.ZERO, ZUtils.min(Z.ZERO, Z.ZERO, Z.TWO, Z.ONE));
    assertEquals(Z.ONE, ZUtils.min(Z.TWO, Z.TWO, Z.TWO, Z.ONE));
    assertEquals(Z.ONE, ZUtils.min(Z.ONE));
    assertNull(ZUtils.min());
  }

  public void testMinCollection() {
    assertNull(ZUtils.min(Collections.emptyList()));
    assertEquals(Z.ONE, ZUtils.min(Collections.singleton(Z.ONE)));
    assertEquals(Z.ONE, ZUtils.min(Arrays.asList(Z.ONE, Z.TWO)));
    assertEquals(Z.ONE, ZUtils.min(Arrays.asList(Z.TWO, Z.FIVE, Z.ONE)));
  }

  public void testPrimorial() {
    assertEquals(Z.ONE, ZUtils.primorial(1));
    assertEquals(Z.TWO, ZUtils.primorial(2));
    assertEquals(Z.SIX, ZUtils.primorial(3));
    assertEquals(Z.SIX, ZUtils.primorial(4));
    assertEquals(Z.valueOf(30), ZUtils.primorial(5));
    assertEquals(Z.valueOf(30), ZUtils.primorial(6));
  }

  public void testOrd() {
    assertEquals(3, ZUtils.valuation(Z.EIGHT, Z.TWO));
    assertEquals(1, ZUtils.valuation(Z.SEVEN, Z.SEVEN));
    assertEquals(1, ZUtils.valuation(Z.TEN, Z.FIVE));
    assertEquals(0, ZUtils.valuation(Z.FOUR, Z.THREE));
  }

  public void testDescribe() {
    assertEquals(Z.valueOf(12), ZUtils.describe(Z.TWO));
    assertEquals(Z.valueOf(22), ZUtils.describe(Z.valueOf(22)));
  }

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
