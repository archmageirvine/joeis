package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;
import junit.framework.TestCase;

import java.util.Collections;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CentreTest extends TestCase {

  public void testAbelian() {
    assertTrue(Integers.SINGLETON == Integers.SINGLETON.centre(Integers.SINGLETON));
    final SymmetricGroup<Integer> g = SymmetricGroup.create(1);
    assertTrue(g == g.centre(g));
  }

  public void testNonAbelian() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> i = Permutation.create(1, 2, 4, 3);
    final Group<Permutation<Integer>> c = g.centre(new FiniteSet<>(Collections.singleton(i)));
    assertEquals("Z(S_{4})", c.toString());
    assertEquals(Z.FOUR, c.size());
    assertEquals("[1, 2, 3, 4],[1, 2, 4, 3],[2, 1, 3, 4],[2, 1, 4, 3]", StringUtils.toString(c, ","));
  }

  public void testNonAbelian2() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> i = Permutation.create(1, 2, 4, 3);
    final Group<Permutation<Integer>> centralizer = g.centralizer(i);
    final Group<Permutation<Integer>> c = g.centre(centralizer);
    assertEquals("Z(S_{4})", c.toString());
    assertEquals(Z.FOUR, c.size());
    assertEquals("[1, 2, 3, 4],[1, 2, 4, 3],[2, 1, 3, 4],[2, 1, 4, 3]", StringUtils.toString(c, ","));
    assertTrue(c.isAbelian());
    assertFalse(c.contains(Permutation.create(1))); // not an element of the parent
  }

  public void testDurbin34p7f() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final Group<Permutation<Integer>> centre = s3.centre(s3);
    assertEquals(Z.ONE, centre.size());
    assertTrue(centre.contains(s3.zero()));
  }
}
