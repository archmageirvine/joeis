package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.api.Group;
import irvine.math.api.Set;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.polynomial.CycleIndex;
import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SymmetricGroupTest extends TestCase {

  public void testNull() {
    final HashSet<Object> base = new HashSet<>();
    base.add(new Object());
    final FiniteSet<Object> set = new FiniteSet<>(base);
    final SymmetricGroup<Object> i = new SymmetricGroup<>(set);
    assertEquals(Z.ONE, i.size());
    final Permutation<Object> op = i.zero();
    assertTrue(i.contains(op));
    assertEquals(op, i.zero());
    assertEquals(op, i.add(op, op));
    assertEquals(op, i.negate(op));
    final Iterator<Permutation<Object>> it = i.iterator();
    assertTrue(it.hasNext());
    assertEquals(op, it.next());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    try {
      i.add(null, op);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(op, null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testNegative() {
    final FiniteSet<Z> fs = new FiniteSet<>(Z.ONE, Z.TWO, Z.THREE, Z.FOUR);
    final SymmetricGroup<Z> g = new SymmetricGroup<>(fs);
    final HashMap<Z, Z> t = new HashMap<>();
    t.put(Z.ONE, Z.TWO);
    t.put(Z.TWO, Z.FOUR);
    t.put(Z.THREE, Z.THREE);
    t.put(Z.FOUR, Z.ONE);
    final Permutation<Z> pt = new Permutation<>(fs, t);
    assertTrue(g.contains(pt));
    final Permutation<Z> nt = g.negate(pt);
    assertTrue(g.contains(nt));
    assertEquals(Z.FOUR, nt.image(Z.ONE));
    assertEquals(Z.ONE, nt.image(Z.TWO));
    assertEquals(Z.THREE, nt.image(Z.THREE));
    assertEquals(Z.TWO, nt.image(Z.FOUR));
  }

  public void testComposition() {
    final FiniteSet<Z> fs = new FiniteSet<>(Z.ONE, Z.TWO, Z.THREE, Z.FOUR);
    final SymmetricGroup<Z> g = new SymmetricGroup<>(fs);
    final HashMap<Z, Z> t = new HashMap<>();
    t.put(Z.ONE, Z.TWO);
    t.put(Z.TWO, Z.FOUR);
    t.put(Z.THREE, Z.ONE);
    t.put(Z.FOUR, Z.THREE);
    final HashMap<Z, Z> u = new HashMap<>();
    u.put(Z.ONE, Z.THREE);
    u.put(Z.TWO, Z.FOUR);
    u.put(Z.THREE, Z.ONE);
    u.put(Z.FOUR, Z.TWO);
    final Permutation<Z> s = g.add(new Permutation<>(fs, u), new Permutation<>(fs, t));
    assertTrue(g.contains(s));
    assertEquals(Z.ONE, s.image(Z.ONE));
    assertEquals(Z.THREE, s.image(Z.TWO));
    assertEquals(Z.TWO, s.image(Z.THREE));
    assertEquals(Z.FOUR, s.image(Z.FOUR));
    assertFalse(g.isAbelian());
  }

  public void testS3() {
    final FiniteSet<Z> fs = new FiniteSet<>(Z.ONE, Z.TWO, Z.THREE);
    final SymmetricGroup<Z> g = new SymmetricGroup<>(fs);
    assertEquals(Z.SIX, g.size());
    final HashSet<Permutation<Z>> seen = new HashSet<>();
    final Iterator<Permutation<Z>> it = g.iterator();
    for (int k = 0; k < 6; ++k) {
      final Permutation<Z> e = it.next();
      assertTrue(g.contains(e));
      assertFalse(seen.contains(e));
      seen.add(e);
    }
    assertFalse(it.hasNext());
    assertFalse(g.isAbelian());
    final String cg = g.cycleIndex().toString();
    assertEquals(cg, "Z(S3) = (1/3)x_3 + (1/2)x_1x_2 + (1/6)x_1^3", cg);
  }

  public void testS2() {
    final FiniteSet<Z> fs = new FiniteSet<>(Z.ONE, Z.TWO);
    final SymmetricGroup<Z> g = new SymmetricGroup<>(fs);
    assertEquals(Z.TWO, g.size());
    final Iterator<Permutation<Z>> it = g.iterator();
    for (int k = 0; k < 2; ++k) {
      assertTrue(g.contains(it.next()));
    }
    assertFalse(it.hasNext());
    assertTrue(g.isAbelian());
    final String s = g.toString();
    assertTrue("\\Sym(\\{1,2\\})".equals(s) || "\\Sym(\\{2,1\\})".equals(s));
  }

  public void testS5() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(5);
    final CycleIndex ci = g.cycleIndex();
    final String cg = ci.toString();
    assertEquals(cg, "Z(S5) = (1/5)x_5 + (1/6)x_2x_3 + (1/4)x_1x_4 + (1/8)x_1x_2^2 + (1/6)x_1^2x_3 + (1/12)x_1^3x_2 + (1/120)x_1^5", cg);
    assertEquals("S_{5}", g.toString());
    assertEquals("Z(S5)", ci.getName());
  }

  public void testCycle() {
    final Permutation<Integer> t = Permutation.create(3, 4, 1, 5, 2);
    assertEquals("[[1, 3], [2, 4, 5]]", t.cycleStructure().toString());
    final Permutation<Integer> i = Permutation.create(1, 2, 3);
    assertEquals("[[]]", i.cycleStructure().toString());
  }

  public void testDurbin6p1() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> alpha = Permutation.create(1, 4, 3, 2);
    assertEquals("[1, 4, 3, 2]", alpha.toString());
    final Permutation<Integer> beta = Permutation.create(3, 1, 4, 2);
    assertEquals("[3, 2, 4, 1]", g.add(alpha, beta).toString());
    assertEquals("[3, 1, 2, 4]", g.add(beta, alpha).toString());
    assertEquals("[1, 4, 3, 2]", g.negate(alpha).toString());
    assertEquals("[2, 4, 1, 3]", g.negate(beta).toString());
    assertEquals("[2, 3, 1, 4]", g.add(g.negate(alpha), g.negate(beta)).toString());
    assertEquals("[4, 2, 1, 3]", g.add(g.negate(beta), g.negate(alpha)).toString());
    assertEquals("[4, 2, 1, 3]", g.negate(g.add(alpha, beta)).toString());
    assertEquals("[2, 3, 1, 4]", g.negate(g.add(beta, alpha)).toString());
  }

  public void testDurbin6p2() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> alpha = Permutation.create(3, 4, 1, 2);
    final Permutation<Integer> beta = Permutation.create(4, 3, 1, 2);
    assertEquals("[1, 2, 4, 3]", g.add(alpha, beta).toString());
    assertEquals("[2, 1, 3, 4]", g.add(beta, alpha).toString());
    assertEquals("[3, 4, 1, 2]", g.negate(alpha).toString());
    assertEquals("[3, 4, 2, 1]", g.negate(beta).toString());
    assertEquals("[2, 1, 3, 4]", g.add(g.negate(alpha), g.negate(beta)).toString());
    assertEquals("[1, 2, 4, 3]", g.add(g.negate(beta), g.negate(alpha)).toString());
    assertEquals("[1, 2, 4, 3]", g.negate(g.add(alpha, beta)).toString());
    assertEquals("[2, 1, 3, 4]", g.negate(g.add(beta, alpha)).toString());
  }

  static List<List<Integer>> build(final int[]... s) {
    final ArrayList<List<Integer>> list = new ArrayList<>();
    for (final int[] a : s) {
      final List<Integer> l = new ArrayList<>(a.length);
      for (final int v : a) {
        l.add(v);
      }
      list.add(l);
    }
    return list;
  }

  public void testDurbin6p3() {
    final Permutation<Integer> t = Permutation.create(3, 5, 6, 4, 2, 1);
    assertEquals("[[1, 3, 6], [2, 5]]", t.cycleStructure().toString());
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}, new int[] {1, 3}, new int[] {1, 4}));
    assertEquals("[[1, 4, 3, 2]]", p.cycleStructure().toString());
    final SymmetricGroup<Integer> g5 = SymmetricGroup.create(5);
    final Permutation<Integer> a = g5.negate(g5.cyclesToPermutation(build(new int[]{2, 3, 5})));
    final Permutation<Integer> b = g5.cyclesToPermutation(build(new int[]{2, 4}));
    final Permutation<Integer> c = g5.negate(g5.cyclesToPermutation(build(new int[]{1, 3})));
    final Permutation<Integer> d = g5.add(g5.add(a, b), c);
    assertEquals("[[1, 3, 4, 2, 5]]", d.cycleStructure().toString());
    final Permutation<Integer> e = g5.cyclesToPermutation(build(new int[] {1, 4, 5}, new int[] {1, 2, 3, 5}, new int[] {1, 3}));
    assertEquals("[[2, 3], [4, 5]]", e.cycleStructure().toString());
  }

  public void testDurbin6p4() {
    final Permutation<Integer> t = Permutation.create(1, 6, 4, 5, 3, 2);
    assertEquals("[[2, 6], [3, 4, 5]]", t.cycleStructure().toString());
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 4}, new int[] {1, 3}, new int[] {1, 2}));
    assertEquals("[[1, 2, 3, 4]]", p.cycleStructure().toString());
    final SymmetricGroup<Integer> g5 = SymmetricGroup.create(5);
    final Permutation<Integer> a = g5.negate(g5.cyclesToPermutation(build(new int[]{1, 2, 3})));
    final Permutation<Integer> b = g5.cyclesToPermutation(build(new int[]{2, 3}, new int[]{1, 2, 3}));
    final Permutation<Integer> d = g5.add(a, b);
    assertEquals("[[2, 3]]", d.cycleStructure().toString());
    final Permutation<Integer> e = g5.cyclesToPermutation(build(new int[] {2, 4, 5}, new int[] {1, 3, 5, 4}, new int[] {1, 2, 5}));
    assertEquals("[[1, 4], [2, 5, 3]]", e.cycleStructure().toString());
  }

  private String toLaTeX(final Permutation<Integer> p) {
    final int size = p.domain().size().intValue();
    final StringBuilder sb = new StringBuilder("$\\left(\\begin{array}{")
      .append(StringUtils.rep('c', size))
      .append('}');
    for (int k = 1; k <= size; ++k) {
      sb.append(k);
      sb.append(k == size ? "\\\\" : "&");
    }
    for (int k = 1; k <= size; ++k) {
      sb.append(p.image(k));
      sb.append(k == size ? "\\end{array}\\right)$" : "&");
    }
    return sb.toString();
  }

  public void testDurbin6p5() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final StringBuilder sb = new StringBuilder();
    for (final Permutation<Integer> p : g) {
      final boolean selfInverse = p.equals(g.negate(p));
      final String cycleStructure = p.cycleStructure().toString();
      sb.append(toLaTeX(p))
        .append("&$")
        .append(cycleStructure.substring(1, cycleStructure.length() - 1))
        .append("$&")
        .append(selfInverse ? "*" : "")
        .append("\\\\");
    }
    assertEquals("$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&2&3&4\\end{array}\\right)$&$()$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&2&4&3\\end{array}\\right)$&$(3\\ 4)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&3&2&4\\end{array}\\right)$&$(2\\ 3)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&3&4&2\\end{array}\\right)$&$(2\\ 3\\ 4)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&4&2&3\\end{array}\\right)$&$(2\\ 4\\ 3)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\1&4&3&2\\end{array}\\right)$&$(2\\ 4)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&1&3&4\\end{array}\\right)$&$(1\\ 2)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&1&4&3\\end{array}\\right)$&$(1\\ 2)\\ (3\\ 4)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&3&1&4\\end{array}\\right)$&$(1\\ 2\\ 3)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&3&4&1\\end{array}\\right)$&$(1\\ 2\\ 3\\ 4)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&4&1&3\\end{array}\\right)$&$(1\\ 2\\ 4\\ 3)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\2&4&3&1\\end{array}\\right)$&$(1\\ 2\\ 4)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&1&2&4\\end{array}\\right)$&$(1\\ 3\\ 2)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&1&4&2\\end{array}\\right)$&$(1\\ 3\\ 4\\ 2)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&2&1&4\\end{array}\\right)$&$(1\\ 3)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&2&4&1\\end{array}\\right)$&$(1\\ 3\\ 4)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&4&1&2\\end{array}\\right)$&$(1\\ 3)\\ (2\\ 4)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\3&4&2&1\\end{array}\\right)$&$(1\\ 3\\ 2\\ 4)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&1&2&3\\end{array}\\right)$&$(1\\ 4\\ 3\\ 2)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&1&3&2\\end{array}\\right)$&$(1\\ 4\\ 2)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&2&1&3\\end{array}\\right)$&$(1\\ 4\\ 3)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&2&3&1\\end{array}\\right)$&$(1\\ 4)$&*\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&3&1&2\\end{array}\\right)$&$(1\\ 4\\ 2\\ 3)$&\\\\$\\left(\\begin{array}{cccc}1&2&3&4\\\\4&3&2&1\\end{array}\\right)$&$(1\\ 4)\\ (2\\ 3)$&*\\\\", sb.toString().replace(", ", "\\ ").replace('[', '(').replace(']', ')'));
  }

  public void testDurbin6p6() {
    for (int k = 1, f = 1; k <= 5; f *= k, ++k) {
      final SymmetricGroup<Integer> g = SymmetricGroup.create(k);
      int c = 0;
      for (final Permutation<Integer> p : g) {
        if (p.image(k) == k) {
          ++c;
        }
      }
      assertEquals(f, c);
    }
  }

  public void testDurbin7p1() {
    final FiniteSet<Integer> s = new FiniteSet<>(1, 2, 3, 4);
    final SymmetricGroup<Integer> g = new SymmetricGroup<>(s);
    assertFalse(g.isSubgroup(new FiniteSet<>(Collections.emptyList())));
    assertTrue(g.isSubgroup(g));
    final Iterable<Permutation<Integer>> i = Collections.singleton(g.zero());
    assertTrue(g.isSubgroup(new FiniteSet<>(i)));
    final List<List<Integer>> c134 = build(new int[] {1, 3, 4});
    final List<List<Integer>> c143 = build(new int[] {1, 4, 3});
    final Permutation<Integer> id = g.add(g.cyclesToPermutation(c134), g.cyclesToPermutation(c143));
    assertTrue(g.contains(id));
    final List<Permutation<Integer>> list = new ArrayList<>();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(c134));
    list.add(g.cyclesToPermutation(c143));
    final FiniteSet<Permutation<Integer>> subset = new FiniteSet<>(list);
    assertTrue(subset.contains(g.cyclesToPermutation(c134)));
    assertTrue(subset.contains(id));
    assertTrue(g.isSubgroup(subset));
    final List<List<Integer>> c123 = build(new int[] {1, 2, 3});
    final List<List<Integer>> c234 = build(new int[] {2, 3, 4});
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(c123));
    list.add(g.cyclesToPermutation(c234));
    assertFalse(g.isSubgroup(new FiniteSet<>(list)));
    final List<List<Integer>> c12c34 = build(new int[] {1, 2}, new int[] {3, 4});
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(c12c34));
    assertTrue(g.isSubgroup(new FiniteSet<>(list)));
    final List<List<Integer>> c1234 = build(new int[] {1, 2, 3, 4});
    final List<List<Integer>> c1432 = build(new int[] {1, 4, 3, 2});
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(c1234));
    list.add(g.cyclesToPermutation(c1432));
    assertFalse(g.isSubgroup(new FiniteSet<>(list)));
  }

  public void testDurbin7p2() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(5);
    final List<Permutation<Integer>> list = new ArrayList<>();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(build(new int[] {1, 3, 5})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 5, 3})));
    assertTrue(g.isSubgroup(new FiniteSet<>(list)));
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(build(new int[] {1, 3})));
    list.add(g.cyclesToPermutation(build(new int[] {2, 4})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 3}, new int[] {2, 4})));
    assertTrue(g.isSubgroup(new FiniteSet<>(list)));
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(build(new int[] {1, 2, 3, 4, 5})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 5, 4, 3, 2})));
    assertFalse(g.isSubgroup(new FiniteSet<>(list)));
    list.clear();
    list.add(g.zero());
    list.add(g.cyclesToPermutation(build(new int[] {1, 2, 3})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 3, 2})));
    list.add(g.cyclesToPermutation(build(new int[] {4, 5})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 2, 3}, new int[] {4, 5})));
    list.add(g.cyclesToPermutation(build(new int[] {1, 3, 2}, new int[] {4, 5})));
    assertTrue(g.isSubgroup(new FiniteSet<>(list)));
  }

  public void testDurbin7p3() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Group<Permutation<Integer>> sub1 = g.elementwiseSubgroup(new IntegerSet(1, 1));
    assertEquals("subgroup(S_{3})", sub1.toString());
    final ArrayList<Permutation<Integer>> sort = new ArrayList<>();
    for (final Permutation<Integer> p : sub1) {
      sort.add(p);
    }
    Collections.sort(sort);
    assertEquals("[1, 2, 3],[1, 3, 2]", StringUtils.toString(sort, ","));
    final ArrayList<List<List<Integer>>> cycles = new ArrayList<>();
    for (final Permutation<Integer> p : sub1.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[2, 3]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> inv1 = g.invariantSubgroup(new IntegerSet(1, 1));
    assertEquals("Z = (1/2)x_1x_2 + (1/2)x_1^3", inv1.cycleIndex().toString());
    cycles.clear();
    for (final Permutation<Integer> p : inv1.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[2, 3]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> sub23 = g.elementwiseSubgroup(new IntegerSet(2, 3));
    cycles.clear();
    for (final Permutation<Integer> p : sub23.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> inv23 = g.invariantSubgroup(new IntegerSet(2, 3));
    cycles.clear();
    for (final Permutation<Integer> p : inv23.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[2, 3]]", StringUtils.toString(cycles, ","));
  }

  public void testDurbin7p4() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Group<Permutation<Integer>> sub1 = g.elementwiseSubgroup(new IntegerSet(1, 1));
    final ArrayList<List<List<Integer>>> cycles = new ArrayList<>();
    for (final Permutation<Integer> p : sub1.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[3, 4]],[[2, 3]],[[2, 3, 4]],[[2, 4, 3]],[[2, 4]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> inv1 = g.invariantSubgroup(new IntegerSet(1, 1));
    cycles.clear();
    for (final Permutation<Integer> p : inv1.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[3, 4]],[[2, 3]],[[2, 3, 4]],[[2, 4, 3]],[[2, 4]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> sub23 = g.elementwiseSubgroup(new IntegerSet(1, 3));
    cycles.clear();
    for (final Permutation<Integer> p : sub23.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]]", StringUtils.toString(cycles, ","));
    final Group<Permutation<Integer>> inv23 = g.invariantSubgroup(new IntegerSet(1, 3));
    cycles.clear();
    for (final Permutation<Integer> p : inv23.asList()) {
      cycles.add(p.cycleStructure());
    }
    assertEquals("[[]],[[2, 3]],[[1, 2]],[[1, 2, 3]],[[1, 3, 2]],[[1, 3]]", StringUtils.toString(cycles, ","));
  }

  public void testDurbin7p14() {
    for (int j = 1; j <= 5; ++j) {
      final SymmetricGroup<Integer> g = SymmetricGroup.create(j);
      assertEquals(g, g.elementwiseSubgroup(new FiniteSet<>()));
      assertEquals(g, g.invariantSubgroup(new FiniteSet<>()));
      if (j > 1) {
        assertFalse(g.equals(g.elementwiseSubgroup(new IntegerSet(1, j))));
      }
      assertEquals(g, g.invariantSubgroup(new IntegerSet(1, j)));
      for (int k = 1; k <= j; ++k) {
        final Group<Permutation<Integer>> sub = g.elementwiseSubgroup(new IntegerSet(k, k));
        final Group<Permutation<Integer>> inv = g.invariantSubgroup(new IntegerSet(k, k));
        assertEquals(sub, inv);
      }
      for (int i = 1; i < j; ++i) {
        for (int k = 1; k <= j - i; ++k) {
          final Group<Permutation<Integer>> sub = g.elementwiseSubgroup(new IntegerSet(k, k + i));
          final Group<Permutation<Integer>> inv = g.invariantSubgroup(new IntegerSet(k, k + i));
          assertFalse(sub.equals(inv));
        }
      }
    }
  }

  public void testDurbin7p16() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(2);
    assertFalse(g.elementwiseSubgroup(new FiniteSet<>()).equals(g.elementwiseSubgroup(new IntegerSet(1, 2))));
    final Group<Permutation<Integer>> sub1 = g.elementwiseSubgroup(new IntegerSet(1, 1));
    final Group<Permutation<Integer>> sub2 = g.elementwiseSubgroup(new IntegerSet(2, 2));
    assertEquals(sub1, sub2);
    for (int j = 3; j <= 5; ++j) {
      final SymmetricGroup<Integer> f = SymmetricGroup.create(j);
      final Group<Permutation<Integer>> s1 = f.elementwiseSubgroup(new IntegerSet(1, 1));
      final Group<Permutation<Integer>> s2 = f.elementwiseSubgroup(new IntegerSet(2, j));
      assertFalse(s1.equals(s2));
      assertFalse(g.elementwiseSubgroup(new FiniteSet<>()).equals(g.elementwiseSubgroup(new IntegerSet(1, j))));
    }
    for (int j = 3; j <= 5; ++j) {
      final SymmetricGroup<Integer> f = SymmetricGroup.create(j);
      final Group<Permutation<Integer>> s1 = f.elementwiseSubgroup(new IntegerSet(1, 2));
      final Group<Permutation<Integer>> s2 = f.elementwiseSubgroup(new IntegerSet(3, j));
      assertFalse(s1.equals(s2));
    }
    final SymmetricGroup<Integer> h = SymmetricGroup.create(1);
    assertEquals(h.elementwiseSubgroup(new FiniteSet<>()), h.elementwiseSubgroup(new IntegerSet(1, 1)));
  }

  public void testDurbin7p17() {
    for (int k = 1; k < 5; ++k) {
      final SymmetricGroup<Integer> h = SymmetricGroup.create(k);
      final Group<Permutation<Integer>> empty = h.elementwiseSubgroup(new FiniteSet<>());
      assertTrue(empty.isSubset(h.elementwiseSubgroup(new IntegerSet(1, k))));
    }
    for (int j = 2; j <= 5; ++j) {
      final SymmetricGroup<Integer> f = SymmetricGroup.create(j);
      final Group<Permutation<Integer>> s1 = f.elementwiseSubgroup(new IntegerSet(1, 1));
      final Group<Permutation<Integer>> s2 = f.elementwiseSubgroup(new IntegerSet(2, j));
      assertTrue(s1.isSubset(s2));
      if (j > 2) {
        assertFalse(s2.isSubset(s1));
      }
    }
    for (int j = 3; j <= 6; ++j) {
      final SymmetricGroup<Integer> f = SymmetricGroup.create(j);
      final Group<Permutation<Integer>> s1 = f.elementwiseSubgroup(new IntegerSet(1, 2));
      final Group<Permutation<Integer>> s2 = f.elementwiseSubgroup(new IntegerSet(3, j));
      assertFalse(s1.isSubset(s2));
      if (j > 3) {
        assertFalse(s2.isSubset(s1));
      }
    }
  }

  public void testDurbin7p18() {
    final MemoryFactorial fact = MemoryFactorial.SINGLETON;
    for (int k = 1; k < 8; ++k) {
      final SymmetricGroup<Integer> h = SymmetricGroup.create(k);
      for (int j = 0; j <= k; ++j) {
        final Set<Integer> s = j == 0 ? new FiniteSet<>() : new IntegerSet(1, j);
        assertEquals(fact.factorial(k - j), h.elementwiseSubgroup(s).size());
        assertEquals(fact.factorial(k - j).multiply(fact.factorial(j)), h.invariantSubgroup(s).size());
      }
    }
  }

  public void testDurbin14p5() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}, new int[] {3, 4}));
    assertEquals(Z.TWO, g.order(p));
    final Permutation<Integer> a = g.cyclesToPermutation(build(new int[] {1, 2, 3, 4}));
    final ArrayList<Permutation<Integer>> list = new ArrayList<>();
    for (final Permutation<Integer> e : g.subgroup(a)) {
      list.add(e);
    }
    Collections.sort(list);
    assertEquals("[[1, 2, 3, 4], [2, 3, 4, 1], [3, 4, 1, 2], [4, 1, 2, 3]]", list.toString());
  }

  public void testDurbin14p6() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(5);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}, new int[] {3, 4, 5}));
    assertEquals(Z.SIX, g.order(p));
    final Permutation<Integer> a = g.cyclesToPermutation(build(new int[] {1, 2, 3, 4, 5}));
    final ArrayList<Permutation<Integer>> list = new ArrayList<>();
    for (final Permutation<Integer> e : g.subgroup(a)) {
      list.add(e);
    }
    Collections.sort(list);
    assertEquals("[[1, 2, 3, 4, 5], [2, 3, 4, 5, 1], [3, 4, 5, 1, 2], [4, 5, 1, 2, 3], [5, 1, 2, 3, 4]]", list.toString());
  }

  public void testDurbin14p15() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}));
    final Permutation<Integer> q = g.cyclesToPermutation(build(new int[] {1, 3}));
    assertEquals(Z.TWO, g.order(p));
    assertEquals(Z.TWO, g.order(q));
    final Permutation<Integer> r = g.add(p, q);
    assertEquals(Z.THREE, g.order(r));
    final Permutation<Integer> s = g.add(g.add(g.add(g.add(r, r), r), r), r);
    assertEquals("[3, 1, 2]", s.toString());
  }

  private String toString(final Set<Permutation<Integer>> set) {
    final ArrayList<String> s = new ArrayList<>();
    for (final Permutation<Integer> item : set) {
      s.add(item.cycleStructure().toString());
    }
    Collections.sort(s);
    return s.toString();
  }

  public void testDurbin15p13() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 4, 3, 2}));
    final Permutation<Integer> q = g.cyclesToPermutation(build(new int[] {2, 4}));
    @SuppressWarnings("unchecked")
    final Group<Permutation<Integer>> s = g.generateSubgroup(new FiniteSet<>(p, q));
    assertEquals(Z.EIGHT, s.size());
    assertEquals("[[[1, 2, 3, 4]], [[1, 2], [3, 4]], [[1, 3], [2, 4]], [[1, 3]], [[1, 4, 3, 2]], [[1, 4], [2, 3]], [[2, 4]], [[]]]", toString(s));
  }

  public void testDurbin16p13() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}));
    @SuppressWarnings("unchecked")
    final Group<Permutation<Integer>> h = new Subgroup<>(new FiniteSet<>(g.zero(), p), g);
    final Set<Permutation<Integer>> c0 = g.rightCoset(h, g.zero());
    assertEquals(Z.TWO, c0.size());
    assertEquals("[[[1, 2]], [[]]]", toString(c0));
    final Set<Permutation<Integer>> c1 = g.rightCoset(h, g.cyclesToPermutation(build(new int[] {1, 3})));
    assertEquals(Z.TWO, c1.size());
    assertEquals("[[[1, 2, 3]], [[1, 3]]]", toString(c1));
    final Set<Permutation<Integer>> c2 = g.rightCoset(h, g.cyclesToPermutation(build(new int[]{2, 3})));
    assertEquals(Z.TWO, c2.size());
    assertEquals("[[[1, 3, 2]], [[2, 3]]]", toString(c2));
  }

  public void testDurbin16p14() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 3}));
    final Group<Permutation<Integer>> h = g.subgroup(p);
    final Set<Permutation<Integer>> c0 = g.rightCoset(h, g.zero());
    assertEquals(Z.TWO, c0.size());
    assertEquals("[[[1, 3]], [[]]]", toString(c0));
    final Set<Permutation<Integer>> c1 = g.rightCoset(h, g.cyclesToPermutation(build(new int[] {1, 2})));
    assertEquals(Z.TWO, c1.size());
    assertEquals("[[[1, 2]], [[1, 3, 2]]]", toString(c1));
    final Set<Permutation<Integer>> c2 = g.rightCoset(h, g.cyclesToPermutation(build(new int[] {2, 3})));
    assertEquals(Z.TWO, c2.size());
    assertEquals("[[[1, 2, 3]], [[2, 3]]]", toString(c2));
    final Set<Permutation<Integer>> r0 = g.leftCoset(g.zero(), h);
    assertEquals(Z.TWO, r0.size());
    assertEquals("[[[1, 3]], [[]]]", toString(r0));
    final Set<Permutation<Integer>> r1 = g.leftCoset(g.cyclesToPermutation(build(new int[]{1, 2})), h);
    assertEquals(Z.TWO, r1.size());
    assertEquals("[[[1, 2, 3]], [[1, 2]]]", toString(r1));
    final Set<Permutation<Integer>> r2 = g.leftCoset(g.cyclesToPermutation(build(new int[]{2, 3})), h);
    assertEquals(Z.TWO, r2.size());
    assertEquals("[[[1, 3, 2]], [[2, 3]]]", toString(r2));
  }

  public void testDurbin16p15() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2, 3}));
    final Group<Permutation<Integer>> h = g.subgroup(p);
    final Set<Permutation<Integer>> c0 = g.rightCoset(h, g.zero());
    assertEquals(Z.THREE, c0.size());
    assertEquals("[[[1, 2, 3]], [[1, 3, 2]], [[]]]", toString(c0));
    final Set<Permutation<Integer>> c1 = g.rightCoset(h, g.cyclesToPermutation(build(new int[] {1, 2})));
    assertEquals(Z.THREE, c1.size());
    assertEquals("[[[1, 2]], [[1, 3]], [[2, 3]]]", toString(c1));
  }

  public void testDurbin17p1() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(3);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2}));
    assertEquals(Z.THREE, g.index(g.subgroup(p)));
  }

  public void testDurbin17p2() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> p = g.cyclesToPermutation(build(new int[] {1, 2, 3}));
    assertEquals(Z.EIGHT, g.index(g.subgroup(p)));
  }

  @SuppressWarnings("unchecked")
  public void testDurbin17p26() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Z[] divisors = Jaguar.factor(g.size()).divisors();
    final boolean[] used = new boolean[divisors.length];
    int cnt = 0;
    for (final Permutation<Integer> e : g) {
      final Group<Permutation<Integer>> s = g.subgroup(e);
      final Z o = s.size();
      for (int k = 0; k < divisors.length; ++k) {
        if (o.equals(divisors[k])) {
          if (!used[k]) {
            used[k] = true;
            ++cnt;
          }
          break;
        }
      }
    }
    for (final Permutation<Integer> e : g) {
      for (final Permutation<Integer> f : g) {
        final Group<Permutation<Integer>> s = g.generateSubgroup(new FiniteSet<>(e, f));
        final Z o = s.size();
        for (int k = 0; k < divisors.length; ++k) {
          if (o.equals(divisors[k])) {
            if (!used[k]) {
              used[k] = true;
              ++cnt;
            }
            break;
          }
        }
      }
    }
    assertEquals(divisors.length, cnt);
  }

  @SuppressWarnings("unchecked")
  static Group<Permutation<Integer>> s4Subgroup() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> e = g.cyclesToPermutation(build(new int[]{1, 2, 3}));
    final Permutation<Integer> f = g.cyclesToPermutation(build(new int[] {1, 2}, new int[] {3, 4}));
    return g.generateSubgroup(new FiniteSet<>(e, f));
  }

  public void testDurbin17p29() {
    final Group<Permutation<Integer>> s = s4Subgroup();
    assertEquals(Z.valueOf(12), s.size());
  }

  private boolean isNormal(final Group<Permutation<Integer>> group, final Group<Permutation<Integer>> s) {
    for (final Permutation<Integer> n : s) {
      for (final Permutation<Integer> g : group) {
        final Permutation<Integer> gm = group.negate(g);
        final Permutation<Integer> p = group.add(group.add(g, n), gm);
        if (!s.contains(p)) {
          return false;
        }
      }
    }
    return true;
  }

  @SuppressWarnings("unchecked")
  public void testDurbin31p15() {
    // Symmetries of the square
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Permutation<Integer> mu1 = Permutation.create(1, 2, 3, 4);
    final Permutation<Integer> mu2 = Permutation.create(2, 3, 4, 1);
    final Permutation<Integer> mu3 = Permutation.create(3, 4, 1, 2);
    final Permutation<Integer> mu5 = Permutation.create(4, 3, 2, 1);
    final Permutation<Integer> mu6 = Permutation.create(2, 1, 4, 3);
    final Permutation<Integer> mu7 = Permutation.create(1, 4, 3, 2);
    final Permutation<Integer> mu8 = Permutation.create(3, 2, 1, 4);
    final Group<Permutation<Integer>> sq = g.generateSubgroup(new FiniteSet<>(
      mu1, mu2, mu3, Permutation.create(4, 1, 2, 3), mu5, mu6, mu7, mu8
    ));
    // sq is group of square symmetries
    assertTrue(g.isSubgroup(sq));
    // Check for normal subgroups
    assertTrue(isNormal(sq, sq));
    assertTrue(isNormal(sq, sq.subgroup(mu1)));
    assertTrue(isNormal(sq, sq.subgroup(mu3)));
    assertTrue(isNormal(sq, sq.subgroup(mu2)));
    assertFalse(isNormal(sq, sq.subgroup(mu5)));
    assertFalse(isNormal(sq, sq.subgroup(mu6)));
    assertFalse(isNormal(sq, sq.subgroup(mu7)));
    assertFalse(isNormal(sq, sq.subgroup(mu8)));
    assertTrue(isNormal(sq, sq.generateSubgroup(new FiniteSet<>(mu5, mu6))));
    assertTrue(isNormal(sq, sq.generateSubgroup(new FiniteSet<>(mu7, mu8))));
    // Durbin34p7g
    final Group<Permutation<Integer>> centre = sq.centre(sq);
    assertEquals(Z.TWO, centre.size());
    assertTrue(centre.contains(mu1));
    assertTrue(centre.contains(mu3));
  }

  public void testDurbin31p22() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    assertTrue(isNormal(s3, s3));
    assertTrue(isNormal(s3, s3.subgroup(s3.zero())));
    assertFalse(isNormal(s3, s3.subgroup(Permutation.create(2, 1, 3))));
    assertFalse(isNormal(s3, s3.subgroup(Permutation.create(3, 2, 1))));
    assertTrue(isNormal(s3, s3.subgroup(Permutation.create(2, 3, 1))));
    assertFalse(isNormal(s3, s3.subgroup(Permutation.create(1, 3, 2))));
  }

  public void testDurbin34p10b() {
    final TreeSet<String> seen = new TreeSet<>();
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final Group<Permutation<Integer>> s12 = s3.subgroup(Permutation.create(2, 1, 3));
    for (final Permutation<Integer> g : s3) {
      final Permutation<Integer> gi = s3.negate(g);
      final TreeSet<String> p = new TreeSet<>();
      for (final Permutation<Integer> e : s12) {
        p.add(s3.add(s3.add(gi, e), g).toString());
      }
      seen.add(p.toString());
    }
    //System.out.println(seen);
    assertEquals("[[[1, 2, 3], [1, 3, 2]], [[1, 2, 3], [2, 1, 3]], [[1, 2, 3], [3, 2, 1]]]", seen.toString());
  }

  public void testA003190() {
    final Permutation<Integer> t = Permutation.create(1, 3, 4, 2, 6, 7, 8, 5);
    assertEquals("[[2, 3, 4], [5, 6, 7, 8]]", t.cycleStructure().toString());
    final SymmetricGroup<Integer> g = SymmetricGroup.create(8);
    Permutation<Integer> d = t;
    for (int k = 2; k <= 8; ++k) {
      d = g.add(d, t);
    }
    assertEquals("[[2, 4, 3]]", d.cycleStructure().toString());
  }

  public void testRandom() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    final Random r = new Random(42);
    final HashSet<Object> h = new HashSet<>();
    for (int k = 0; k < 300; ++k) {
      h.add(g.random(r));
    }
    assertEquals(24, h.size());
  }

  public void testCharacterTable() {
    assertEquals("[[1, -1, 1, 1, -1, -1, 1], [4, -2, 0, 1, 1, 0, -1], [5, -1, 1, -1, -1, 1, 0], [6, 0, -2, 0, 0, 0, 1], [5, 1, 1, -1, 1, -1, 0], [4, 2, 0, 1, -1, 0, -1], [1, 1, 1, 1, 1, 1, 1]]", Arrays.deepToString(SymmetricGroup.create(5).characterTable()));
  }
}
