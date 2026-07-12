package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a060.A060735;

/**
 * A397658 Numbers k*P(j) such that bigomega(k) = k - j, where P = A002110 and bigomega = A001222.
 * @author Sean A. Irvine
 */
public class A397658 extends FilterSequence {

  /** Construct the sequence. */
  public A397658() {
    super(1, new A060735(), k -> k.equals(Functions.RAD.z(k).multiply(Functions.BIG_OMEGA.z(k))));
  }
}
