package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.z.Z;
import junit.framework.TestCase;
import java.util.HashSet;
import irvine.math.set.Permutation;
import irvine.math.api.Set;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RightCosetTest extends TestCase {

  public void testDurbin16p1() {
    final IntegersMod z8 = new IntegersMod(8);
    final Group<Z> g4 = z8.subgroup(Z.FOUR);
    final RightCoset<Z> r0 = new RightCoset<>(z8, g4, Z.ZERO);
    assertEquals(Z.TWO, r0.size());
    assertTrue(r0.contains(Z.ZERO));
    assertTrue(r0.contains(Z.FOUR));
    final RightCoset<Z> r1 = new RightCoset<>(z8, g4, Z.ONE);
    assertEquals(Z.TWO, r1.size());
    assertTrue(r1.contains(Z.ONE));
    assertTrue(r1.contains(Z.FIVE));
    final RightCoset<Z> r2 = new RightCoset<>(z8, g4, Z.TWO);
    assertEquals(Z.TWO, r2.size());
    assertTrue(r2.contains(Z.TWO));
    assertTrue(r2.contains(Z.SIX));
    final RightCoset<Z> r3 = new RightCoset<>(z8, g4, Z.THREE);
    assertEquals(Z.TWO, r3.size());
    assertTrue(r3.contains(Z.THREE));
    assertTrue(r3.contains(Z.SEVEN));
    final RightCoset<Z> r4 = new RightCoset<>(z8, g4, Z.FOUR);
    assertTrue(r0.equals(r4));
    try {
      new RightCoset<>(null, g4, Z.ZERO);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new RightCoset<>(z8, null, Z.ZERO);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new RightCoset<>(z8, g4, Z.NEG_ONE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals("<4>0 in \\Z(8)", r0.toString());
    // Tests the iterator
    final HashSet<Z> h = new HashSet<>();
    for (final Z z : r0) {
      h.add(z);
    }
    assertEquals(2, h.size());
    assertTrue(h.contains(Z.ZERO));
    assertTrue(h.contains(Z.FOUR));
  }

  public void testDurbin16p5() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final Permutation<Integer> p123 = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2, 3}));
    final Group<Permutation<Integer>> s123 = s3.subgroup(p123);
    final Set<Permutation<Integer>> c0 = s3.rightCoset(s123, s3.zero());
    assertEquals(Z.THREE, c0.size());
    assertTrue(c0.contains(s3.zero()));
    assertTrue(c0.contains(p123));
    assertTrue(c0.contains(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3, 2}))));
    final Permutation<Integer> p12 = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2}));
    final Set<Permutation<Integer>> c1 = s3.rightCoset(s123, p12);
    assertEquals(Z.THREE, c1.size());
    assertTrue(c1.contains(p12));
    assertTrue(c1.contains(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3}))));
    assertTrue(c1.contains(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {2, 3}))));
  }

  public void testDurbin16p6() {
    final SymmetricGroup<Integer> s3 = SymmetricGroup.create(3);
    final Permutation<Integer> p13 = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3}));
    final Group<Permutation<Integer>> s123 = s3.subgroup(p13);
    final Set<Permutation<Integer>> c0 = s3.rightCoset(s123, s3.zero());
    assertEquals(Z.TWO, c0.size());
    assertTrue(c0.contains(s3.zero()));
    assertTrue(c0.contains(p13));
    final Permutation<Integer> p12 = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2}));
    final Set<Permutation<Integer>> c1 = s3.rightCoset(s123, p12);
    assertEquals(Z.TWO, c1.size());
    assertTrue(c1.contains(p12));
    assertTrue(c1.contains(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 3, 2}))));
    final Permutation<Integer> p23 = s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {2, 3}));
    final Set<Permutation<Integer>> c2 = s3.rightCoset(s123, p23);
    assertEquals(Z.TWO, c2.size());
    assertTrue(c2.contains(p23));
    assertTrue(c2.contains(s3.cyclesToPermutation(SymmetricGroupTest.build(new int[] {1, 2, 3}))));
  }
}
