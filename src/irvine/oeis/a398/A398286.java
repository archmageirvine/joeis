package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398286 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A398286 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398286() {
    super(1, new A006752().getCR().square().multiply(2).add(CR.PI.pow(4).multiply(new Q(37, 5760))));
  }
}
