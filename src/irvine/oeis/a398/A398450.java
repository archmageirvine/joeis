package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A398450 allocated for Lark Song.
 * @author Sean A. Irvine
 */
public class A398450 extends FilterSequence {

  /** Construct the sequence. */
  public A398450() {
    super(1, new A002808(), k -> Functions.SIGMA.z(k).subtract(Functions.SIGMA0.z(k)).mod(Functions.PHI.l(k)) == 0);
  }
}
