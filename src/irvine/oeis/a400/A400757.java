package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400757 Number of doubly shaded cells in an n X n grid with inverted axes using Euler's totient function.
 * @author Sean A. Irvine
 */
public class A400757 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 2; r <= mN; r += 2) {
      final long phir = Functions.PHI.l(mN - r + 1);
      for (long c = 1; c <= phir; c += 2) {
        if (r <= Functions.PHI.l(mN - c + 1)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
