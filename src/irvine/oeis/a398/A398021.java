package irvine.oeis.a398;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398021 allocated for Giuseppe Ciacco.
 * @author Sean A. Irvine
 */
public class A398021 extends Sequence1 {

  private long mN = 0;

  private boolean is(Z n, final long k) {
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(n)) {
      if (n.isOne()) {
        return false;
      }
      final Z[] qr = n.divideAndRemainder(k);
      if (qr[1].isZero()) {
        n = qr[0];
      } else {
        n = n.add(qr[0].add(1));
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long cnt = 0;
    for (long k = 2; k < mN; ++k) {
      if (is(n, k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
