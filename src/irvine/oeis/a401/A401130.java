package irvine.oeis.a401;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401130 allocated for Adam Benzan.
 * @author Sean A. Irvine
 */
public class A401130 extends Sequence0 {

  private static final int B = 9;
  private final int[] mW = new int[2 * B + 1];
  private int mN = -1;

  /** Construct the sequence. */
  public A401130() {
    for (int i = 0; i <= B; ++i) {
      for (int j = 0; j <= B; ++j) {
        ++mW[i + j];
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int k = mN / B + 1;
    final int initial = B * k - mN;
    Map<Integer, Z> w = new HashMap<>();
    w.put(initial, Z.ONE);
    for (int s = 0; s < k; ++s) {
      final int cap = s < k - 1 ? 1 : 0;
      final Map<Integer, Z> nxt = new HashMap<>();
      for (Map.Entry<Integer, Z> entry : w.entrySet()) {
        final int d = entry.getKey();
        final Z c = entry.getValue();
        for (int m = 0; m < mW.length; ++m) {
          if (d + m - B <= cap && mW[m] != 0) {
            final int nd = d + m - B;
            final Z add = c.multiply(mW[m]);
            nxt.merge(nd, add, Z::add);
          }
        }
      }
      w = nxt;
    }
    Z sum = Z.ZERO;
    for (Z c : w.values()) {
      sum = sum.add(c);
    }
    return sum;
  }
}
