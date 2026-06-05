package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.oeis.a000.A000081;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A396566 Number of bracelets (turnover necklaces) of length 4 using exactly 3 colors, where the colors are chosen from a palette of size N = A000081(n) (the number of unlabeled rooted trees with n nodes), and each color corresponds to a distinct tree shape.
 * @author Sean A. Irvine
 */
public class A396566 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A396566() {
    super(4, new A000081().skip(4), k -> Binomial.binomial(k, 3).multiply(6));
  }
}
