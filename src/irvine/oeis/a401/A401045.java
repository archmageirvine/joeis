package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401045 Sexy roots: Numbers k such that k^2 is the sum of a pair of sexy primes (p,p'=p+6).
 * @author Sean A. Irvine
 */
public class A401045 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401045() {
    super(1, new A401046(), Functions.SQRT::z);
  }
}
