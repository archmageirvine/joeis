package irvine.math.group;

import irvine.math.api.Set;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Mathieu22Test extends TestCase {

  public void testM22() {
    final Mathieu22 mathieu = new Mathieu22();
    assertTrue(mathieu.isSimple());
    assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]", mathieu.zero().toString());
    final IntegerPermutation a = IntegerPermutation.createFromOneBase(13, 8, 16, 12, 5, 22, 17, 2, 10, 9, 14, 4, 1, 11, 15, 3, 7, 18, 19, 20, 21, 6);
    final IntegerPermutation b = IntegerPermutation.createFromOneBase(22, 18, 21, 13, 12, 11, 15, 14, 9, 8, 7, 5, 2, 20, 6, 16, 19, 4, 17, 10, 1, 3);
    assertEquals(mathieu.zero(), mathieu.add(a, a));
    final Set<IntegerPermutation> gens = mathieu.getGenerators();
    assertEquals(Z.TWO, gens.size());
    assertTrue(gens.contains(a));
    assertTrue(gens.contains(b));
    assertEquals("M_{22}", mathieu.toString());
  }
}
