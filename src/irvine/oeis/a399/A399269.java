package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399269 The smallest number k such that the concatenation of the squares of the numbers from k to k + n is a prime number, or zero if such a k does not exist.
 * @author Sean A. Irvine
 */
public class A399269 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 9 == 8) {
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      ++k;
      final StringBuilder sb = new StringBuilder();
      for (long j = 0; j <= mN; ++j) {
        sb.append(Z.valueOf(k + j).square());
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

