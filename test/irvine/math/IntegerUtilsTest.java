package irvine.math;

import java.util.Arrays;
import java.util.Random;

import irvine.math.function.Functions;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerUtilsTest extends TestCase {

  public void testLg() {
    assertEquals(0, IntegerUtils.log2(0));
    for (int i = 1, j = 1; j >= 0; ++i, j <<= 1) {
      assertEquals(i, IntegerUtils.log2(j));
      assertEquals(i, IntegerUtils.log2(-j));
    }
    for (int i = 2, j = 2; j >= 0; ++i, j <<= 1) {
      assertEquals(i, IntegerUtils.log2(j + 1));
      assertEquals(i, IntegerUtils.log2(-j - 1));
    }
    assertEquals(31, IntegerUtils.log2(0x7FFFFFFF));
  }

  public void testCharToValue() {
    for (int k = 0, j = '0'; j <= '9'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    for (int k = 10, j = 'a'; j <= 'z'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    for (int k = 10, j = 'A'; j <= 'Z'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    assertEquals(-1, IntegerUtils.charToValue('\0'));
    assertEquals(-1, IntegerUtils.charToValue(' '));
    assertEquals(-1, IntegerUtils.charToValue('\u0001'));
    assertEquals(-1, IntegerUtils.charToValue('@'));
    assertEquals(-1, IntegerUtils.charToValue('('));
    assertEquals(-1, IntegerUtils.charToValue('/'));
    assertEquals(-1, IntegerUtils.charToValue(':'));
    assertEquals(-1, IntegerUtils.charToValue('='));
    assertEquals(-1, IntegerUtils.charToValue('['));
    assertEquals(-1, IntegerUtils.charToValue('`'));
    assertEquals(-1, IntegerUtils.charToValue('{'));
    assertEquals(-1, IntegerUtils.charToValue('\uFFFF'));
    assertEquals(-1, IntegerUtils.charToValue('\u007F'));
    assertEquals(-1, IntegerUtils.charToValue('\u0080'));
  }

  public void testModPow() {
    try {
      IntegerUtils.modPow(2, 1, 0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      IntegerUtils.modPow(2, 1, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, IntegerUtils.modPow(2, 2, 1));
    assertEquals(1, IntegerUtils.modPow(1, 2, 42));
    assertEquals(1, IntegerUtils.modPow(1, 3, 42));
    assertEquals(1, IntegerUtils.modPow(43, 2, 42));
    assertEquals(1, IntegerUtils.modPow(0, 0, 42));
    assertEquals(1, IntegerUtils.modPow(1, 0, 42));
    assertEquals(1, IntegerUtils.modPow(42, 0, 42));
    assertEquals(0, IntegerUtils.modPow(0, 1, 42));
    assertEquals(0, IntegerUtils.modPow(0, 42, 42));
    assertEquals(0, IntegerUtils.modPow(0, 42, 42));
    assertEquals(0, IntegerUtils.modPow(42, 42, 42));
    assertEquals(12, IntegerUtils.modPow(12, 1, 42));
    assertEquals(12, IntegerUtils.modPow(54, 1, 42));
    final int limit = Functions.SQRT.i(Integer.MAX_VALUE);
    assertEquals(8, IntegerUtils.modPow(2, 3, limit));
    assertEquals(8, IntegerUtils.modPow(2, 3, 9));
    assertEquals(4313, IntegerUtils.modPow(37, 3, limit));
    assertEquals(36073, IntegerUtils.modPow(37, 76543, limit));
    try {
      IntegerUtils.modPow(37, 76543, limit + 1);
      fail();
    } catch (final IllegalArgumentException ex) {
      // ok
    }
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final int a = r.nextInt();
      final int n = r.nextInt(limit);
      if (a < 0) {
        try {
          IntegerUtils.modPow(a, 2, n);
          fail();
        } catch (final IllegalArgumentException ex) {
          // ok
        }
      } else if (n != 0) {
        final int y = a % n;
        assertEquals((y * y) % n, IntegerUtils.modPow(a, 2, n));
      }
    }
  }

  public void testLcm() {
    assertEquals(2, Functions.LCM.i(2, 2));
    assertEquals(6, Functions.LCM.i(2, 3));
    assertEquals(24, Functions.LCM.i(12, 8));
  }

  public void testIdentity() {
    final int[] a = new int[3];
    IntegerUtils.identity(a);
    assertEquals("[0, 1, 2]", Arrays.toString(a));
  }

  public void testToArray() {
    assertEquals("[42, 1]", Arrays.toString(IntegerUtils.toArray(Arrays.asList(42, 1))));
  }

}
