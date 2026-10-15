package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400742 Number of runs of at least two odd steps before the first drop of 4n+3 under T(x) = x/2 (x even), (3x+1)/2 (x odd).
 * @author Sean A. Irvine
 */
public class A400742 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(4 * ++mN + 3);
    Z m = s;
    int len = 0;
    int runs = 0;
    while (m.compareTo(s) >= 0) {
      if (m.isEven()) {
        m = m.makeOdd();
        if (len > 1) {
          ++runs;
        }
        len = 0;
      } else {
        m = m.multiply(3).add(1).divide2();
        ++len;
      }
    }
    if (len > 1) {
      ++runs;
    }
    return Z.valueOf(runs);
  }
}
