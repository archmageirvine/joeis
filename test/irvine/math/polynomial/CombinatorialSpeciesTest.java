package irvine.math.polynomial;

import irvine.math.group.PolynomialRing;
import junit.framework.TestCase;

/**
 * Tests for combinatorial species operations.
 * @author Gregory Morse
 */
public class CombinatorialSpeciesTest extends TestCase {

  public void testSolveWithLongCycle() {
    final PolynomialRing<CycleIndex> ring = CombinatorialSpecies.RING;
    final CycleIndex x = new CycleIndex("", MultivariateMonomial.create(1, 1));
    final CycleIndex xx = new CycleIndex("", MultivariateMonomial.create(1, 2));
    final MultivariateMonomial z = MultivariateMonomial.create(3, 1);
    final CycleIndex xxxxx = new CycleIndex("", MultivariateMonomial.create(1, 5));
    final Polynomial<CycleIndex> b = ring.add(ring.add(ring.monomial(x, 1), ring.monomial(xx, 2)), ring.monomial(xxxxx, 5));
    // Substitute b into the species y^4*x_1*x_3, retaining orders through 5.
    final Polynomial<CycleIndex> series = ring.add(ring.monomial(x.multiply(z), 4), ring.monomial(xx.multiply(z), 5));
    final Polynomial<CycleIndex> solution = CombinatorialSpecies.sSolve(series, b);
    assertEquals(x.multiply(z), solution.coeff(4));
    assertEquals(CycleIndex.ZERO, solution.coeff(5));
  }
}
