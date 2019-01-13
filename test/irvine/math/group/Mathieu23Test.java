package irvine.math.group;

import irvine.math.api.Set;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Mathieu23Test extends TestCase {

  public void testM23() {
    final Mathieu23 mathieu = new Mathieu23();
    assertTrue(mathieu.isSimple());
    assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22]", mathieu.zero().toString());
    final IntegerPermutation a = IntegerPermutation.createFromOneBase(2, 1, 4, 3, 5, 6, 8, 7, 10, 9, 11, 12, 14, 13, 16, 15, 17, 18, 20, 19, 22, 21, 23);
    final IntegerPermutation b = IntegerPermutation.createFromOneBase(16, 9, 1, 5, 8, 22, 7, 23, 21, 10, 3, 2, 20, 18, 17, 11, 15, 6, 19, 13, 12, 14, 4);
    assertEquals(mathieu.zero(), mathieu.add(a, a));
    final Set<IntegerPermutation> gens = mathieu.getGenerators();
    assertEquals(Z.TWO, gens.size());
    assertTrue(gens.contains(a));
    assertTrue(gens.contains(b));
    assertEquals("M_{23}", mathieu.toString());
  }

}
