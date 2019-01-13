package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GeneralLinearGroupTest extends TestCase {

  public void testSize1() {
    final IntegersMod z3 = new IntegersMod(3);
    final GeneralLinearGroup<Z> g = new GeneralLinearGroup<>(3, z3);
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

  public void testSize2() {
    final IntegersMod z3 = new IntegersMod(5);
    final GeneralLinearGroup<Z> g = new GeneralLinearGroup<>(2, z3);
    final Z size = g.size();
    assertNotNull(size);
    final Iterator<Matrix<Z>> it = g.iterator();
    long c = 0;
    while (it.hasNext()) {
      it.next();
      ++c;
    }
    assertEquals(size.longValue(), c);
    assertEquals("GL_{2}(\\Z(5))", g.toString());
    assertFalse(g.contains(null));
    assertTrue(g.contains(g.zero()));
    assertFalse(g.contains(new MatrixRing<>(2, z3).zero()));
    assertFalse(g.isAbelian());
    assertTrue(new GeneralLinearGroup<>(1, z3).isAbelian());
  }

}
