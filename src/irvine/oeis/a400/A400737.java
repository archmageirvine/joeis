package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400737 allocated for Paolo P. Lava.
 * @author Sean A. Irvine
 */
public class A400737 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      long sum = 0;
      long d = 0;
      for (long j = 0; j < mN; ++j) {
        sum += k + j;
        d += Functions.DIGIT_SUM.l(k + j);
      }
      if (sum % d == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
