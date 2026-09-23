package irvine.oeis.a397;

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a400.A400247;

/**
 * A399784.
 * @author Sean A. Irvine
 */
public class A397517 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A397517() {
    super(0, "", "x,B,/n!,exp", 0, 1, 1, 1, new A400247().skip().prepend(0));
  }
}
