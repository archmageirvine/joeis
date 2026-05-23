package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396114 allocated for Nathan M Epstein.
 * @author Sean A. Irvine
 */
public class A396114 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long r = 1;
    long c = 0;
    while (true) {
      if (2 * ++c > r) {
        ++r;
        c = 1;
      }
      final Z t = Binomial.binomial(r, c);
      if (t.mod(mN) == 0) {
        return t;
      }
    }
  }
}
