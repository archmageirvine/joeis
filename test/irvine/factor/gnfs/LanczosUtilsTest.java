package irvine.factor.gnfs;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LanczosUtilsTest extends TestCase {

  public void testCountNonZero() {
    final long[] v = new long[100];
    for (int k = 0; k < 64; ++k) {
      Arrays.fill(v, ~(1L << k));
      assertEquals(63, LanczosUtils.countNonZeroCols(v, v.length - k));
    }
    for (int k = 0; k < 64; ++k) {
      v[k] = 1L << k;
    }
    for (int k = 0; k < 64; ++k) {
      assertEquals(k, LanczosUtils.countNonZeroCols(v, k));
    }
    assertEquals(64, LanczosUtils.countNonZeroCols(new long[] {0xFFFF0000FFFF0000L, 0xFFFF0000FFFFL}, 2));
  }

  public void testGetNonZeroIndex() {
    assertEquals(-1, LanczosUtils.getFirstNonZeroIndex(new long[0], 0, 0));
    assertEquals(-1, LanczosUtils.getFirstNonZeroIndex(new long[] {-1L}, 0, -1L));
    assertEquals(0, LanczosUtils.getFirstNonZeroIndex(new long[] {-1L}, 1, -1L));
    assertEquals(1, LanczosUtils.getFirstNonZeroIndex(new long[] {2, 3}, 2, 1L));
  }

  public void testColumnAddition() {
    final long[] a = {0, 1, 2, 3};
    final long[] b = {1, 1, 1, 0};
    LanczosUtils.columnAdd(b, a, a.length, 63, 62);
    assertEquals("[2, 3, 0, 3]", Arrays.toString(a));
    assertEquals("[1, 1, 1, 0]", Arrays.toString(b)); // b should not be modified
  }

  public void testColumnSwap() {
    final long[] a = {0, 2, 1, 3, 7, 5, 6};
    LanczosUtils.columnExchange(a, a, a.length, 63, 61);
    assertEquals("[0, 2, 4, 6, 7, 5, 3]", Arrays.toString(a));
  }

  public void testIsZero() {
    assertFalse(LanczosUtils.isZero(new long[] {0, 1}));
    assertFalse(LanczosUtils.isZero(new long[] {-1}));
    assertTrue(LanczosUtils.isZero(new long[10]));
  }
}
