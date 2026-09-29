package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a225.A225543;
import irvine.oeis.a400.A400338;

/**
 * A399317 allocated for Vaclav Kotesovec.
 * @author Sean A. Irvine
 */
public class A399317 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A399317() {
    super(0, new A225543() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    }, new A400338());
  }
}

