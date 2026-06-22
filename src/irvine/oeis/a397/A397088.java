package irvine.oeis.a397;
// manually 2026-06-18/polyx at 2026-06-18 08:39

import irvine.oeis.PolynomialFieldSequence;

/**
 * A397088 E.g.f. A(x) satisfies A'(x) = exp( A(x)*A'(x)^4 ), with A(0)=0.
 * @author Georg Fischer
 */
public class A397088 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A397088() {
    super(1, "[1]", "A,A,dif,^4,*,exp,int", 0, 1);
  }
}
