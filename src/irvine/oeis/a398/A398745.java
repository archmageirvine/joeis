package irvine.oeis.a398;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A398745 allocated for Igor Zhuk.
 * @author Sean A. Irvine
 */
public class A398745 extends Sequence1 {

  private long mN = 0;

  private static long f(final long c, final long p, final long an, final long invb) {
    final long c2 = LongUtils.modMultiply(c, c, p);
    final long t = c2 >= an ? c2 - an : p - (an - c2);
    return LongUtils.modMultiply(LongUtils.modMultiply(c, t, p), invb, p);
  }

  private static boolean is(final long p, final long n, final long dfix) {
    final long nm = n % p;
    final long np1 = LongUtils.modAdd(nm, 1, p);
    final long bn = LongUtils.modMultiply(nm, np1, p);
    if (bn == 0) {
      return false;
    }

    if (dfix % p != 0 && LongUtils.modPow(dfix % p, p >> 1, p) == 1) {
      return false;
    }

    final long an = LongUtils.modAdd(LongUtils.modAdd(LongUtils.modMultiply(nm, nm, p), nm, p), 1, p);
    final long invb = LongUtils.modInverse(bn, p);

    // 0 = unvisited, 1 = currently on a path, 2 = finished.
    final LongDynamicByteArray st = new LongDynamicByteArray();
    st.set(0, (byte) 2);
    st.set(1, (byte) 2);
    st.set(p - 1, (byte) 2);

    for (long x = 2; x <= (p >> 1); ++x) {
      if (st.get(x) == 2) {
        continue;
      }
      long c = x;
      while (st.get(c) == 0) {
        st.set(c, (byte) 1);
        c = f(c, p, an, invb);
      }
      if (st.get(c) == 1) {
        return false;
      }
      c = x;
      while (st.get(c) == 1) {
        st.set(c, (byte) 2);
        st.set(p - c, (byte) 2);
        c = f(c, p, an, invb);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final long dfix = Math.addExact(Math.multiplyExact(mN, mN), Math.multiplyExact(mN + 1, mN + 1));
    final long r = Functions.SQRT.l(dfix);
    if (r * r == dfix) {
      return Predicates.PRIME.is(r) && is(r, mN, dfix) ? Z.valueOf(r) : Z.ZERO;
    }
    long p = Math.max(5, mN + 2);
    while (!Predicates.PRIME.is(p) || !is(p, mN, dfix)) {
      ++p;
    }
    return Z.valueOf(p);
  }
}
