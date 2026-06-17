package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000682;

/**
 * A396991 allocated for Roger Ford.
 * @author Sean A. Irvine
 */
public class A396991 extends Sequence1 {

  private final Sequence mS = new A000682();
  private Z mA = mS.next();
  private long mN = 0;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return mA.multiply(++mN + 2).subtract(t.multiply(2 * mN));
  }
}
