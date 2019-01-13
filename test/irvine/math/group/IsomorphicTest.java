package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.q.Rationals;
import irvine.math.r.Reals;
import irvine.math.z.Integers;
import irvine.math.z.Z;

import junit.framework.TestCase;
import irvine.math.set.Permutation;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IsomorphicTest extends TestCase {

  private DirectProduct<?, ?> createProduct(final long... sizes) {
    DirectProduct<?, ?> prod = new DirectProduct<>(new IntegersMod(sizes[0]), new IntegersMod(sizes[1]));
    for (int k = 2; k < sizes.length; ++k) {
      prod = new DirectProduct<>(prod, new IntegersMod(sizes[k]));
    }
    return prod;
  }

  public void testDurbin19() {
    final Group<Z> z5 = new IntegersMod(5);
    final Group<Z> z6 = new IntegersMod(6);
    assertTrue(Isomorphic.isIsomorphic(z5, z5));
    assertFalse(Isomorphic.isIsomorphic(z5, z6));
    assertFalse(Isomorphic.isIsomorphic(createProduct(5, 2), new IntegersMod(7)));
    assertFalse(Isomorphic.isIsomorphic(z6, SymmetricGroup.create(3)));
    assertFalse(Isomorphic.isIsomorphic(createProduct(4, 2), createProduct(2, 2, 2)));
    assertFalse(Isomorphic.isIsomorphic(Integers.SINGLETON, Reals.SINGLETON));
    assertFalse(Isomorphic.isIsomorphic(Integers.SINGLETON, Rationals.SINGLETON));
    assertFalse(Isomorphic.isIsomorphic(createProduct(8, 4), createProduct(16, 2)));
  }

  public void testDurbin19p9() {
    final Group<Permutation<Integer>> s = SymmetricGroupTest.s4Subgroup();
    final DirectProduct<?, ?> h = new DirectProduct<>(SymmetricGroup.create(3), new IntegersMod(2));
    assertFalse(Isomorphic.isIsomorphic(s, h));
  }
}
