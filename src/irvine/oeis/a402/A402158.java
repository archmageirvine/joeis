package irvine.oeis.a402;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A402158 allocated for Igor Zhuk.
 * @author Sean A. Irvine
 */
public class A402158 extends Sequence0 {

  private static final int[] A = {5, 6, -2, -4, 2, 9, -1};
  private long mP = 2;
  private final Fast mPrime = new Fast();

  private static long f(final long c, final long p) {
    long s = 1;
    for (final int v : A) {
      s = Math.floorMod(s * c + v, p);
    }
    return Math.floorMod((c + 2) * s + c, p);
  }

  private static boolean isOk(final long p) {
    if (p > 17 && LongUtils.modPow(-251, p >> 1, p) != 1) { //powMod(-251, p >> 1, p) != 1) {
      return false;
    }
    final LongDynamicByteArray st = new LongDynamicByteArray();
    st.set(0, (byte) 2);
    st.set(p - 2, (byte) 2);
    for (long z = 1; z < p; ++z) {
      if (st.get(z) == 2) {
        continue;
      }
      long c = z;
      while (st.get(c) == 0) {
        st.set(c, (byte) 1);
        c = f(c, p);
      }
      if (st.get(c) == 1) {
        return false;
      }
      c = z;
      while (st.get(c) == 1) {
        st.set(c, (byte) 2);
        c = f(c, p);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (isOk(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
