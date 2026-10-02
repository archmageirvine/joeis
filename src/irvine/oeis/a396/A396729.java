package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396729 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A396729 extends Sequence0 {

  private long mN = 0;
  private long mP = Functions.PARTITIONS.l(mN);
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mP) {
      mP = Functions.PARTITIONS.l(++mN);
      mM = 1;
    }
    return Z.valueOf(mM);
  }
}
