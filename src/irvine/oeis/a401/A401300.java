package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401300 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A401300 extends FilterNumberSequence {

  private static boolean t(final Z p, final int e) {
    return (e == 1 && p.mod(3) <= 1) || (e == 2 && p.mod(3) == 2);
  }

  /** Construct the sequence. */
  public A401300() {
    super(1, 12, n -> {
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.omega() > 2) {
        return false;
      }
      if (fs.omega() == 1) {
        final Z p = fs.toZArray()[0];
        final int e = fs.getExponent(p);
        if (e == 3 && Z.THREE.equals(p)) {
          return true; // 27
        }
        if ((e == 2 || e == 3) && p.mod(3) == 1) {
          return true;
        }
        return e == 6 && p.mod(3) == 2;
      } else {
        // omega == 2
        final Z[] p = fs.toZArray();
        return t(p[0], fs.getExponent(p[0])) && t(p[1], fs.getExponent(p[1]));
      }
    });
  }
}
