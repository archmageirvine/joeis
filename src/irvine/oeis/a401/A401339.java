package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a343.A343550;

/**
 * A401339 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A401339 extends A343550 {

  private final HashSet<Z> mSeen = new HashSet<>();

  private boolean ok(Z t) {
    do {
      final Z[] qr = t.divideAndRemainder(10);
      if (!qr[1].isZero()) {
        return true;
      }
      t = qr[0];
      if (mSeen.contains(t)) {
        return false;
      }
    } while (t.compareTo(Z.TEN) >= 0);
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (ok(t)) {
        mSeen.add(t);
        return t;
      }
    }
  }
}
