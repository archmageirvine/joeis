package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A085780.
 * @author Sean A. Irvine
 */
public class A397710 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397710() {
    super(1, k -> Functions.RAD.l(k) * Functions.LPF.l(k) == k);
  }
}
