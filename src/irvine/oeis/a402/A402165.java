package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A402165 allocated for Nguyen Trong Nhan.
 * @author Sean A. Irvine
 */
public class A402165 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long t = ++mN;
    long cnt = 0;
    while (t != 2) {
      t = t / Functions.LPF.l(t) + 1;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

