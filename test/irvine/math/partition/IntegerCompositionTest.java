package irvine.math.partition;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IntegerCompositionTest extends TestCase {

  public void testBadArgs() {
    try {
      new IntegerComposition(0, 1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      new IntegerComposition(2, 3);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void test83() {
    final IntegerComposition ip = new IntegerComposition(8, 3);
    assertTrue(Arrays.equals(new int[] {6, 1, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {5, 2, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {4, 3, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 4, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {2, 5, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 6, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {5, 1, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {4, 2, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 3, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {2, 4, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 5, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {4, 1, 3}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 2, 3}, ip.next()));
    assertTrue(Arrays.equals(new int[] {2, 3, 3}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 4, 3}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 1, 4}, ip.next()));
    assertTrue(Arrays.equals(new int[] {2, 2, 4}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 3, 4}, ip.next()));
    assertTrue(Arrays.equals(new int[] {2, 1, 5}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 2, 5}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 1, 6}, ip.next()));
    assertNull(ip.next());
  }

  public void test1() {
    final IntegerComposition ip = new IntegerComposition(1, 1);
    assertTrue(Arrays.equals(new int[] {1}, ip.next()));
    assertNull(ip.next());
  }

  public void test0() {
    final IntegerComposition ip = new IntegerComposition(1, 0);
    assertTrue(Arrays.equals(new int[0], ip.next()));
    assertNull(ip.next());
  }
}
