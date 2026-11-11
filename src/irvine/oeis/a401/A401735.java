package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401735 Lexicographically earliest square array of nonnegative integers, read by antidiagonals, with no axis-parallel square whose four corners are equal.
 * @author Sean A. Irvine
 */
public class A401735 extends Sequence1 {

  private int mN = 0;
  private int mM = -1;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Long compute(final int x, final int y) {
      final HashSet<Long> s = new HashSet<>();
      for (int d = 1; d <= Math.min(x, y); ++d) {
        final Long v = mB.get(x - d, y);
        if (v.equals(mB.get(x, y - d)) && v.equals(mB.get(x - d, y - d))) {
          s.add(v);
        }
      }
      return LongUtils.mex(s);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mB.get(mM, mN - mM));
  }
}
