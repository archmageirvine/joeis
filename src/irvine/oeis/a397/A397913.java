package irvine.oeis.a397;

import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397913 allocated for Ryota Inagaki.
 * @author Sean A. Irvine
 */
public class A397913 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;
  private final MemoryFunction3<Z, Z> mC = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Z m, final Z a, final Z b) {
      if (a.signum() < 0) {
        return Z.ZERO;
      }
      if (b.isZero()) {
        return m;
      }
      return get(m, a, b.subtract(1)).add(get(m, a.subtract(1), b)).divide2();
    }
  };

  private Z t(final long x, final long y) {
    Z lo = Z.valueOf(y + 1);
    Z hi = Z.ONE.shiftLeft(y);
    final Z xx = Z.valueOf(x);
    final Z yy = Z.valueOf(y);
    while (lo.compareTo(hi) < 0) {
      final Z m = lo.add(hi).divide2();
      if (mC.get(m, xx, yy).signum() > 0) {
        hi = m;
      } else {
        lo = m.add(1);
      }
    }
    return lo;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
