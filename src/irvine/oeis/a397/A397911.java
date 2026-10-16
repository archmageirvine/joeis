package irvine.oeis.a397;

import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397911 allocated for Antonio Mennillo.
 * @author Sean A. Irvine
 */
public class A397911 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mSum = mSum.add(p);
      if (mSum.compareTo(CrFunctions.LI.cr(p.square()).ceil()) >= 0) {
        return p;
      }
    }
  }
}
