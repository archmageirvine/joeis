package irvine.oeis.a396;

import irvine.oeis.a003.A003024;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A396578 a(n) is the number of labeled directed acyclic graphs on [n] with no isolated points.
 * @author Gregory Morse
 */
public class A396578 extends InverseBinomialTransformSequence {
  /** Construct the sequence. */
  public A396578() {
    super(new A003024(), 0);
  }
}
