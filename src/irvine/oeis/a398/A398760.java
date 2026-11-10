package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398760 allocated for Andrei Leonov.
 * @author Sean A. Irvine
 */
public class A398760 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long s = mN - 1;
    long j = 1;
    while (true) {
      final long e = (s - j) / (2 * j - 1);
      if (e <= 0) {
        return t;
      }
      t = t.add(e);
      s += e;
      ++j;
    }
  }
}
