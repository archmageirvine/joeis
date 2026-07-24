package irvine.oeis.a397;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397066 Number of partitions of n whose parts admit exactly one superdiagonal arrangement, that is, exactly one ordering (c_1,...,c_k) with c_i &gt;= i.
 * @author Sean A. Irvine
 */
public class A397066 extends Sequence0 {

  // After Mohammad F. Marashdeh

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int c, final int rem) {
      Z tot = Z.ZERO;
      int m = 1;
      while (m * (c + m) <= rem) {
        if (rem % m == 0 && rem / m >= c + m) {
          tot = tot.add(1);
        }
        final int r2 = rem - (c + m) * m;
        if (r2 >= c + m + 1) {
          tot = tot.add(get(c + m, r2));
        }
        ++m;
      }
      return tot;
    }
  };

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : mB.get(0, mN);
  }
}
