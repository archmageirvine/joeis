package irvine.util.array;

import java.util.ArrayList;
import java.util.Random;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LongDynamicByteArrayTest extends TestCase {

  public void testBytePrimitive() {
    final LongDynamicByteArray la = new LongDynamicByteArray();
    assertEquals(0, la.length());
    for (long i = -2; i < 0; ++i) {
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
    byte mv = 0;
    for (int i = 0; i < 5000; ++i) {
      final int j = r.nextInt(1000000);
      final byte v = (byte) (1 + r.nextInt(255));
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
        if (la.get(i) != 0) {
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
        assertEquals(0, la.get(i));
      }
      // reinstate old length and check zeroed
      la.set(mid * 2, (byte) 0xDE);
      assertEquals(mid * 2 + 1, la.length());
      for (long i = mid; i < la.length() - 1; ++i) {
        assertEquals(0, la.get(i));
      }
    }
    la.set(1 << 21, (byte) 42);
    assertEquals(42, la.get(1 << 21));
  }

  public void testBoundaryTruncate() {
    final long ll = 1L << 20;
    final LongDynamicByteArray a = new LongDynamicByteArray();
    a.set(ll - 1, (byte) 42);
    a.set(ll, (byte) 43);
    a.set(ll + 1, (byte) 44);
    a.truncate(ll);
    assertEquals(42, a.get(ll - 1));
    a.set(ll + 1, (byte) 44);
    assertEquals(0, a.get(ll));
  }

  public void testBoundaryTruncateM() {
    final long ll = 1L << 20;
    final LongDynamicByteArray a = new LongDynamicByteArray();
    a.set(ll - 1, (byte) 42);
    a.set(ll, (byte) 43);
    a.set(ll + 1, (byte) 44);
    a.truncate(ll - 1);
    a.set(ll + 1, (byte) 44);
    assertEquals(0, a.get(ll - 1));
    assertEquals(0, a.get(ll));
  }

  public void testBoundaryTruncateP() {
    final long ll = 1L << 20;
    final LongDynamicByteArray a = new LongDynamicByteArray();
    a.set(ll - 1, (byte) 42);
    a.set(ll, (byte) 43);
    a.set(ll + 1, (byte) 44);
    a.truncate(ll + 1);
    assertEquals(42, a.get(ll - 1));
    assertEquals(43, a.get(ll));
  }

  public void testNastyArrayLength() {
    final LongDynamicByteArray m = new LongDynamicByteArray();
    m.set((1 << 21) - 1, (byte) 1);
    assertEquals(1, m.get((1 << 21) - 1));
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<Object> x = (ArrayList<Object>) obj;
    assertEquals(2, x.size());
    assertEquals(1 << 20, ((byte[]) x.get(0)).length);
    assertEquals(1 << 20, ((byte[]) x.get(1)).length);
    m.set((1 << 21) + 1, (byte) 2);
    assertEquals(2, m.get((1 << 21) + 1));
    assertEquals(3, x.size());
  }

  public void testNastyArrayLength2() {
    final LongDynamicByteArray m = new LongDynamicByteArray();
    m.set(0, (byte) 1);
    m.set(1, (byte) 1);
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<Object> x = (ArrayList<Object>) obj;
    assertEquals(1, x.size());
    assertEquals(1 << 20, ((byte[]) x.get(0)).length);
  }

}
