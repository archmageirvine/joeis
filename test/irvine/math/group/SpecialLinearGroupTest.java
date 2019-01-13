package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SpecialLinearGroupTest extends TestCase {

  public void testSize3() {
    final IntegersMod z3 = new IntegersMod(3);
    final SpecialLinearGroup<Z> g = new SpecialLinearGroup<>(3, z3);
    final Z size = g.size();
    assertNotNull(size);
    final Iterator<Matrix<Z>> it = g.iterator();
    long c = 0;
    while (it.hasNext()) {
      it.next();
      ++c;
    }
    assertEquals(size.longValue(), c);
  }

  public void testSize5() {
    final IntegersMod z5 = new IntegersMod(5);
    final SpecialLinearGroup<Z> g = new SpecialLinearGroup<>(2, z5);
    final Z size = g.size();
    assertNotNull(size);
    final Iterator<Matrix<Z>> it = g.iterator();
    long c = 0;
    while (it.hasNext()) {
      it.next();
      ++c;
    }
    assertEquals(size.longValue(), c);
    assertEquals("SL_{2}(\\Z(5))", g.toString());
    assertFalse(g.contains(null));
    assertTrue(g.contains(g.zero()));
  }

}
