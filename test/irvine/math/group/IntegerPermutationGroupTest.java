package irvine.math.group;

import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerPermutationGroupTest extends TestCase {

  public void test() {
    final IntegerPermutationGroup g = new IntegerPermutationGroup(4, new FiniteSet<>(IntegerPermutation.createFromOneBase(2, 1, 4, 3)), false);
    assertEquals("<[1, 0, 3, 2]>", g.toString());
    assertEquals(Z.valueOf(2), g.size());
    assertEquals("[0, 1, 2, 3]", g.zero().toString());
    assertTrue(g.isAbelian());
    assertTrue(g.isSimple());
    assertTrue(g.contains(g.zero()));
  }
}
