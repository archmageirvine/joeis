package irvine.oeis.a398;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A398922 Number of distinct acute lattice trapezia of area n/2 with horizontal base.
 * @author Sean A. Irvine
 */
public class A398922 extends DirichletSequence {

  /** Construct the sequence. */
  public A398922() {
    super(Dgf.divide(Dgf.multiply(Dgf.zeta(), Dgf.subtract(Dgf.add(Dgf.add(Dgf.zeta(1, 2), Dgf.multiply(Dgf.zeta(), 3)), Dgf.multiply(Dgf.from(0, 1), Dgf.zeta())), Dgf.multiply(Dgf.zeta(1, 1), 4))), 4));
  }
}
