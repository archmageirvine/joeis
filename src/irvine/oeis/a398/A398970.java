package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398970 Weak Carmichael numbers of the form (6*m+1)*(12*m+1)*(18*m+1) where exactly one linear factor is composite.
 * @author Sean A. Irvine
 */
public class A398970 extends Sequence1 {

  private long mN = 0;

  private Z is(final long m) {
    final Z t0 = Z.valueOf(6 * m + 1);
    final Z t1 = Z.valueOf(12 * m + 1);
    final Z t2 = Z.valueOf(18 * m + 1);
    final int pCount = (t0.isProbablePrime() ? 1 : 0) + (t1.isProbablePrime() ? 1 : 0) + (t2.isProbablePrime() ? 1 : 0);
    if (pCount != 2) {
      return null;
    }
    final FactorSequence fs = new FactorSequence();
    fs.add(t0);
    fs.add(t1);
    fs.add(t2);
    Jaguar.factor(fs);
    final Z t = t0.multiply(t1).multiply(t2);
    final Z tm = t.subtract(1);
    for (final Z p : fs.toZArray()) {
      if (!tm.mod(p.subtract(1)).isZero()) {
        return null;
      }
    }
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = is(++mN);
      if (t != null) {
        return t;
      }
    }
  }
}
