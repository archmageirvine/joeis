package irvine.math.group;

import java.util.HashSet;
import java.util.Random;

import irvine.math.api.Group;
import irvine.math.api.Operation;
import irvine.math.api.Set;
import irvine.math.c.ComplexField;
import irvine.math.q.Rationals;
import irvine.math.set.EffortException;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyGroupTest extends TestCase {

  public void test() {
    final Integers g = Integers.SINGLETON;
    assertEquals(Z.FOUR, g.signedAdd(true, Z.TWO, Z.TWO));
    assertEquals(Z.ZERO, g.signedAdd(false, Z.TWO, Z.TWO));
    try {
      g.cycleIndex();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    assertEquals(g, g.centralizer(g.zero()));
    assertEquals(g, g.centre(new FiniteSet<>(g.zero())));
    assertTrue(g.isSubgroup(g));
    assertTrue(g.isSubgroup(g.centralizer(g.zero())));
    assertFalse(g.isSubgroup(new FiniteSet<>()));
    try {
      g.isSubgroup(new IntegerMultiples(2));
      fail();
    } catch (final EffortException e) {
      // ok
    }
    assertFalse(new IntegerMultiples(15).isSubgroup(new IntegerMultiples(5)));
  }

  public void testMod() {
    final IntegersMod g = new IntegersMod(6);
    assertEquals(g, g.centralizer(g.zero()));
    assertEquals(g, g.centre(new FiniteSet<>(g.zero())));
    assertTrue(g.isSubgroup(g));
    assertTrue(g.isSubgroup(g.centralizer(g.zero())));
    assertFalse(g.isSubgroup(new FiniteSet<>()));
    assertFalse(g.isSubgroup(new FiniteSet<>(Z.ZERO, Z.ONE, Z.TWO, Z.THREE, Z.FOUR, Z.FIVE, Z.NEG_ONE)));
    assertFalse(g.isSubgroup(new FiniteSet<>(Z.ZERO, Z.ONE, g.negate(Z.ONE)))); // fails closure
    assertFalse(g.isSubgroup(Integers.SINGLETON));
    assertEquals(g, g.generateSubgroup(g));
    assertTrue(g.subgroup(g.zero()) instanceof Singleton);
    assertTrue(g.generateSubgroup(new FiniteSet<>()) instanceof Singleton);
    assertTrue(g.generateSubgroup(new FiniteSet<>(g.zero())) instanceof Singleton);
    assertTrue(g.isCyclic());
    assertTrue(g.isNormalSubgroup(g));
    assertTrue(g.isNormalSubgroup(g.centralizer(g.zero())));
    assertFalse(g.isNormalSubgroup(new FiniteSet<>()));
  }

  @SuppressWarnings("unchecked")
  public void testSymmetric() {
    final SymmetricGroup<Integer> g = SymmetricGroup.create(4);
    for (final Permutation<Integer> a : g) {
      assertEquals(g.zero(), g.subtract(a, a));
    }
    g.checkContains(g.zero());
    try {
      g.checkContains(Permutation.create(-1, -1, -1, -1));
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Permutation<Integer> a = Permutation.create(1, 3, 4, 2);
    final FiniteSet<Permutation<Integer>> sa = new FiniteSet<>(a);
    assertNotNull(g.subgroup(a));
    assertNotNull(g.generateSubgroup(sa));
    assertNotNull(g.generateSubgroup(new FiniteSet<>(a, g.zero())));
    assertEquals(Z.THREE, g.order(a));
    assertNotNull(g.centralizer(a));
    assertNotNull(g.centre(sa));
    assertFalse(g.equals(g.centralizer(a)));
    assertFalse(g.equals(g.centre(sa)));
    assertTrue(g.isSubgroup(g));
    assertTrue(g.isSubgroup(g.centralizer(a)));
    assertFalse(g.isSubgroup(sa));
    assertTrue(g.isSubgroup(g));
    assertTrue(g.isSubgroup(new FiniteSet<>(g.zero())));
    assertEquals(g, g.generateSubgroup(g));
    assertFalse(g.isCyclic());
    assertTrue(g.isNormalSubgroup(g));
    assertFalse(g.isNormalSubgroup(g.centralizer(a)));
  }
  
  public void testCyclic() {
    assertTrue(SymmetricGroup.create(1).isCyclic());
    final IntegersMod z2 = new IntegersMod(2);
    final IntegersMod z3 = new IntegersMod(3);
    assertTrue(z3.isCyclic());
    final DirectProduct<Z, Z> s = new DirectProduct<>(z2, z3);
    assertTrue(s.isCyclic());
  }

  public void testOperation() {
    final Integers g = Integers.SINGLETON;
    final Operation<Z> op = g.operation();
    assertEquals(Z.FOUR, op.op(Z.ONE, Z.THREE));
    assertTrue(op.isAssociative());
    assertTrue(op.isCommutative());
  }

  public void testDurbin16p1() {
    final IntegersMod z8 = new IntegersMod(8);
    final Group<Z> g4 = z8.subgroup(Z.FOUR);
    final Set<Z> r0 = z8.rightCoset(g4, Z.ZERO);
    assertEquals(Z.TWO, r0.size());
    assertTrue(r0.contains(Z.ZERO));
    assertTrue(r0.contains(Z.FOUR));
    final Set<Z> r1 = z8.rightCoset(g4, Z.ONE);
    assertEquals(Z.TWO, r1.size());
    assertTrue(r1.contains(Z.ONE));
    assertTrue(r1.contains(Z.FIVE));
    assertEquals(z8, z8.rightCoset(z8, Z.TWO));
    assertEquals(g4, z8.rightCoset(g4, Z.ZERO));
    try {
      z8.rightCoset(g4, Z.NEG_ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testDurbin16p2() {
    final IntegersMod z12 = new IntegersMod(12);
    final Group<Z> g3 = z12.subgroup(Z.THREE);
    final Set<Z> r0 = z12.leftCoset(Z.ZERO, g3);
    assertEquals(Z.FOUR, r0.size());
    assertTrue(r0.contains(Z.ZERO));
    assertTrue(r0.contains(Z.THREE));
    assertTrue(r0.contains(Z.SIX));
    assertTrue(r0.contains(Z.NINE));
    final Set<Z> r1 = z12.leftCoset(Z.ONE, g3);
    assertEquals(Z.FOUR, r1.size());
    assertTrue(r1.contains(Z.ONE));
    assertTrue(r1.contains(Z.FOUR));
    assertTrue(r1.contains(Z.SEVEN));
    assertTrue(r1.contains(Z.TEN));
    assertEquals(z12, z12.leftCoset(Z.ONE, z12));
    assertEquals(g3, z12.leftCoset(Z.ZERO, g3));
    try {
      z12.leftCoset(Z.NEG_ONE, g3);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
  
  public void testIndex() {
    final IntegersMod z4 = new IntegersMod(4);
    final IntegersMod z6 = new IntegersMod(6);
    try {
      z4.index(z6);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(Z.ONE, z4.index(z4));
    assertEquals(Z.ONE, Integers.SINGLETON.index(Integers.SINGLETON));
    assertEquals(Z.TWO, z4.index(z4.subgroup(Z.TWO)));
    try {
      final ComplexField c = ComplexField.SINGLETON;
      c.index(c.generateSubgroup(new FiniteSet<>(c.zero())));
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  public void testDurbin17p23() {
    assertEquals(Z.SIX, SymmetricGroup.create(3).exponent());
    assertEquals(Z.FIVE, new IntegersMod(5).exponent());
    assertEquals(Z.NINE, new IntegersMod(9).exponent());
  }

  public void testIsomorphic() {
    assertFalse(new IntegersMod(6).isIsomorphic(new IntegersMod(5)));
  }

  public void testIsSimple() {
    assertTrue(new IntegersMod(5).isSimple());
    assertFalse(new IntegersMod(4).isSimple());
    assertFalse(new IntegersMod(1).isSimple());
    assertFalse(Rationals.SINGLETON.isSimple());
    assertFalse(SymmetricGroup.create(3).isSimple());
  }

  public void testSylowSubgroup() {
    final IntegersMod z3 = new IntegersMod(Z.THREE);
    assertFalse(Integers.SINGLETON.isSylowSubgroup(z3));
    assertFalse(z3.isSylowSubgroup(Integers.SINGLETON));
    assertTrue(z3.isSylowSubgroup(z3));
    final IntegersMod z4 = new IntegersMod(Z.FOUR);
    assertTrue(z4.isSylowSubgroup(z4));
    assertFalse(z4.isSylowSubgroup(new IntegersMod(Z.TWO)));
    assertFalse(z4.isSylowSubgroup(z4.subgroup(Z.TWO)));
    final IntegersMod z6 = new IntegersMod(Z.SIX);
    assertFalse(z6.isSylowSubgroup(z6));
    assertTrue(z6.isSylowSubgroup(z6.subgroup(Z.TWO)));
    final IntegersMod z180 = new IntegersMod(Z.valueOf(180));
    assertFalse(z180.isSylowSubgroup(z180));
    assertTrue(z180.isSylowSubgroup(z180.subgroup(Z.valueOf(20))));
    assertFalse(z180.isSylowSubgroup(z180.subgroup(Z.TEN)));
  }

  public void testRandom() {
    final Group<?> g = GroupFactory.createGroup("He3"); // order 27
    final Random r = new Random(42);
    final HashSet<Object> h = new HashSet<>();
    for (int k = 0; k < 200; ++k) {
      h.add(g.random(r));
    }
    assertEquals(27, h.size());
  }

  public void testGroupMultiply() {
    final SymmetricGroup<Integer> s = SymmetricGroup.create(5);
    final Random r = new Random();
    final Z neg = Z.NINE.negate();
    for (int k = 0; k < 5; ++k) {
      final Permutation<Integer> p = s.random(r);
      assertEquals(s.zero(), s.groupMultiply(p, 0));
      assertEquals(p, s.groupMultiply(p, 1));
      assertEquals(s.groupMultiply(p, Z.NINE), s.groupMultiply(p, 9));
      assertEquals(s.groupMultiply(p, neg), s.groupMultiply(p, -9));
    }
  }
}
