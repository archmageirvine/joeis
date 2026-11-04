package irvine.oeis.a401;

import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401515 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A401515 extends Sequence1 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private long mN = 1;
  private Z mN2 = Z.ONE;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.firstKey().compareTo(mN2.square().multiply(4)) > 0) {
      final Z t = Z.valueOf(2 * mN);
      for (long m = (mN & 1) + 1; m < mN; m += 2) {
        if (Functions.GCD.l(mN, m) == 1) {
          final Z u = mN2.add(Z.valueOf(m).square());
          final Z v = mN2.multiply2().add(t.multiply(m)).square().subtract(u);
          if (v.isProbablePrime()) {
            mA.put(v, u);
          }
        }
      }
      mN2 = Z.valueOf(++mN).square();
    }
    return mA.pollFirstEntry().getValue();
  }
}
