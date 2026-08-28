package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A399155 allocated for Jaylen Dilkhush.
 * @author Sean A. Irvine
 */
public class A399155 extends Sequence2 {

  private long mN = 1;

  private long lpfCount(long n) {
    int cnt = 0;
    while (n != 0) {
      ++cnt;
      n -= Functions.LPF.l(n);
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
    ++mN;
    return Z.valueOf(lpfCount(mN) - gpfCount(mN));
  }
}

