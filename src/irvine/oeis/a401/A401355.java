package irvine.oeis.a401;

import irvine.oeis.a020.A020861;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A401355 Denominators of convergents to log_2(9).
 * @author Sean A. Irvine
 */
public class A401355 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A401355() {
    super(0, new A020861());
  }
}

