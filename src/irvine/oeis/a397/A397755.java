package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A397755 allocated for Bill McEachen.
 * @author Sean A. Irvine
 */
public class A397755 extends A397774 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence b = new A397774.Row(++mN);
    long cnt = 0;
    while (!b.next().isZero()) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
