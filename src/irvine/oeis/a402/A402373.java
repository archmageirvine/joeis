package irvine.oeis.a402;

import irvine.math.q.Q;
import irvine.oeis.a005.A005596;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A402373 allocated for Patryk Majda.
 * @author Sean A. Irvine
 */
public class A402373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A402373() {
    super(0, new A005596().getCR().multiply(new Q(27, 38)));
  }
}
