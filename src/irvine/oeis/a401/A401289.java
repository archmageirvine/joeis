package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a001.A001055;

/**
 * A401289 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A401289 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A401289() {
    super(1, 1, new A001055() {
      private Z mA = super.next();

      @Override
      public Z next() {
        final Z t = mA;
        mA = super.next();
        return t.min(mA);
      }
    });
  }
}
