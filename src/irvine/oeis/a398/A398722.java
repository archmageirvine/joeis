package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A398722 allocated for Chittaranjan Pardeshi.
 * @author Sean A. Irvine
 */
public class A398722 extends AbstractSequence {

  private static final CR SQRT_PHI = CR.PHI.sqrt();

  private CR mX = CR.PI.divide(SQRT_PHI.pow(4));

  /** Construct the sequence. */
  public A398722() {
    super(5);
  }

  @Override
  public Z next() {
    mX = mX.multiply(SQRT_PHI);
    if (mX.compareTo(SQRT_PHI) > 0) {
      mX = mX.subtract(SQRT_PHI);
      return Z.ONE;
    } else {
      return Z.ZERO;
    }
  }
}
