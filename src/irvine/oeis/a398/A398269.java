package irvine.oeis.a398;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A398269 allocated for Parsa Ansari.
 * @author Sean A. Irvine
 */
public class A398269 extends Sequence1 {

  private int mN = 0;

  private final MemoryFunction<String, Integer> mB = new MemoryFunction<>() {
    @Override
    protected Integer compute(final String r) {
      if (r.isEmpty()) {
        return 1;
      }
      int cnt = 0;
      for (int k = 1; k <= r.length(); ++k) {
        if (Roman.parse(r.substring(0, k)) != 0) {
          cnt += getValue(r.substring(k));
        }
      }
      return cnt;
    }
  };

  @Override
  public Z next() {
    if (mN == 3999) {
      return null; // sequence is finite
    }
    return Z.valueOf(mB.getValue(Roman.roman(++mN)));
  }
}
