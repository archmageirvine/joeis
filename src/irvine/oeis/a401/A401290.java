package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a027.A027556;

/**
 * A401290 Number of green squares after n unfoldings in the edge-memory unfolding array.
 * @author Sean A. Irvine
 */
public class A401290 extends Sequence0 {

  private long mN = -1;
  private Z mB0 = Z.ZERO;
  private Z mB1 = Z.ZERO;
  private final Sequence mS = new A027556().skip(3);

  private Z b(final long n) {
    if (n < 5) {
      return Z.ZERO;
    }
    final Z t = mS.next().add(mB1.multiply2()).subtract(mB0);
    mB0 = mB1;
    mB1 = t;
    return t;
  }

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(b(mN));
  }
}

