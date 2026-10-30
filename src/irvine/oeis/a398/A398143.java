package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398143 allocated for Andrei Leonov.
 * @author Sean A. Irvine
 */
public class A398143 extends Sequence1 {

  private long mN = 0;

  private Z b(final long m) {
    return Z.FIVE.multiply(m * m).sqrt().add(m).divide2().add(m);
  }

  @Override
  public Z next() {
    ++mN;
    long r = 1;
    while (Functions.FIBONACCI.l(r) <= mN) {
      ++r;
    }
    final long j = mN - Functions.FIBONACCI.i(--r);
    return j > 0 ? b(j).add(2) : (r & 1) == 0 ? Z.ONE : Z.TWO;
  }
}
