package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.FilterNumberSequence;

/**
 * A398342 Numbers k, such that Sum_{d|k} rad(d) is a multiple of rad(k), where rad = A007947.
 * @author Sean A. Irvine
 */
public class A398342 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A398342() {
    super(1, k -> Integers.SINGLETON.sumdiv(k, Functions.RAD::z).mod(Functions.RAD.z(k)).isZero());
  }
}
