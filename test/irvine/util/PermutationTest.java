package irvine.util;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PermutationTest extends TestCase {

  public void test() {
    for (int k = 0, f = 1; k < 5; ++k, f *= k) {
      final Permutation p = new Permutation(k);
      int c = 0;
      while (p.next() != null) {
        ++c;
      }
      assertEquals(f, c);
    }
  }

  public void test1() {
    final Permutation p = new Permutation(1);
    assertEquals("[0]", Arrays.toString(p.next()));
    assertNull(p.next());
  }

  public void test2() {
    final Permutation p = new Permutation(2);
    assertEquals("[0, 1]", Arrays.toString(p.next()));
    assertEquals("[1, 0]", Arrays.toString(p.next()));
    assertNull(p.next());
  }

  public void test3() {
    final Permutation p = new Permutation(3);
    assertEquals("[0, 1, 2]", Arrays.toString(p.next()));
    assertEquals("[0, 2, 1]", Arrays.toString(p.next()));
    assertEquals("[1, 0, 2]", Arrays.toString(p.next()));
    assertEquals("[1, 2, 0]", Arrays.toString(p.next()));
    assertEquals("[2, 0, 1]", Arrays.toString(p.next()));
    assertEquals("[2, 1, 0]", Arrays.toString(p.next()));
    assertNull(p.next());
  }

  public void testAA() {
    final Permutation p = new Permutation(new int[] {1, 1});
    assertEquals("[1, 1]", Arrays.toString(p.next()));
    assertNull(p.next());
  }

  public void testAAB() {
    final Permutation p = new Permutation(new int[] {1, 2, 1});
    assertEquals("[1, 1, 2]", Arrays.toString(p.next()));
    assertEquals("[1, 2, 1]", Arrays.toString(p.next()));
    assertEquals("[2, 1, 1]", Arrays.toString(p.next()));
    assertNull(p.next());
  }
}
