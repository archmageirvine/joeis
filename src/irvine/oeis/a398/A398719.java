package irvine.oeis.a398;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398719 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A398719 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int t, final int k, final int r) {
      if (t == 1 && k == 1 && r == 1) {
        return Z.ONE;
      }
      if (t <= 0 || k <= 0 || r <= 0) {
        return Z.ZERO;
      }
      return get(t - 1, k, r + 1).multiply(r + 1).add(get(t - 1, k, r - 1).multiply(k - r + 1)).add(get(t - 1, k - 1, r - 1));
    }
  };

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mB.get(2 * mN - 1, k, 1));
  }
}

