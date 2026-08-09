package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000026;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398576 allocated for Tymofii Kasian.
 * @author Sean A. Irvine
 */
public class A398576 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A398576() {
    super(1, new A000026(), Functions.LIOUVILLE_LAMBDA::z);
  }
}
