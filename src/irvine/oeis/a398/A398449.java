package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397121.
 * @author Sean A. Irvine
 */
public class A398449 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final Z p = Functions.PRIME.z(mN);
    final Z q = Functions.PRIME.z(mM);
    return Functions.GPF.z(p.pow(q).add(q.pow(p)));
  }
}

