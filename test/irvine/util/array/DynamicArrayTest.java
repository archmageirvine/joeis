package irvine.util.array;

import java.util.ArrayList;
import java.util.Random;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class DynamicArrayTest extends TestCase {

  public void testStringClass() {
    final DynamicArray<String> a = new DynamicArray<>();
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
        a.set(i, "42");
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
    String mv = null;
    for (int i = 0; i < 5000; ++i) {
      final int j = r.nextInt(1000000);
      final String v = String.valueOf(r.nextInt(1000000));
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
        if (a.get(i) != null) {
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
        assertNull(a.get(i));
      }
      // reinstate old length and check zeroed
      a.set(mid * 2, "DEADBEEF");
      assertEquals(mid * 2 + 1, a.length());
      for (int i = mid; i < a.length() - 1; ++i) {
        assertEquals(null, a.get(i));
      }
    }
  }

  public void testBoundaryTruncate() {
    final DynamicArray<String> a = new DynamicArray<>();
    a.set(0xFFFF, "42");
    a.set(0x10000, "43");
    a.set(0x10001, "44");
    a.truncate(0x10000);
    assertEquals("42", a.get(0xFFFF));
    a.set(0x10001, "44");
    assertEquals(null, a.get(0x10000));
  }

  public void testBoundaryTruncateM() {
    final DynamicArray<String> a = new DynamicArray<>();
    a.set(0xFFFF, "42");
    a.set(0x10000, "43");
    a.set(0x10001, "44");
    a.truncate(0xFFFF);
    a.set(0x10001, "44");
    assertEquals(null, a.get(0xFFFF));
    assertEquals(null, a.get(0x10000));
  }

  public void testBoundaryTruncateP() {
    final DynamicArray<String> a = new DynamicArray<>();
    a.set(0xFFFF, "42");
    a.set(0x10000, "43");
    a.set(0x10001, "44");
    a.truncate(0x10001);
    assertEquals("42", a.get(0xFFFF));
    assertEquals("43", a.get(0x10000));
  }

  public void testNastyArrayLength() {
    final DynamicArray<String> m = new DynamicArray<>();
    m.set(131071, "1");
    assertEquals("1", m.get(131071));
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<Object> x = (ArrayList<Object>) obj;
    assertEquals(2, x.size());
    assertEquals(1 << 16, ((Object[]) x.get(0)).length);
    assertEquals(1 << 16, ((Object[]) x.get(1)).length);
    m.set(131073, "2");
    assertEquals("2", m.get(131073));
    assertEquals(3, x.size());
  }

  public void testNastyArrayLength2() {
    final DynamicArray<String> m = new DynamicArray<>();
    m.set(0, "1");
    m.set(1, "1");
    final Object obj = TestUtils.getField("mChunks", m);
    assertTrue(obj instanceof ArrayList);
    @SuppressWarnings("unchecked")
    final ArrayList<Object> x = (ArrayList<Object>) obj;
    assertEquals(1, x.size());
    assertEquals(1 << 16, ((Object[]) x.get(0)).length);
  }

}
