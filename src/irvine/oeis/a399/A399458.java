package irvine.oeis.a399;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399458 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A399458 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      for (final Z d : Jaguar.factor(mA.shiftLeft(++k).subtract(1)).divisorsSorted()) {
        if (mUsed.add(d)) {
          mA = d;
          return d;
        }
      }
    }
  }
}
