package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a161.A161601;

/**
 * A397431 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A397431 extends FilterSequence {

  /** Construct the sequence. */
  public A397431() {
    super(1, new A161601(), k -> !k.isProbablePrime() && Functions.REVERSE.z(2, k).isProbablePrime());
  }
}
