package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397963 Value to the left of the rightmost longest series of 0-bits of n in binary.
 * @author Sean A. Irvine
 */
public class A397963 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long n = ++mN;
    long r = n;
    int m = 0;
    int z = 0;
    while (n != 0) {
      if ((n & 1) == 1) {
        z = 0;
      } else if (++z > m) {
        m = z;
        r = n >>> 1;
      }
      n >>>= 1;
    }
    return Z.valueOf(r);
  }
}

