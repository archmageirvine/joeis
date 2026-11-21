package irvine.oeis.a399;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399890 Number of Dyck paths of semilength n with distinct peak heights and distinct valley heights.
 * @author Sean A. Irvine
 */
public class A399890 extends Sequence0 {

  // Row n contains b(n,k), indexed by k-1.
  private final ArrayList<Z[]> mB = new ArrayList<>();
  private int mN = -1;

  private Z get(final int n, final int k) {
    return k < 1 || k > n ? Z.ZERO : mB.get(n - 1)[k];
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z[] row = new Z[mN + 1];
    for (int k = 1; k <= mN; ++k) {
      if (k == mN) {
        // The alternating path (UD)^n is valid only for n <= 2.
        row[k] = mN <= 2 ? Z.ONE : Z.ZERO;
      } else {
        final int n = mN - k;
        final Z t1 = get(n, k - 1).multiply(k - 1L);
        final Z t2 = get(n, k).multiply((long) k * (k - 1) + 1);
        final Z t3 = get(n, k + 1).multiply(k + 1L);
        row[k] = t1.add(t2).add(t3);
      }
    }
    mB.add(row);
    return row[1];
  }
}
