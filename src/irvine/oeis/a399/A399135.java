package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A399135 Numbers for which repeatedly subtracting the greatest prime factor (A006530) to reach 0 takes fewer steps than repeatedly subtracting the squarefree kernel (A007947).
 * @author Sean A. Irvine
 */
public class A399135 extends Sequence2 {

  private long mN = 1;

  private long sqfkCount(long n) {
    int cnt = 0;
    while (n != 0) {
      ++cnt;
      n -= Functions.SQUARE_FREE_KERNEL.l(n);
    }
    return cnt;
  }

  private long gpfCount(long n) {
    int cnt = 0;
    while (n != 0) {
      ++cnt;
      n -= Functions.GPF.l(n);
    }
    return cnt;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (gpfCount(mN) < sqfkCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

