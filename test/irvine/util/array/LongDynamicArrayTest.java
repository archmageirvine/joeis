package irvine.util.array;

import java.util.Random;

import junit.framework.TestCase;

/**
 * JUnit tests for the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LongDynamicArrayTest extends TestCase {

  public void testStringClass() {
    final LongDynamicArray<String> la = new LongDynamicArray<>();
    assertEquals(0, la.length());
    for (int i = -2; i < 0; ++i) {
      try {
        la.get(i);
        fail("Got did not exist");
      } catch (final IndexOutOfBoundsException e) {
        // ok
      }
    }
    try {
      la.truncate(-1);
      fail("Negative truncate");
    } catch (final IndexOutOfBoundsException e) {
      // ok
    }
    la.truncate(5); // should do nothing
    la.truncate(0); // should do nothing
    final Random r = new Random();
    int max = -1;
    String mv = null;
    for (int i = 0; i < 5000; ++i) {
      final int j = r.nextInt(1000000);
      final String v = String.valueOf(r.nextInt(1000000));
      la.set(j, v);
      assertEquals(v, la.get(j));
      if (j >= max) {
        max = j;
        mv = v;
      }
      final long l = la.length();
      assertEquals(max + 1, l);
      assertEquals(mv, la.get(l - 1));
    }
    final long mid = la.length() / 2;
    if (mid > 1) {
      boolean c = false;
      for (long i = mid; i < la.length(); ++i) {
        if (la.get(i) != null) {
          c = true;
          break;
        }
      }
      assertTrue(c);
      try {
        la.truncate(-1);
        fail("Negative truncate");
      } catch (final IndexOutOfBoundsException e) {
        // ok
      }
      la.truncate(mid);
      assertEquals(mid, la.length());
      for (long i = mid; i < mid + 5; ++i) {
        assertNull(la.get(i));
      }
      // reinstate old length and check zeroed
      la.set(mid * 2, "DEADBEEF");
      assertEquals(mid * 2 + 1, la.length());
      for (long i = mid; i < la.length() - 1; ++i) {
        assertEquals(null, la.get(i));
      }
    }
    la.set(1 << 21, "hi");
    assertEquals("hi", la.get(1 << 21));
  }

  public void testBoundaryTruncate() {
    final long ll = 1L << 20;
    final LongDynamicArray<String> a = new LongDynamicArray<>();
    a.set(ll - 1, "42");
    a.set(ll, "43");
    a.set(ll + 1, "44");
    a.truncate(ll);
    assertEquals("42", a.get(ll - 1));
    a.set(ll + 1, "44");
    assertEquals(null, a.get(ll));
  }

  public void testBoundaryTruncateM() {
    final long ll = 1L << 20;
    final LongDynamicArray<String> a = new LongDynamicArray<>();
    a.set(ll - 1, "42");
    a.set(ll, "43");
    a.set(ll + 1, "44");
    a.truncate(ll - 1);
    a.set(ll + 1, "44");
    assertEquals(null, a.get(ll - 1));
    assertEquals(null, a.get(ll));
  }

  public void testBoundaryTruncateP() {
    final long ll = 1L << 20;
    final LongDynamicArray<String> a = new LongDynamicArray<>();
    a.set(ll - 1, "42");
    a.set(ll, "43");
    a.set(ll + 1, "44");
    a.truncate(ll + 1);
    assertEquals("42", a.get(ll - 1));
    assertEquals("43", a.get(ll));
  }
}
