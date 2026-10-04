package irvine.oeis.a398;

import irvine.math.dirichlet.Dgf;
import irvine.oeis.DirichletSequence;

/**
 * A339707.
 * @author Sean A. Irvine
 */
public class A398922 extends DirichletSequence {

  // Dirichlet g.f.: zeta(s) * (zeta(s-2) - 4*zeta(s-1) + 3*zeta(s) + zeta(2*s))/4.

  /** Construct the sequence. */
  public A398922() {
    super(Dgf.divide(Dgf.multiply(Dgf.zeta(), Dgf.subtract(Dgf.add(Dgf.add(Dgf.zeta(1, 2), Dgf.multiply(Dgf.zeta(), 3)), Dgf.zeta(2)), Dgf.multiply(Dgf.zeta(1, 1), 4))), 4));
  }
}
