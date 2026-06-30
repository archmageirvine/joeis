package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397224 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A397224 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      if (d.subtract(mN / d.longValueExact()).abs().isSquare()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
