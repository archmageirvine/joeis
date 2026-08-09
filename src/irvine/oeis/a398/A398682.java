package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.oeis.a006.A006752;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398682 Decimal expansion of the absolute value of Integral_{t=0..Pi/4} log(sin(t)) dt.
 * @author Sean A. Irvine
 */
public class A398682 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A398682() {
    super(1, new A006752().getCR().divide(2).add(CR.PI.multiply(CR.LOG2).divide(4)));
  }
}
