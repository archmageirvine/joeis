package irvine.math.group;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DirectProductTest extends TestCase {
  
  public void testNonAbelian() {
    final IntegersMod m4 = new IntegersMod(4);
    final SymmetricGroup<Integer> s4 = SymmetricGroup.create(4);
    assertFalse(new DirectProduct<>(m4, s4).isAbelian());
    assertFalse(new DirectProduct<>(s4, m4).isAbelian());
  }

  public void testInfiniteAbelian() {
    final IntegersMod m4 = new IntegersMod(4);
    final DirectProduct<Z, Z> left = new DirectProduct<>(Integers.SINGLETON, m4);
    assertNull(left.size());
    assertNull(left.order(new Pair<>(Z.ONE, Z.ONE)));
    final DirectProduct<Z, Z> right = new DirectProduct<>(m4, Integers.SINGLETON);
    assertNull(right.size());
    assertNull(right.order(new Pair<>(Z.ONE, Z.ONE)));
    assertEquals(m4.order(Z.TWO), new DirectProduct<>(m4, m4).order(new Pair<>(Z.TWO, Z.TWO)));
  }

  public void testDurbin15p7() {
    final IntegersMod m4 = new IntegersMod(4);
    final IntegersMod m7 = new IntegersMod(7);
    assertEquals(Z.valueOf(28), new DirectProduct<>(m4, m7).size());
  }

  public void testDurbin15p8() {
    final SymmetricGroup<Integer> s4 = SymmetricGroup.create(4);
    assertEquals(Z.valueOf(24 * 24), new DirectProduct<>(s4, s4).size());
  }

  public void testDurbin15p9() {
    final IntegersMod m4 = new IntegersMod(4);
    final SymmetricGroup<Integer> s4 = SymmetricGroup.create(4);
    final DirectProduct<Z, Permutation<Integer>> g = new DirectProduct<>(m4, s4);
    final Pair<Z, Permutation<Integer>> a = new Pair<>(Z.TWO, s4.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2, 3})));
    final Pair<Z, Permutation<Integer>> b = new Pair<>(Z.ONE, s4.cyclesToPermutation(SymmetricGroupTest.build(new int[] {2, 4})));
    final Pair<Z, Permutation<Integer>> c = new Pair<>(Z.TWO, s4.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2, 3})));
    assertEquals("(1,[4, 2, 3, 1])", g.add(c, g.add(b, g.negate(a))).toString());
  }

  private String toString(final Pair<Z, Permutation<Integer>> element) {
    final String perm = element.right().cycleStructure().toString().replace(", ", "\\ ").replace('[', '(').replace(']', ')');
    return '(' + element.left().toString() + ',' + perm.substring(1, perm.length() - 1) + ')';
  }

  public void testDurbin15p11() {
    final IntegersMod z3 = new IntegersMod(3);
    final SymmetricGroup<Integer> s2 = SymmetricGroup.create(2);
    final DirectProduct<Z, Permutation<Integer>> s = new DirectProduct<>(z3, s2);
    assertEquals(Z.SIX, s.size());
    final StringBuilder sb = new StringBuilder();
    for (final Pair<Z, Permutation<Integer>> a : s) {
      sb.append(toString(a));
      for (final Pair<Z, Permutation<Integer>> b : s) {
        final Pair<Z, Permutation<Integer>> c = s.add(a, b);
        sb.append('&').append(toString(c));
      }
      sb.append("\\\\");
    }
    assertEquals("(0,())&(0,())&(0,(1\\ 2))&(1,())&(1,(1\\ 2))&(2,())&(2,(1\\ 2))\\\\(0,(1\\ 2))&(0,(1\\ 2))&(0,())&(1,(1\\ 2))&(1,())&(2,(1\\ 2))&(2,())\\\\(1,())&(1,())&(1,(1\\ 2))&(2,())&(2,(1\\ 2))&(0,())&(0,(1\\ 2))\\\\(1,(1\\ 2))&(1,(1\\ 2))&(1,())&(2,(1\\ 2))&(2,())&(0,(1\\ 2))&(0,())\\\\(2,())&(2,())&(2,(1\\ 2))&(0,())&(0,(1\\ 2))&(1,())&(1,(1\\ 2))\\\\(2,(1\\ 2))&(2,(1\\ 2))&(2,())&(0,(1\\ 2))&(0,())&(1,(1\\ 2))&(1,())\\\\", sb.toString());
    assertTrue(s.isAbelian());
    assertTrue(s.isCyclic());
  }

  public void testDurbin15p12() {
    final IntegersMod z2 = new IntegersMod(2);
    final IntegersMod z3 = new IntegersMod(3);
    final DirectProduct<Z, Z> s = new DirectProduct<>(z2, z3);
    assertEquals(Z.SIX, s.size());
    final StringBuilder sb = new StringBuilder();
    for (final Pair<Z, Z> a : s) {
      sb.append(a);
      for (final Pair<Z, Z> b : s) {
        final Pair<Z, Z> c = s.add(a, b);
        sb.append('&').append(c);
      }
      sb.append("\\\\");
    }
    assertEquals("(0,0)&(0,0)&(0,1)&(0,2)&(1,0)&(1,1)&(1,2)\\\\(0,1)&(0,1)&(0,2)&(0,0)&(1,1)&(1,2)&(1,0)\\\\(0,2)&(0,2)&(0,0)&(0,1)&(1,2)&(1,0)&(1,1)\\\\(1,0)&(1,0)&(1,1)&(1,2)&(0,0)&(0,1)&(0,2)\\\\(1,1)&(1,1)&(1,2)&(1,0)&(0,1)&(0,2)&(0,0)\\\\(1,2)&(1,2)&(1,0)&(1,1)&(0,2)&(0,0)&(0,1)\\\\", sb.toString());
    assertTrue(s.isAbelian());
    assertTrue(s.isCyclic());
    assertEquals("\\Z(2)\\times\\Z(3)", s.toString());
    assertTrue(s.contains(new Pair<>(Z.ONE, Z.ONE)));
    assertFalse(s.contains(new Pair<>(Z.TWO, Z.ONE)));
    assertFalse(s.contains(new Pair<>(Z.ONE, Z.THREE)));
  }

  private String toString2(final Pair<Permutation<Integer>, Z> element) {
    final String perm = element.left().cycleStructure().toString().replace(", ", "\\ ").replace('[', '(').replace(']', ')');
    return "$(" + perm.substring(1, perm.length() - 1) + ",[" + element.right() + "])$";
  }

  private String dump(final Set<Pair<Permutation<Integer>, Z>> s) {
    final ArrayList<String> list = new ArrayList<>();
    for (final Pair<Permutation<Integer>, Z> a : s) {
      list.add(toString2(a));
    }
    Collections.sort(list);
    return list.toString();
  }

  public void testDurbin15p21() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final IntegersMod z2 = new IntegersMod(2);
    final DirectProduct<Permutation<Integer>, Z> s = new DirectProduct<>(s3, z2);
    assertEquals("[$((),[0])$, $((),[1])$, $((1\\ 2),[0])$, $((1\\ 2),[1])$, $((1\\ 2\\ 3),[0])$, $((1\\ 2\\ 3),[1])$, $((1\\ 3),[0])$, $((1\\ 3),[1])$, $((1\\ 3\\ 2),[0])$, $((1\\ 3\\ 2),[1])$, $((2\\ 3),[0])$, $((2\\ 3),[1])$]", dump(s));
    final Pair<Permutation<Integer>, Z> a = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2})), Z.ONE);
    assertEquals("[$((),[0])$, $((1\\ 2),[1])$]", dump(s.subgroup(a)));
    final Pair<Permutation<Integer>, Z> b = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2, 3})), Z.ONE);
    assertEquals("[$((),[0])$, $((),[1])$, $((1\\ 2\\ 3),[0])$, $((1\\ 2\\ 3),[1])$, $((1\\ 3\\ 2),[0])$, $((1\\ 3\\ 2),[1])$]", dump(s.subgroup(b)));
  }

  private String dump22(final Set<Pair<Z, Z>> s) {
    final ArrayList<String> list = new ArrayList<>();
    for (final Pair<Z, Z> a : s) {
      list.add("$([" + a.left() + "],[" + a.right() + "])$");
    }
    Collections.sort(list);
    return list.toString();
  }

  public void testDurbin15p22() {
    final IntegersMod z4 = new IntegersMod(4);
    final IntegersMod z8 = new IntegersMod(8);
    final DirectProduct<Z, Z> s = new DirectProduct<>(z4, z8);
    assertEquals("[$([0],[0])$, $([0],[4])$, $([2],[2])$, $([2],[6])$]", dump22(s.subgroup(new Pair<>(Z.TWO, Z.TWO))));
    final DirectProduct<Z, Z> t = new DirectProduct<>(z4.subgroup(Z.TWO), z8.subgroup(Z.TWO));
    assertEquals("[$([0],[0])$, $([0],[2])$, $([0],[4])$, $([0],[6])$, $([2],[0])$, $([2],[2])$, $([2],[4])$, $([2],[6])$]", dump22(t));
  }

  public void testDurbin16p17() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final IntegersMod z2 = new IntegersMod(2);
    final DirectProduct<Permutation<Integer>, Z> s = new DirectProduct<>(s3, z2);
    final Pair<Permutation<Integer>, Z> a = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2})), Z.ONE);
    final Group<Pair<Permutation<Integer>, Z>> cross = s.subgroup(a);
    assertEquals(Z.valueOf(12), s.size());
    assertEquals("[$((),[0])$, $((1\\ 2),[1])$]", dump(s.leftCoset(s.zero(), cross)));
    final Pair<Permutation<Integer>, Z> b = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2})), Z.ZERO);
    assertEquals("[$((),[1])$, $((1\\ 2),[0])$]", dump(s.leftCoset(b, cross)));
    final Pair<Permutation<Integer>, Z> c = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3})), Z.ZERO);
    assertEquals("[$((1\\ 3),[0])$, $((1\\ 3\\ 2),[1])$]", dump(s.leftCoset(c, cross)));
    final Pair<Permutation<Integer>, Z> d = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {2, 3})), Z.ZERO);
    assertEquals("[$((1\\ 2\\ 3),[1])$, $((2\\ 3),[0])$]", dump(s.leftCoset(d, cross)));
  }

  public void testDurbin16p18() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final IntegersMod z2 = new IntegersMod(2);
    final DirectProduct<Permutation<Integer>, Z> s = new DirectProduct<>(s3, z2);
    final Permutation<Integer> a = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2}));
    final DirectProduct<Permutation<Integer>, Z> cross = new DirectProduct<>(s3.subgroup(a), z2.subgroup(Z.ONE));
    assertEquals(Z.FOUR, cross.size());
    assertEquals("[$((),[0])$, $((),[1])$, $((1\\ 2),[0])$, $((1\\ 2),[1])$]", dump(s.rightCoset(cross, s.zero())));
    final Pair<Permutation<Integer>, Z> b = new Pair<>(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3})), Z.ZERO);
    assertEquals("[$((1\\ 2\\ 3),[0])$, $((1\\ 2\\ 3),[1])$, $((1\\ 3),[0])$, $((1\\ 3),[1])$]", dump(s.rightCoset(cross, b)));
  }

  private String toString(final Group<Pair<Z, Z>> group) {
    final ArrayList<String> list = new ArrayList<>();
    for (final Pair<Z, Z> e : group) {
      list.add(e.toString());
    }
    Collections.sort(list);
    return list.toString();
  }

  @SuppressWarnings("unchecked")
  public void testDurbin17p14() {
    final IntegersMod z3 = new IntegersMod(3);
    final DirectProduct<Z, Z> s = new DirectProduct<>(z3, z3);
    // Question asks for all subgroups of s
    assertEquals(Z.NINE, s.size());
    // Lagrange implies order of subgroup is 1, 3, or 9.
    // Cases of 1 and 9 are obvious
    // Enumerate all the rest
    final HashSet<String> subs = new HashSet<>();
    for (final Pair<Z, Z> a : s) {
      for (final Pair<Z, Z> b : s) {
        for (final Pair<Z, Z> c : s) {
          final FiniteSet<Pair<Z, Z>> subset = new FiniteSet<>(a, b, c);
          subs.add(toString(s.generateSubgroup(subset)));
        }
      }
    }
    assertEquals(6, subs.size());
    //System.out.println(subs);
  }

  @SuppressWarnings("unchecked")
  public void testDurbin17p16() {
    final DirectProduct<Z, Z> s = new DirectProduct<>(new IntegersMod(2), new IntegersMod(4));
    // Question asks for all subgroups of s
    assertEquals(Z.EIGHT, s.size());
    // Lagrange implies order of subgroup is 1, 2, 4, 8.
    // Cases of 1 and 8 are obvious
    // Enumerate all the rest
    final HashSet<String> subs = new HashSet<>();
    for (final Pair<Z, Z> a : s) {
      for (final Pair<Z, Z> b : s) {
        subs.add(toString(s.generateSubgroup(new FiniteSet<>(a, b))));
        for (final Pair<Z, Z> c : s) {
          for (final Pair<Z, Z> d : s) {
            subs.add(toString(s.generateSubgroup(new FiniteSet<>(a, b, c, d))));
          }
        }
      }
    }
    assertEquals(8, subs.size());
    //System.out.println(subs);
  }

  public void testDurbin17p23() {
    assertEquals(Z.TWO, new DirectProduct<>(new IntegersMod(2), new IntegersMod(2)).exponent());
    assertEquals(Z.FOUR, new DirectProduct<>(new IntegersMod(2), new IntegersMod(4)).exponent());
    assertEquals(Z.SIX, new DirectProduct<>(new IntegersMod(2), new IntegersMod(3)).exponent());
  }
}
