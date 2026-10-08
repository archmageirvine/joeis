package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a327.A327982;

/**
 * A400323 allocated for David L. Condrey.
 * @author Sean A. Irvine
 */
public class A400323 extends Sequence1 {

  private final Sequence mS = new A327982();
  private long mN = 0;
  private long mK = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mS.next().multiply2().subtract(++mK).abs().equals(mN)) {
        return Z.valueOf(mK);
      }
    }
  }
}
