package irvine.oeis.a399;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A399190 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A399190 extends Sequence2 {

  private int mN = 1;
  private final ArrayList<Z> mSwing = new ArrayList<>();
  {
    mSwing.add(Z.ONE);
  }

  private boolean is(final int base, Z val, final int[] combo) {
    int k = 0;
    while (!val.isZero()) {
      final Z[] qr = val.divideAndRemainder(base);
      if (qr[1].intValueExact() != combo[k]) {
        return false;
      }
      val = qr[0];
      ++k;
    }
    return true;
  }

  @Override
  public Z next() {
    final Z sw = Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(mN / 2).square());
    mSwing.add(sw);
    final Z n = Z.valueOf(++mN);
    int kMax = 1;
    while (n.pow(kMax - 1).compareTo(sw.multiply(kMax)) <= 0) {
      ++kMax;
    }
    --kMax;
    long cnt = 0;
    for (int d = 1; d < mN; ++d) {
      if (mSwing.get(d).equals(d)) {
        ++cnt;
      }
    }
    final Bumper bumper = BumperFactory.range(0, mN - 1);
    for (int k = 2; k <= kMax; ++k) {
      final int[] combo = new int[k];
      do {
        Z s = Z.ZERO;
        for (final int v : combo) {
          s = s.add(mSwing.get(v));
        }
        if (s.signum() > 0) {
          if (Functions.DIGIT_LENGTH.l(mN, s) == k) {
            if (is(mN, s, combo)) {
              ++cnt;
            }
          }
        }
      } while (bumper.bump(combo));
    }
    return Z.valueOf(cnt);
  }
}
