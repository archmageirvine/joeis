package irvine.oeis.a397;

import irvine.oeis.a000.A000002;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A397648 Inverse binomial transform of Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A397648 extends InverseBinomialTransformSequence {

  /** Construct the sequence. */
  public A397648() {
    super(0, new A000002(), 0);
  }
}
