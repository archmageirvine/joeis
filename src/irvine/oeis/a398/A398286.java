package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398286 Decimal expansion of Sum_{k&gt;=1} (-1)^(k+1) * (H(2*k)/k^3 + H(2*k,2)/k^2), where H(k) = A001008(k)/A002805(k) is the k-th harmonic number, and H(k,2) = A007406(k)/A007407(k) is the k-th generalized harmonic number of order 2.
 * @author Sean A. Irvine
 */
public class A398286 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398286() {
    super(1, new A006752().getCR().square().multiply(2).add(CR.PI.pow(4).multiply(new Q(37, 5760))));
  }
}
