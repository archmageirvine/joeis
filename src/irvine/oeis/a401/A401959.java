package irvine.oeis.a401;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A401959 Primes p such that the iteration of T(z) = (z + 2)*(z^3 + 2*z - 1) + z collapses every element of GF(p) to -2.
 * @author Sean A. Irvine
 */
public class A401959 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  private static long f(final long c, final long p) {
    final long a = c * (c + 2L) % p;
    final long b = (c * c + 2) % p;
    return (a * b - 2 + p) % p;
  }

  private static long powMod(long base, long exp, final long mod) {
    base = (base % mod + mod) % mod;
    long result = 1;
    while (exp > 0) {
      if ((exp & 1) != 0) {
        result = result * base % mod;
      }
      base = base * base % mod;
      exp >>>= 1;
    }
    return result;
  }

  private static boolean is(final long p) {
    if (p > 13 && powMod(-59, p / 2, p) != 1) {
      return false;
    }
    // 0 = unvisited, 1 = current path, 2 = completed
    final LongDynamicByteArray st = new LongDynamicByteArray();
    st.set(0, (byte) 2);
    st.set(p - 2, (byte) 2);
    for (int z = 1; z < p; ++z) {
      if (st.get(z) == 2) {
        continue;
      }
      // Follow the orbit, marking the current path.
      long c = z;
      while (st.get(c) == 0) {
        st.set(c, (byte) 1);
        c = f(c, p);
      }
      // Encountering the current path means a new cycle.
      if (st.get(c) == 1) {
        return false;
      }
      // Mark the completed path.
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
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
