package irvine.oeis.a400;

import java.util.Arrays;
import java.util.HashMap;

import irvine.factor.util.FactorUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A400108 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A400108 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicArray<HashMap<String, Integer>> mA = new LongDynamicArray<>();

  @Override
  public Z next() {
    final long s0 = Functions.SIGMA0.l(++mN);
    final String key = Arrays.toString(FactorUtils.sortedPrimeSignature(Z.valueOf(mN)));
    if (mA.get(s0) == null) {
      mA.set(s0, new HashMap<>());
    }
    final int size = mA.get(s0).size();
    return Z.valueOf(mA.get(s0).computeIfAbsent(key, v -> size) + 1);
  }
}
