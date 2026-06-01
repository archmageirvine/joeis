package irvine.oeis.a396;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a024.A024619;
import irvine.oeis.a382.A382438;

/**
 * A396265 Numbers k such that there exists a number r &lt; k such that both gcd(r,k) &gt; 1 and rad(r) does not divide k, yet rad(r+m*k) | k for some m, where rad = A007947.
 * @author Sean A. Irvine
 */
public class A396265 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A396265() {
    super(1, new A024619(), new A382438());
  }
}
