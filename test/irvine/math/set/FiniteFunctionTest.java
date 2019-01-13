package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.z.Z;
import irvine.util.Pair;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FiniteFunctionTest extends TestCase {

  public void testDurbin1p1() {
    final FiniteSet<String> s = new FiniteSet<>("w", "x", "y", "z");
    final FiniteSet<Integer> t = new FiniteSet<>(1, 2, 3, 4);
    final FiniteFunction<String, Integer> alpha = new FiniteFunction<>(s, t, Arrays.asList(new Pair<>("w", 2), new Pair<>("x", 4), new Pair<>("y", 1), new Pair<>("z", 2)));
    final FiniteFunction<String, Integer> beta = new FiniteFunction<>(s, t, Arrays.asList(new Pair<>("w", 4), new Pair<>("x", 2), new Pair<>("y", 3), new Pair<>("z", 1)));
    assertFalse(alpha.isOneToOne());
    assertTrue(beta.isOneToOne());
    assertFalse(alpha.isOnto());
    assertTrue(beta.isOnto());
    final FiniteSet<String> a = new FiniteSet<>("w", "y");
    final FiniteSet<String> b = new FiniteSet<>("x", "y", "z");
    final Set<Integer> aa = alpha.image(a);
    assertEquals(Z.TWO, aa.size());
    assertTrue(aa.contains(1));
    assertTrue(aa.contains(2));
    final Set<Integer> bb = beta.image(b);
    assertEquals(Z.THREE, bb.size());
    assertTrue(bb.contains(1));
    assertTrue(bb.contains(2));
    assertTrue(bb.contains(3));
    final Set<Integer> aaintb = alpha.image(Intersection.intersection(a, b));
    assertEquals(Z.ONE, aaintb.size());
    assertTrue(aaintb.contains(1));
    final Set<Integer> baunionb = beta.image(Union.union(a, b));
    assertEquals(Z.FOUR, baunionb.size());
    assertTrue(baunionb.contains(1));
    assertTrue(baunionb.contains(2));
    assertTrue(baunionb.contains(3));
    assertTrue(baunionb.contains(4));
  }
}
