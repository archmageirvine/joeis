package irvine.math.group;

import irvine.math.api.Set;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Mathieu24Test extends TestCase {

  public void testM24() {
    final Mathieu24 m24 = new Mathieu24();
    assertTrue(m24.isSimple());
    assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23]", m24.zero().toString());
    final IntegerPermutation a = IntegerPermutation.createFromOneBase(4, 7, 17, 1, 13, 9, 2, 15, 6, 19, 18, 21, 5, 16, 8, 14, 3, 11, 10, 24, 12, 23, 22, 20);
    final IntegerPermutation b = IntegerPermutation.createFromOneBase(4, 21, 9, 6, 18, 1, 7, 8, 15, 5, 11, 12, 17, 2, 3, 13, 16, 10, 24, 20, 14, 22, 19, 23);
    assertEquals(m24.zero(), m24.add(a, a));
    final Set<IntegerPermutation> gens = m24.getGenerators();
    assertEquals(Z.TWO, gens.size());
    assertTrue(gens.contains(a));
    assertTrue(gens.contains(b));
    assertEquals("M_{24}", m24.toString());
  }

}
