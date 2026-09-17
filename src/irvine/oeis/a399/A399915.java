package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;

/**
 * A399623.
 * @author Sean A. Irvine
 */
public class A399915 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A399915() {
    super(1, new A399184() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }, 1, false);
    skip(2);
  }
}
