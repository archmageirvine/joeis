package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ShuffleTest extends TestCase {

  public void testShuffle0() {
    final int[] a = Shuffle.shuffle(0);
    assertEquals(0, a.length);
  }

  public void testShuffle1() {
    final int[] a = Shuffle.shuffle(1);
    assertEquals(1, a.length);
    assertEquals(0, a[0]);
  }

  public void testShuffle2() {
    final int[] a = Shuffle.shuffle(2);
    assertEquals(2, a.length);
    if (a[0] == 0) {
      assertEquals(1, a[1]);
    } else {
      assertEquals(1, a[0]);
      assertEquals(0, a[1]);
    }
  }

  public void testShuffle1Long() {
    final Object b = new Object();
    final Object[] a = {b};
    Shuffle.shuffle(a);
    assertEquals(b, a[0]);
  }

  public void testShuffle2Long() {
    final Object b = new Object();
    final Object c = new Object();
    final Object[] a = {b, c};
    Shuffle.shuffle(a);
    if (a[0] == b) {
      assertEquals(c, a[1]);
    } else {
      assertEquals(b, a[1]);
      assertEquals(c, a[0]);
    }
  }

}
