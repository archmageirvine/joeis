package irvine.oeis.a400;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a027.A027746;

/**
 * A400535 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A400535 extends A027746 {

  private final TreeSet<Z> mA = new TreeSet<>();

  private boolean bump(final int[] s, final int[] lim) {
    for (int k = s.length - 1; k >= 0; --k) {
      s[k] = Functions.NEXT_PRIME.i(s[k]);
      if (s[k] <= lim[k]) {
        return true;
      }
      s[k] = 1;
    }
    return false;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
      final int[] lim = new int[mList.size()];
      for (int k = 0; k < lim.length; ++k) {
        lim[k] = mList.get(k).intValueExact();
      }
      final int[] tuple = new int[mList.size()];
      Arrays.fill(tuple, 1);
      do {
        mA.add(Functions.PRODUCT.z(tuple));
      } while (bump(tuple, lim));
      //System.out.println(mList + " -> " + mA);
    }
    return mA.pollFirst();
  }
}
