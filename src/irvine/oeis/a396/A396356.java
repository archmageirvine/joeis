package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396356 allocated for Alex Stokolos.
 * @author Sean A. Irvine
 */
public class A396356 extends Sequence1 {

  private long mN = 1;
  private long mM = 0;

  private Z a(final long m, final long k) {
    return Integers.SINGLETON.sum(0, (m - 1) / 2, i -> Binomial.binomial(k + m - 1 - i, k).multiply(Binomial.binomial(m - 1 - i, i)).shiftLeft(2 * (m - 1 - 2 * i)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mN - mM + 1, mM);
  }
}
