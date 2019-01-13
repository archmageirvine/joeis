package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.set.Permutation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CentralizerTest extends TestCase {

  public void testAbelian() {
    assertTrue(Integers.SINGLETON == Integers.SINGLETON.centralizer(Z.ZERO));
    final SymmetricGroup<Integer> g = SymmetricGroup.create(1);
    assertTrue(g == g.centralizer(g.zero()));
  }

  public void testNonAbelian() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> i = Permutation.create(1, 2, 4, 3);
    final Group<Permutation<Integer>> c = g.centralizer(i);
    assertEquals("C(S_{4})", c.toString());
    assertEquals(Z.FOUR, c.size());
    assertEquals("[1, 2, 3, 4],[1, 2, 4, 3],[2, 1, 3, 4],[2, 1, 4, 3]", StringUtils.toString(c, ","));
    assertTrue(c.isAbelian());
  }
}
