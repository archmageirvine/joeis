package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.a003.A003418;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401299 Number of decimal digits in lcm(1,2,...,n) = A003418(n).
 * @author Sean A. Irvine
 */
public class A401299 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401299() {
    super(1, new A003418().skip(), k -> Functions.DIGIT_LENGTH.z(k));
  }
}

