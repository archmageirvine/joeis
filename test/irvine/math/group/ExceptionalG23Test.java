package irvine.math.group;

import irvine.math.api.Matrix;
import irvine.math.api.Set;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ExceptionalG23Test extends TestCase {

  public void test() {
    final GeneralLinearGroup<Z> parent = new GeneralLinearGroup<>(7, new GaloisField(3));
    final ExceptionalG23 e = new ExceptionalG23();
    assertEquals("G_2(3)", e.toString());
    assertTrue(e.isSimple());
    final Set<Matrix<Z>> generators = e.getGenerators();
    assertEquals(2, generators.size().intValueExact());
    // a^2 = 1, b^3 = 1
    // Can't validate in the group without constructing all the members (costly),
    // so validate in the parent.
    for (final Matrix<Z> g : generators) {
      if (g.get(0, 0).equals(Z.ONE)) {
        // b^3 = 1
        assertEquals(e.zero(), parent.add(parent.add(g, g), g));
      } else {
        // a^2 = 1
        assertEquals(e.zero(), parent.add(g, g));
      }
    }
    // These next two are very slow since they require constructing the group
    //assertEquals(Z.valueOf(4245696), e.size());
    //assertFalse(e.isAbelian());
  }
}
