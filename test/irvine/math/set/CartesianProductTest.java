package irvine.math.set;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CartesianProductTest extends TestCase {

  public void test() {
    final FiniteSet<String> s = new FiniteSet<>("w", "x", "y");
    final FiniteSet<Integer> t = new FiniteSet<>(1, 2);
    final CartesianProduct<String, Integer> c = new CartesianProduct<>(s, t);
    assertEquals(Z.SIX, c.size());
    assertTrue(c.contains(new Pair<>("w", 1)));
    assertTrue(c.contains(new Pair<>("y", 2)));
    assertFalse(c.contains(new Pair<>("z", 1)));
    assertFalse(c.contains(new Pair<>("w", 0)));
    assertTrue(c.toString().contains("\\}\\times\\{"));
    final Iterator<Pair<String, Integer>> it = c.iterator();
    final HashSet<Pair<String, Integer>> seen = new HashSet<>();
    assertTrue(it.hasNext());
    assertTrue(it.hasNext());
    seen.add(it.next());
    seen.add(it.next());
    seen.add(it.next());
    seen.add(it.next());
    seen.add(it.next());
    assertTrue(it.hasNext());
    assertTrue(it.hasNext());
    seen.add(it.next());
    assertFalse(it.hasNext());
    assertTrue(seen.contains(new Pair<>("w", 1)));
    assertTrue(seen.contains(new Pair<>("w", 2)));
    assertTrue(seen.contains(new Pair<>("x", 1)));
    assertTrue(seen.contains(new Pair<>("x", 2)));
    assertTrue(seen.contains(new Pair<>("y", 1)));
    assertTrue(seen.contains(new Pair<>("y", 2)));
  }

  public void testEmptyLeft() {
    final FiniteSet<String> s = new FiniteSet<>(new String[0]);
    final FiniteSet<Integer> t = new FiniteSet<>(1, 2);
    final CartesianProduct<String, Integer> c = new CartesianProduct<>(s, t);
    assertEquals(Z.ZERO, c.size());
    assertFalse(c.contains(new Pair<>("z", 1)));
    assertEquals("\\emptyset\\times\\{1,2\\}", c.toString());
    final Iterator<Pair<String, Integer>> it = c.iterator();
    assertFalse(it.hasNext());
  }

  public void testEmptyRight() {
    final FiniteSet<String> s = new FiniteSet<>("w", "x", "y");
    final FiniteSet<Integer> t = new FiniteSet<>(new Integer[0]);
    final CartesianProduct<String, Integer> c = new CartesianProduct<>(s, t);
    assertEquals(Z.ZERO, c.size());
    assertFalse(c.contains(new Pair<>("z", 1)));
    final String actual = c.toString();
    assertTrue(actual.startsWith("\\{"));
    assertTrue(actual.endsWith("\\}\\times\\emptyset"));
    final Iterator<Pair<String, Integer>> it = c.iterator();
    assertFalse(it.hasNext());
  }

  public void testDovetail() {
    final Iterator<Pair<Z, Z>> it = new CartesianProduct<>(Integers.SINGLETON, Integers.SINGLETON).iterator();
    assertTrue(it.hasNext());
    assertEquals(new Pair<>(Z.ZERO, Z.ZERO), it.next());
    assertEquals(new Pair<>(Z.ZERO, Z.ONE), it.next());
    assertEquals(new Pair<>(Z.ONE, Z.ZERO), it.next());
    assertEquals(new Pair<>(Z.ZERO, Z.NEG_ONE), it.next());
    assertEquals(new Pair<>(Z.ONE, Z.ONE), it.next());
    assertEquals(new Pair<>(Z.NEG_ONE, Z.ZERO), it.next());
    assertEquals(new Pair<>(Z.ZERO, Z.TWO), it.next());
    assertTrue(it.hasNext());
  }

  public void testInfiniteRight() {
    final Iterator<Pair<Integer, Z>> it = new CartesianProduct<>(new IntegerSet(0, 1), Integers.SINGLETON).iterator();
    assertTrue(it.hasNext());
    assertEquals(new Pair<>(0, Z.ZERO), it.next());
    assertEquals(new Pair<>(1, Z.ZERO), it.next());
    assertEquals(new Pair<>(0, Z.ONE), it.next());
    assertEquals(new Pair<>(1, Z.ONE), it.next());
    assertEquals(new Pair<>(0, Z.NEG_ONE), it.next());
    assertEquals(new Pair<>(1, Z.NEG_ONE), it.next());
    assertTrue(it.hasNext());
  }

  public void testInfiniteLeft() {
    final Iterator<Pair<Z, Integer>> it = new CartesianProduct<>(Integers.SINGLETON, new IntegerSet(0, 1)).iterator();
    assertTrue(it.hasNext());
    assertEquals(new Pair<>(Z.ZERO, 0), it.next());
    assertEquals(new Pair<>(Z.ZERO, 1), it.next());
    assertEquals(new Pair<>(Z.ONE, 0), it.next());
    assertEquals(new Pair<>(Z.ONE, 1), it.next());
    assertEquals(new Pair<>(Z.NEG_ONE, 0), it.next());
    assertEquals(new Pair<>(Z.NEG_ONE, 1), it.next());
    assertTrue(it.hasNext());
  }
}
