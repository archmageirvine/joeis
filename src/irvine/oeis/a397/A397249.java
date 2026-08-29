package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397249 Numbers m such that lambda(2^m - 1) + 1 is prime, where the Carmichael lambda function is A002322.
 * @author Sean A. Irvine
 */
public class A397249 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397249() {
    super(1, k -> Functions.CARMICHAEL_LAMBDA.z(Z.ONE.shiftLeft(k).subtract(1)).add(1).isProbablePrime());
  }
}
