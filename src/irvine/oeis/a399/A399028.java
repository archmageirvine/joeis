package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A399028 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A399028 extends FilterSequence {

  /** Construct the sequence. */
  public A399028() {
    super(1, new A000040(), p -> p.add(Functions.REVERSE.z(p)).subtract(1).isProbablePrime());
  }
}
