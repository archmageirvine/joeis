package irvine.util.array;

import java.util.Arrays;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Jonathan Purvis
 * @author Sean A. Irvine
 */
public class SortTest extends TestCase {

  /**
   * Checks that an array is sorted (strictly increasing).
   * @param a primary array
   * @return <code>true</code> if the array is sorted, <code>false</code> otherwise
   */
  public static boolean isSortedStrict(final long[] a) {
    for (int ii = 0; ii < a.length - 1; ++ii) {
      if (a[ii] >= a[ii + 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks that an array is sorted.
   * @param a primary array
   * @return <code>true</code> if the array is sorted, <code>false</code> otherwise
   */
  public static boolean isSorted(final long[] a) {
    for (int ii = 0; ii < a.length - 1; ++ii) {
      if (a[ii] > a[ii + 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Checks that an array is sorted.
   * @param a primary array
   * @return <code>true</code> if the array is sorted, <code>false</code> otherwise
   */
  public static boolean isSorted(final double[] a) {
    for (int ii = 0; ii < a.length - 1; ++ii) {
      if (a[ii] > a[ii + 1]) {
        return false;
      }
    }
    return true;
  }

  public void testSort() {
    final long[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    final long[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    Sort.sort(a, b);
    assertTrue(isSortedStrict(a));
    assertTrue(isSortedStrict(b));
    final long[] c = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    Sort.sort(c, b);
    assertTrue(Arrays.equals(new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, c));
    assertTrue(Arrays.equals(new long[] {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, b));
  }

  public void testSortIllegal() {
    try {
      Sort.sort(new long[1], new long[2]);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testSortAtRandomPairs() {
    final Random r = new Random();
    for (int i = 0; i < 5; ++i) {
      final int l = r.nextInt(1000);
      final long[] keys = new long[l];
      final long[] pairs = new long[l];
      // init arrays to be the same
      for (int j = 0; j < l; ++j) {
        keys[j] = r.nextLong();
        pairs[j] = keys[j];
      }
      Sort.sort(keys, pairs);
      assertTrue(isSorted(keys));
      assertTrue(isSorted(pairs));
      assertTrue(Arrays.equals(keys, pairs));
    }
  }

  public void testSortAtRandomPairsD() {
    final Random r = new Random();
    for (int i = 0; i < 5; ++i) {
      final int l = r.nextInt(1000);
      final double[] keys = new double[l];
      final long[] pairs = new long[l];
      // init arrays to be the same
      for (int j = 0; j < l; ++j) {
        keys[j] = r.nextDouble();
        pairs[j] = j;
      }
      Sort.sort(keys, pairs);
      assertTrue(isSorted(keys));
      long s = 0;
      for (int j = 0; j < l; ++j) {
        s += pairs[j];
      }
      assertEquals(l * (l - 1) / 2, s);
    }
  }

  public void testMed() {
    final long[] a = {0, 16, 256, 409};
    assertEquals(2, Sort.med3(a, 1, 2, 3));
    assertEquals(2, Sort.med3(a, 1, 3, 2));
    assertEquals(2, Sort.med3(a, 2, 1, 3));
    assertEquals(2, Sort.med3(a, 2, 3, 1));
    assertEquals(2, Sort.med3(a, 3, 1, 2));
    assertEquals(2, Sort.med3(a, 3, 2, 1));
  }

  public void testMedD() {
    final double[] a = {0, 16, 256, 409};
    assertEquals(2, Sort.med3(a, 1, 2, 3));
    assertEquals(2, Sort.med3(a, 1, 3, 2));
    assertEquals(2, Sort.med3(a, 2, 1, 3));
    assertEquals(2, Sort.med3(a, 2, 3, 1));
    assertEquals(2, Sort.med3(a, 3, 1, 2));
    assertEquals(2, Sort.med3(a, 3, 2, 1));
  }

}
