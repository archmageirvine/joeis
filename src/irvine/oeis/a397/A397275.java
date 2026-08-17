package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A397275 allocated for Joshua B. Weinstein.
 * @author Sean A. Irvine
 */
public class A397275 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(long n) {
    long m = 1;
    long length;
    while (n > (length = (m & 1) == 0 ? 2 * m : m)) {
      n -= length;
      ++m;
    }
    return Functions.TRIANGULAR.z(n - 1).modZ(m);
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
