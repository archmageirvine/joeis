package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395961 Fourth iterate of the Thue-Morse transform applied to A000035.
 * @author Sean A. Irvine
 */
public class A395961 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long p = 0;
    int s = 0;
    while (1L << p <= mN) {
      if ((p & 3) == 0) {
        s ^= mN >>> p;
      }
      ++p;
    }
    return Z.valueOf(s & 1);
  }
}
