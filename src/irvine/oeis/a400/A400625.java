package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A400625 allocated for Siegfried Pohl.
 * @author Sean A. Irvine
 */
public class A400625 extends Sequence1 {

  private final Sequence mS = new A400943();
  private Z mA = mS.next();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.compareTo(mN) < 0) {
      ++mM;
      mA = mS.next();
    }
    return Z.valueOf(mM);
  }
}
