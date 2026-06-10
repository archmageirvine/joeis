package irvine.oeis.a396;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a395.A395902;

/**
 * A396356 allocated for Alex Stokolos.
 * @author Sean A. Irvine
 */
public class A396356 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A396356() {
    super(1, new A395902().skip());
  }
}
