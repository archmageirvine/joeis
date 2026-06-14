package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A396878 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A396878 extends FilterSequence {

  /** Construct the sequence. */
  public A396878() {
    super(1, new A000040(), p -> new Z(p.subtract(1).toString() + p).isProbablePrime());
  }
}
