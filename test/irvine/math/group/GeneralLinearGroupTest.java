package irvine.math.group;

import java.util.Iterator;

import irvine.math.api.Matrix;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GeneralLinearGroupTest extends TestCase {

  public void testSize1() {
    final GaloisField gf3 = new GaloisField(3);
    final GeneralLinearGroup<Z> g = new GeneralLinearGroup<>(3, gf3);
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
    final GaloisField gf5 = new GaloisField(5);
    final GeneralLinearGroup<Z> g = new GeneralLinearGroup<>(2, gf5);
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
    assertFalse(g.contains(new MatrixRing<>(2, gf5).zero()));
    assertFalse(g.isAbelian());
    assertTrue(new GeneralLinearGroup<>(1, gf5).isAbelian());
  }

}
