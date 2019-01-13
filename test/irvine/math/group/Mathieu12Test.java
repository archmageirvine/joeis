package irvine.math.group;

import irvine.math.api.Set;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Mathieu12Test extends TestCase {

  public void testM12() {
    final Mathieu12 m12 = new Mathieu12();
    assertTrue(m12.isSimple());
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]", m12.zero().toString());
    final Permutation<Integer> a = Permutation.create(4, 2, 10, 1, 11, 12, 7, 8, 9, 3, 5, 6);
    assertTrue(m12.contains(a));
    assertEquals(m12.zero(), m12.add(a, a));
    final Permutation<Integer> b = Permutation.create(8, 3, 4, 2, 12, 10, 6, 9, 1, 7, 5, 11);
    assertEquals(m12.zero(), m12.add(m12.add(b, b), b));
    assertFalse(m12.isAbelian());
    assertEquals(Z.valueOf(95040), m12.size());
    final Set<Permutation<Integer>> gens = m12.getGenerators();
    assertEquals(Z.TWO, gens.size());
    assertTrue(gens.contains(a));
    assertTrue(gens.contains(b));
    assertEquals("M_{12}", m12.toString());
  }

}
