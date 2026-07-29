package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A397755 Number of steps to reach 0 for the sequence b_n(m) defined in the A397774, or 0 if b_n(m) does not terminate.
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
