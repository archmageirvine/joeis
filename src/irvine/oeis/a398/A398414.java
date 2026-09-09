package irvine.oeis.a398;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398414 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A398414 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.add(Z.TWO);
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 0;
    while (true) {
      final Z t = mA.shiftLeft(++k).subtract(1);
      for (final Z p : Jaguar.factor(t).toZArray()) {
        if (mUsed.add(p)) {
          mA = p;
          return p;
        }
      }
    }
  }
}

