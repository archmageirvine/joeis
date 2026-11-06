package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400344 Number of upper triangular n X n binary matrices having all row and column sums in {0,1,2}.
 * @author Sean A. Irvine
 */
public class A400344 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400344() {
    super(0, CR.SIX.pow(Q.ONE_THIRD).negate().exp().multiply(3).divide(2));
  }
}

