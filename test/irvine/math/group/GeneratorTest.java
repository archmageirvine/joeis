package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import junit.framework.TestCase;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GeneratorTest extends TestCase {
  
  public void testAbelian() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(5);
    final Generator<Permutation<Integer>> gen = new Generator<>(g, g.zero());
    assertTrue(gen.isAbelian());
  }

  public void testAbelianZ() {
    final IntegersMod m5 = new IntegersMod(5);
    final Generator<Z> gen = new Generator<>(m5, m5.zero());
    assertTrue(gen.isAbelian());
  }

  public void testDurbin14p3() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> id = g.zero();
    for (final Permutation<Integer> p : g) {
      final Group<Permutation<Integer>> s = g.subgroup(p);
      assertEquals(s.size(), g.order(p));
      if (p.equals(id)) {
        assertEquals("{[1, 2, 3]}", s.toString());
        assertEquals(Z.ONE, s.size());
      } else {
        final String ps = p.toString();
        assertEquals("<" + ps + ">", s.toString());
        if ("[1, 3, 2]".equals(ps)) {
          assertEquals(Z.TWO, s.size());
        } else if ("[2, 3, 1]".equals(ps)) {
          assertEquals(Z.THREE, s.size());
        }
        /*
        System.out.println(p + " " + s + " " + s.size());
        for (final Permutation<Integer> sp : s) {
          System.out.println(" " + sp.cycleStructure().toString());
        }
        */
      }
    }
  }

  public void testDurbin14p4() {
    final IntegersMod g = new IntegersMod(6);
    final Z id = g.zero();
    for (final Z p : g) {
      final Group<Z> s = g.subgroup(p);
      if (p.equals(id)) {
        assertEquals("{0}", s.toString());
        assertEquals(Z.ONE, s.size());
      } else {
        final String ps = p.toString();
        assertEquals("<" + ps + ">", s.toString());
        if (Z.TWO.equals(p)) {
          assertEquals(Z.THREE, s.size());
        } else if (Z.THREE.equals(p)) {
          assertEquals(Z.TWO, s.size());
        }
        /*
        System.out.println(p + " " + s + " " + s.size());
        for (final Z sp : s) {
          System.out.println(" " + sp);
        }
        */
      }
    }
  }
  
  public void testDurbin15p3() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(6);
    final Permutation<Integer> a = g.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2}, new int[] {3, 4}, new int[] {5, 6}));
    final Permutation<Integer> b = g.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3, 6}, new int[] {2, 4, 5}));
    final Permutation<Integer> c = g.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 4, 6, 2, 3, 5}));
    final Group<Permutation<Integer>> sub1 = g.subgroup(c);
    assertTrue(sub1.contains(a));
    assertTrue(sub1.contains(b));
    @SuppressWarnings("unchecked")
    final Group<Permutation<Integer>> sub2 = g.generateSubgroup(new FiniteSet<>(a, b));
    assertTrue(sub2.contains(c));
    assertEquals(sub1.size(), sub2.size());
    for (final Permutation<Integer> e : sub1) {
      assertTrue(sub2.contains(e));
    }
    assertFalse(g.isAbelian());
    assertTrue(sub1.isAbelian());
    assertTrue(sub2.isAbelian());
    assertEquals("<[3, 4, 6, 5, 2, 1],[2, 1, 4, 3, 6, 5]>", sub2.toString());
  }
}
