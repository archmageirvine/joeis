package irvine.oeis.a399;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002378;
import irvine.oeis.a094.A094807;

/**
 * A399265 allocated for Russ Curry.
 * @author Sean A. Irvine
 */
public class A399265 extends TwoParameterFormSequence {

  private static final DirectSequence A = DirectSequence.create(new A094807());
  private static final DirectSequence B = new A002378();

  /** Construct the sequence. */
  public A399265() {
    super(1, 1, 1, (j, k) -> A.a(j).multiply(B.a(k)));
  }
}
