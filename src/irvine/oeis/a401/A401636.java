package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005153;

/**
 * A401636 Practical numbers M (A005153) such that sigma(M) + 2 is prime.
 * @author Sean A. Irvine
 */
public class A401636 extends FilterSequence {

  /** Construct the sequence. */
  public A401636() {
    super(1, new A005153(), k -> Functions.SIGMA1.z(k).add(2).isProbablePrime());
  }
}
