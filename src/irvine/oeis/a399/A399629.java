package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399629 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A399629 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = ++mN % 10;
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.toString().charAt(0) - '0' == r) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

