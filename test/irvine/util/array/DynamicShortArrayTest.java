package irvine.util.array;

import java.util.ArrayList;
import java.util.Random;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * JUnit tests for the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DynamicShortArrayTest extends TestCase {

  public void testShortPrimitive() {
    final DynamicShortArray a = new DynamicShortArray();
    assertEquals(0, a.length());
    for (int i = -2; i < 0; ++i) {
      try {
        a.get(i);
        fail("Got did not exist");
      } catch (final IndexOutOfBoundsException e) {
        // ok
      }
    }
    for (int i = -2; i < 0; ++i) {
      try {
        a.set(i, (short) 42);
        fail("Got did not exist");
      } catch (final IndexOutOfBoundsException e) {
        // ok
      }
    }
    try {
      a.truncate(-1);
      fail("Negative truncate");
    } catch (final IndexOutOfBoundsException e) {
      // ok
    }
    a.truncate(5); // should do nothing
    a.truncate(0); // should do nothing
    final Random r = new Random();
    int max = -1;
    short mv = 0;
    for (int i = 0; i < 5000; ++i) {
      final int j = r.nextInt(1000000);
      short v = (short) r.nextInt();
      if (v == 0) {
        v = 1;
      }
      a.set(j, v);
      assertEquals(v, a.get(j));
      if (j >= max) {
        max = j;
        mv = v;
      }
      final int l = a.length();
      assertEquals(max + 1, l);
      assertEquals(mv, a.get(l - 1));
    }
    final int mid = a.length() / 2;
    if (mid > 1) {
      boolean c = false;
      for (int i = mid; i < a.length(); ++i) {
        if (a.get(i) != 0) {
          c = true;
          break;
        }
      }
      assertTrue(c);
      try {
        a.truncate(-1);
        fail("Negative truncate");
      } catch (final IndexOutOfBoundsException e) {
        // ok
      }
      a.truncate(mid);
      assertEquals(mid, a.length());
      for (int i = mid; i < mid + 5; ++i) {
        assertEquals(0, a.get(i));
      }
      // reinstate old length and check zeroed
      a.set(mid * 2, (short) 0xDEDE);
      assertEquals(mid * 2 + 1, a.length());
      for (int i = mid; i < a.length() - 1; ++i) {
        assertEquals(0, a.get(i));
      }
    }
  }

  public void testBoundaryTruncate() {
    final DynamicShortArray a = new DynamicShortArray();
    a.set(0xFFFF, (short) 42);
    a.set(0x10000, (short) 43);
    a.set(0x10001, (short) 44);
    a.truncate(0x10000);
    assertEquals(42, a.get(0xFFFF));
    a.set(0x10001, (short) 44);
    assertEquals(0, a.get(0x10000));
  }

  public void testBoundaryTruncateM() {
    final DynamicShortArray a = new DynamicShortArray();
    a.set(0xFFFF, (short) 42);
    a.set(0x10000, (short) 43);
    a.set(0x10001, (short) 44);
    a.truncate(0xFFFF);
    a.set(0x10001, (short) 44);
    assertEquals(0, a.get(0xFFFF));
    assertEquals(0, a.get(0x10000));
  }

  public void testBoundaryTruncateP() {
    final DynamicShortArray a = new DynamicShortArray();
    a.set(0xFFFF, (short) 42);
    a.set(0x10000, (short) 43);
    a.set(0x10001, (short) 44);
    a.truncate(0x10001);
    assertEquals(42, a.get(0xFFFF));
    assertEquals(43, a.get(0x10000));
  }

  public void testToArray() {
    final Random r = new Random();
    final DynamicShortArray d = new DynamicShortArray();
    for (int i = 0; i < 100; ++i) {
      d.set(r.nextInt(300000), (short) r.nextInt());
    }
    final short[] flat = d.toArray();
    assertEquals(d.length(), flat.length);
    for (int i = 0; i < flat.length; ++i) {
      assertEquals(d.get(i), flat[i]);
    }
  }

  public void testNastyArrayLength() {
    final DynamicShortArray m = new DynamicShortArray();
    m.set(131071, (short) 1);
    assertEquals(1, m.get(131071));
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<short[]> x = (ArrayList<short[]>) obj;
    assertEquals(2, x.size());
    assertEquals(1 << 16, x.get(0).length);
    assertEquals(1 << 16, x.get(1).length);
    m.set(131073, (short) 2);
    assertEquals(2, m.get(131073));
    assertEquals(3, x.size());
  }

  public void testNastyArrayLength2() {
    final DynamicShortArray m = new DynamicShortArray();
    m.set(0, (short) 1);
    m.set(1, (short) 1);
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<short[]> x = (ArrayList<short[]>) obj;
    assertEquals(1, x.size());
    assertEquals(1 << 16, x.get(0).length);
  }

}
