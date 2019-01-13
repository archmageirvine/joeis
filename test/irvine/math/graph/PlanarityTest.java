package irvine.math.graph;

import irvine.math.z.Z;
import irvine.oeis.a003.A003094;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PlanarityTest extends TestCase {

  public void testLauExample() {
    final int n = 7;
    final int[] nodei = {1, 5, 2, 7, 1, 3, 5, 7, 4, 1, 1};
    final int[] nodej = {5, 2, 4, 4, 7, 5, 6, 3, 6, 4, 2};
    assertTrue(new Planarity().isPlanar(n, nodei.length, nodei, nodej));
  }

  public void testK3() {
    final int[] nodei = {1, 2, 3};
    final int[] nodej = {2, 3, 1};
    assertTrue(new Planarity().isPlanar(3, nodei.length, nodei, nodej));
  }

  public void testK4() {
    final int[] nodei = {1, 1, 1, 2, 2, 3};
    final int[] nodej = {2, 3, 4, 3, 4, 4};
    assertTrue(new Planarity().isPlanar(4, nodei.length, nodei, nodej));
  }

  public void testK5() {
    final int[] nodei = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4};
    final int[] nodej = {2, 3, 4, 5, 3, 4, 5, 4, 5, 5};
    assertFalse(new Planarity().isPlanar(5, nodei.length, nodei, nodej));
  }

  public void testC5() {
    final int[] nodei = {1, 2, 3, 4, 5};
    final int[] nodej = {2, 3, 4, 5, 1};
    assertTrue(new Planarity().isPlanar(5, nodei.length, nodei, nodej));
  }

  public void testK33() {
    final int n = 6;
    final int[] nodei = {1, 1, 1, 2, 2, 2, 3, 3, 3};
    final int[] nodej = {4, 5, 6, 4, 5, 6, 4, 5, 6};
    assertFalse(new Planarity().isPlanar(n, nodei.length, nodei, nodej));
  }

  public void testCount() {
    final A003094 seq = new A003094();
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.TWO, seq.next());
    assertEquals(Z.SIX, seq.next());
    assertEquals(Z.valueOf(20), seq.next());
    assertEquals(Z.valueOf(99), seq.next());
    assertEquals(Z.valueOf(646), seq.next());
    assertEquals(Z.valueOf(5974), seq.next());
  }

}
