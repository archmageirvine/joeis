package irvine.oeis.a399;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399060.
 * @author Sean
 */
public class A399937 extends Sequence0 {

  private int mN = -1;

  // The following is a "standard" implementation, but uses of lot of memory

  private final MemoryFunctionInt3<Integer> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Integer compute(final int n, final int m, final int s) {
      return get(n - m, Math.min(m - 1, n - m), s - Functions.PRIME_PI.i(m)) + get(n, m - 1, s);
    }

    @Override
    public Integer get(final int n, final int m, final int s) {
      // This is quite memory intensive, so avoid storing trivial values
      if (m <= 0) {
        return n == 0 && s == 0 ? 1 : 0;
      }
      return super.get(n, m, s);
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mB.get(++mN, mN, Functions.PRIME_PI.i(mN)));
  }

  // The following works up to 1 << M_BITS, provided you have enough memory

//  private static final int S_BITS = 10;
//  private static final int M_BITS = 13;
//  private final LongDynamicByteArray mCache = new LongDynamicByteArray();
//
//  private int getOrCompute(final int n, final int m, final int s) {
//    if (m <= 0) {
//      return n == 0 && s == 0 ? 1 : 0;
//    }
//    if (n < 0 || s < 0) {
//      return 0;
//    }
//    if (s >= 1 << S_BITS) {
//      throw new UnsupportedOperationException("s requires more than " + S_BITS + " bits");
//    }
//    if (m >= 1 << M_BITS) {
//      throw new UnsupportedOperationException("m requires more than " + M_BITS + " bits");
//    }
//    final long key = (((((long) n) << M_BITS) + (long) m) << S_BITS) + s;
//    final int v = mCache.get(key);
//    if (v != 0) {
//      return v - 1;
//    }
//    final int compute = getOrCompute(n - m, Math.min(m - 1, n - m), s - Functions.PRIME_PI.i(m)) + getOrCompute(n, m - 1, s);
//    mCache.set(key, (byte) (compute + 1));
//    return compute;
//  }
//
//  @Override
//  public Z next() {
//    return Z.valueOf(getOrCompute(++mN, mN, Functions.PRIME_PI.i(mN)));
//  }
}
