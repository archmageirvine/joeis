package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.a001.A001358;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A398131 Next prime after the n-th semiprime.
 * @author Sean A. Irvine
 */
public class A398131 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A398131() {
    super(1, new A001358(), Functions.NEXT_PRIME::z);
  }
}
