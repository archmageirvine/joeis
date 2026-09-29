package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a225.A225543;

/**
 * A400339 allocated for Vaclav Kotesovec.
 * @author Sean A. Irvine
 */
public class A400339 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A400339() {
    super(0, new A225543() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    }, new A400338() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    });
  }
}

