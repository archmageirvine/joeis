package irvine.math.set;

import irvine.math.api.Group;
import irvine.math.group.SymmetricGroup;

import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;
import java.util.Arrays;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PermutationTest extends TestCase {

  public void testCycle() {
    final HashMap<Integer, Integer> t = new HashMap<>();
    t.put(1, 3);
    t.put(2, 4);
    t.put(3, 1);
    t.put(4, 5);
    t.put(5, 2);
    final FiniteSet<Integer> s = new FiniteSet<>(t.keySet());
    final Permutation<Integer> p = new Permutation<>(s, t);
    final List<List<Integer>> cs = p.cycleStructure();
    assertTrue("[[1, 3], [2, 4, 5]]".equals(cs.toString()));
    assertEquals("[3, 4, 1, 5, 2]", p.toString());
    assertEquals(0, p.compareTo(p));
    final Group<Permutation<Integer>> g = SymmetricGroup.create(5);
    assertEquals(1, p.compareTo(g.zero()));
    assertEquals(-1, g.zero().compareTo(p));
    assertTrue(p.isOnto());
    assertTrue(p.isOneToOne());
    assertEquals("[[]]", g.zero().cycleStructure().toString());
  }

  public void testCreate() {
    final Permutation<Integer> p = Permutation.create(3, 2, 1);
    assertEquals(3, p.image(1).intValue());
    assertEquals(2, p.image(2).intValue());
    assertEquals(1, p.image(3).intValue());
    assertEquals(new IntegerSet(1, 3), p.domain());
  }

  public void testCycleLengths() {
    final Permutation<Integer> p0 = Permutation.create(1, 2, 3);
    assertEquals("[0, 3, 0, 0]", Arrays.toString(p0.cycleLengths()));
    final Permutation<Integer> p1 = Permutation.create(3, 2, 1);
    assertEquals("[0, 1, 1, 0]", Arrays.toString(p1.cycleLengths()));
    final Permutation<Integer> p2 = Permutation.create(3, 1, 2);
    assertEquals("[0, 0, 0, 1]", Arrays.toString(p2.cycleLengths()));
  }
}
