package irvine.oeis.a396;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a046.A046675;

/**
 * A396827 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A396827 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A396827() {
    super(1, new A046675(), new A396826());
  }
}
