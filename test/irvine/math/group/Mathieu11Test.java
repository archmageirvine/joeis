package irvine.math.group;

import java.util.Arrays;

import irvine.math.api.Set;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Mathieu11Test extends TestCase {

  private static final long[] M11_ORDERS = {0, 1, 165, 440, 990, 1584, 1320, 0, 1980, 0, 0, 1440};

  public void testM11() {
    final Mathieu11 m11 = new Mathieu11();
    assertEquals(Z.valueOf(7920), m11.size());
    assertFalse(m11.isAbelian());
    assertTrue(m11.isSimple());
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]", m11.zero().toString());
    final Permutation<Integer> a = Permutation.create(1, 10, 3, 11, 7, 6, 5, 9, 8, 2, 4);
    assertTrue(m11.contains(a));
    assertEquals(m11.zero(), m11.add(a, a));
    final Permutation<Integer> b = Permutation.create(4, 5, 8, 3, 6, 9, 7, 1, 2, 10, 11);
    final Permutation<Integer> b2 = m11.add(b, b);
    assertEquals(m11.zero(), m11.add(b2, b2));
    final long[] orders = new long[M11_ORDERS.length];
    for (final Permutation<Integer> e : m11) {
      ++orders[m11.order(e).intValueExact()];
    }
    assertTrue(Arrays.equals(M11_ORDERS, orders));
    final Set<Permutation<Integer>> gens = m11.getGenerators();
    assertEquals(Z.TWO, gens.size());
    assertTrue(gens.contains(a));
    assertTrue(gens.contains(b));
    assertEquals("M_{11}", m11.toString());
  }
}
