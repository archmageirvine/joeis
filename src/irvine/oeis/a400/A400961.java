package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A400961 Composite numbers such that the product of the number's divisors (A007955) is divisible by the sum of the number's proper divisors (A001065).
 * @author Sean A. Irvine
 */
public class A400961 extends FilterSequence {

  /** Construct the sequence. */
  public A400961() {
    super(1, new A002808(), k -> Functions.POD.z(k).mod(Functions.SIGMA1.z(k).subtract(k)).isZero());
  }
}
