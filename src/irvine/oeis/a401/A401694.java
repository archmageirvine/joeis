package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401694 Number of ways to apply one of four moves (see Comments) to a nonempty Dyck word with a cut, where both sides of the cut have lengths at most n+1 and of the same parity as n+1 before the move and at most n after the move.
 * @author Sean A. Irvine
 */
public class A401694 extends GfSequence {

  /** Construct the sequence. */
  public A401694() {
    super(1, "(2*(1+x+x^3)*(sqrt(1-4*x^2)) - x*(1+x)*(1+x+x^2)*(sqrt(1-4*x)) - (1-x)*(2+3*x-x^2+x^3+2*x^4))/(2*x^3*(1-x)^2*(1+x))");
  }
}
