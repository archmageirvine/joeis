package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399360 allocated for Stephen Casey.
 * @author Sean A. Irvine
 */
public class A399360 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399360() {
    super(1, n -> {
      Z m = Z.valueOf(n);
      for (final Z d : Jaguar.factor(n).divisorsSorted()) {
        m = m.subtract(d.pow(4));
        if (m.isZero()) {
          return true;
        }
        if (m.signum() < 0) {
          return false;
        }
      }
      return false;
    });
  }
}
