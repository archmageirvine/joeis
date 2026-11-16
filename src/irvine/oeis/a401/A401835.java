package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A401835 Number of different amounts that can be paid with exactly n euro coins (1, 2, 5, 10, 20, 50 cents, 1 and 2 euros).
 * @author Sean A. Irvine
 */
public class A401835 extends PrependSequence {

  /** Construct the sequence. */
  public A401835() {
    super(0, new Sequence1() {
      private Z mA = Z.valueOf(415);
      @Override
      public Z next() {
        mA = mA.add(199);
        return mA;
      }
    }, 1, 8, 36, 109, 243, 419);
  }
}

