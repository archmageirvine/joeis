package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.lattice.Animal;
import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A060677Test extends TestCase {

  private static final Lattice L = Lattices.Z2;

  private void check(final String description, final boolean state) {
    long x = 0;
    long y = 0;
    Animal animal = new Animal(L.toPoint(x, y));
    for (int k = 0; k < description.length(); ++k) {
      if (description.charAt(k) == 'u') {
        ++y;
      } else {
        ++x;
      }
      animal = new Animal(animal, L.toPoint(x, y));
    }
    final A060677 seq = new A060677();
    final CR[] line = seq.isLinear(animal);
    if (state) {
      assertNotNull(animal.toString(L), line);
    } else {
      assertNull(animal.toString(L), line);
    }
  }

  public void test10() {
    check("rrrrrrrrr", true);
    check("rrrrrrrru", true);
  }

  public void test10b() {
    check("urrrrurru", false);
  }
}
