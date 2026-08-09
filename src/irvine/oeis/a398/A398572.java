package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000026;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398572 allocated for Tymofii Kasian.
 * @author Sean A. Irvine
 */
public class A398572 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A398572() {
    super(1, new A000026(), Functions.BIG_OMEGA::z);
  }
}
