package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A400963 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A400963 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A400963() {
    super(1, CR.TWO.pow(new Q(1, 5)).subtract(1).inverse());
  }
}

