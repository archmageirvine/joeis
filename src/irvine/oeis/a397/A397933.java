package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a332.A332785;

/**
 * A397933 Numbers k that are neither squarefree nor powerful such that rad(k)*bigomega(k) = k, where rad = A007947 and bigomega = A001222.
 * @author Sean A. Irvine
 */
public class A397933 extends FilterSequence {

  /** Construct the sequence. */
  public A397933() {
    super(1, new A332785(), k -> Functions.RAD.z(k).multiply(Functions.BIG_OMEGA.l(k)).equals(k));
  }
}
