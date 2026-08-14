package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A398474 allocated for Dimas Saputra.
 * @author Sean A. Irvine
 */
public class A398474 extends Sequence2 {

  private long mN = 1;
  private long mCount = 0;

  private void search(final long prod, final long prod1, final long prev) {
    long k = prev;
    while (true) {
      final long pk1 = prod1 * ++k;
      if (pk1 >= mN) {
        break;
      }
      if (Functions.GCD.l(prod, k) == 1) {
        final long pk = prod * k;
        if (pk >= mN) {
          ++mCount;
        }
        search(pk, pk1, k);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    for (long start = 2; start < mN; ++start) {
      search(start, 1, start);
    }
    return Z.valueOf(mCount);
  }
}

