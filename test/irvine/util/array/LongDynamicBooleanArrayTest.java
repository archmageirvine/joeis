package irvine.util.array;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LongDynamicBooleanArrayTest extends TestCase {

  private long slowNextClear(final LongDynamicBooleanArray a, final long q) {
    long t = q;
    while (a.isSet(++t)) {
      // do nothing
    }
    return t;
  }

  public void testNextClear() {
    final LongDynamicBooleanArray a = new LongDynamicBooleanArray();
    final Random r = new Random();
    final int size = 1000;
    for (int k = 0; k < size; ++k) {
      if (r.nextBoolean()) {
        a.set(k);
      }
    }
    for (int k = 0; k < 500; ++k) {
      final int p = r.nextInt(size);
      final long q = a.nextClearBit(p);
      assertEquals(slowNextClear(a, p), q);
      assertFalse(a.isSet(q));
      a.set(q); // gradually fill up more of array as test runs
      assertTrue(a.isSet(q));
    }
  }

  private long slowNextSet(final LongDynamicBooleanArray a, final long q) {
    long t = q;
    while (++t < a.length() && !a.isSet(t)) {
      // do nothing
    }
    return t >= a.length() ? -1 : t;
  }

  public void testNextSet() {
    final LongDynamicBooleanArray a = new LongDynamicBooleanArray();
    final Random r = new Random();
    final int size = 1000;
    for (int k = 0; k < size; ++k) {
      if (r.nextBoolean()) {
        a.set(k);
      }
    }
    for (int k = 0; k < 500; ++k) {
      final int p = r.nextInt(size);
      final long q = a.nextSetBit(p);
      assertEquals("len=" + a.length(), slowNextSet(a, p), q);
      if (q != -1) {
        assertTrue(a.isSet(q));
        a.clear(q); // gradually zero more of array as test runs
        assertFalse(a.isSet(q));
      }
    }
  }

  private long slowPrevSet(final LongDynamicBooleanArray a, final long q) {
    long t = q;
    while (--t >= 0 && !a.isSet(t)) {
      // do nothing
    }
    return t;
  }

  public void testPrevSet() {
    final LongDynamicBooleanArray a = new LongDynamicBooleanArray();
    final Random r = new Random();
    final int size = 1000;
    for (int k = 0; k < size; ++k) {
      if (r.nextBoolean()) {
        a.set(k);
      }
    }
    for (int k = 0; k < 500; ++k) {
      final int p = r.nextInt(size);
      final long q = a.prevSetBit(p);
      assertEquals(slowPrevSet(a, p), q);
      if (q != -1) {
        assertTrue(a.isSet(q));
        a.clear(q); // gradually zero more of array as test runs
        assertFalse(a.isSet(q));
      }
    }
  }

  private long slowPrevClear(final LongDynamicBooleanArray a, final long q) {
    long t = q;
    while (--t >= 0 && a.isSet(t)) {
      // do nothing
    }
    return t;
  }

  public void testPrevClear() {
    final LongDynamicBooleanArray a = new LongDynamicBooleanArray();
    final Random r = new Random();
    final int size = 1000;
    for (int k = 0; k < size; ++k) {
      if (r.nextBoolean()) {
        a.set(k);
      }
    }
    for (int k = 0; k < 500; ++k) {
      final int p = r.nextInt(size);
      final long q = a.prevClearBit(p);
      assertEquals(slowPrevClear(a, p), q);
      if (q != -1) {
        assertFalse(a.isSet(q));
        a.set(q); // gradually set more of array as test runs
        assertTrue(a.isSet(q));
      }
    }
  }
}
