package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397271 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A397271 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    while ((m & 3) != 0) {
      m >>= 1;
    }
    return Z.valueOf(m >>> 2);
  }
}

