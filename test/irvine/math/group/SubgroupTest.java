package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.z.Z;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SubgroupTest extends TestCase {

  public void test() {
    final IntegersMod z6 = new IntegersMod(6);
    final Group<Z> s = new Subgroup<>(new FiniteSet<>(Z.ZERO, Z.TWO, Z.FOUR), z6);
    assertTrue(s.isAbelian());
    assertEquals(z6.zero(), s.zero());
    assertEquals(Z.THREE, s.size());
    assertEquals(z6.isCyclic(), s.isCyclic());
    assertTrue(s.contains(Z.ZERO));
    assertFalse(s.contains(Z.ONE));
    assertEquals(Z.FOUR, s.add(Z.TWO, Z.TWO));
    assertEquals(Z.TWO, s.negate(Z.FOUR));
    assertEquals("subgroup(\\Z(6))", s.toString());
  }

  public void testAbelianSubsetOfNonAbelian() {
    final SymmetricGroup<Integer> s6 = SymmetricGroup.create(6);
    @SuppressWarnings("unchecked")
    final Group<Permutation<Integer>> s = new Subgroup<>(new FiniteSet<>(s6.zero()), s6);
    assertFalse(s6.isAbelian());
    assertTrue(s.isAbelian());
    assertEquals(s6.zero(), s.zero());
    final Group<Permutation<Integer>> copy = new Subgroup<>(s6, s6);
    assertFalse(s6.isAbelian());
    assertFalse(copy.isAbelian());
    assertEquals("Z = (1/6)x_6 + (1/18)x_3^2 + (1/8)x_2x_4 + (1/48)x_2^3 + (1/5)x_1x_5 + (1/6)x_1x_2x_3 + (1/8)x_1^2x_4 + (1/16)x_1^2x_2^2 + (1/18)x_1^3x_3 + (1/48)x_1^4x_2 + (1/720)x_1^6", copy.cycleIndex().toString());
  }

}
