package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399491 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A399491 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).square().add(1);
    long m = mN;
    while (true) {
      if (Predicates.SQUARE.is(t.multiply(Z.valueOf(++m).square().add(1)))) {
        return Z.valueOf(m);
      }
    }
  }
}
