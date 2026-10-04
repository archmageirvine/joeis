package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A400127 Least m such that every binary word of length n occurs as a contiguous subword of the binary representation of 3^k for some 0 &lt;= k &lt;= m.
 * @author Sean A. Irvine
 */
public class A400127 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    long m = 0;
    final long mod = 1L << mN;
    final Z min = Z.valueOf(1L << (mN - 1));
    long expected = mod;
    while (expected != 0) {
      Z t = Z.THREE.pow(++m);
      while (t.compareTo(min) >= 0) {
        final long r = t.mod(mod);
        if (!seen.isSet(r)) {
          --expected;
          seen.set(r);
        }
        t = t.divide2();
      }
    }
    return Z.valueOf(m);
  }
}

