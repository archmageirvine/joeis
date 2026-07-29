package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A398151 Composite numbers k such that A000005(k) divides k^2 + 1.
 * @author Sean A. Irvine
 */
public class A398151 extends FilterSequence {

  /** Construct the sequence. */
  public A398151() {
    super(1, new A002808(), c -> c.square().add(1).mod(Functions.SIGMA0.z(c)).isZero());
  }
}
