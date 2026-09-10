package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398340 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A398340 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > 1L << (mN - 1)) {
      ++mN;
      mM = 1;
    }
    return Functions.LPF.z(Z.valueOf(2 * mM - 1).shiftLeft(mN).add(1));
  }
}

