package irvine.oeis.a401;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401018 allocated for M. Jeremie Lafitte (Levitas).
 * @author Sean A. Irvine
 */
public class A401018 extends Sequence0 {

  private long mN = -1;
  private final MemoryFunction1<Integer> mS = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < 2) {
        return n;
      }
      return (n & 1) == 1 ? get(n / 2) + get(n / 2 + 1) : get(n / 2);
    }
  };

  @Override
  public Z next() {
    ++mN;
    final long p = mS.get(mN);
    final long q = mS.get(mN + 1);
    final long t = p % q;
    return Z.valueOf((q & 1) == 0 ? q / 2 : (t & 1) == 0 ? t / 2 : (q - t) / 2);
  }
}
