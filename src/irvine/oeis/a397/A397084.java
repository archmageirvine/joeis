package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397084 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A397084 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    final String s = mA.toString();
    for (int d = 0; d < 10; ++d) {
      for (int pos = d == 0 ? 1 : 0; pos <= s.length(); ++pos) {
        final Z t = new Z(s.substring(0, pos) + d + s.substring(pos));
        if (t.isProbablePrime()) {
          mA = t;
          return t;
        }
      }
    }
    return null; // sequence terminates
  }
}
