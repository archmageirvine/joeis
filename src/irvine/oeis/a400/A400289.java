
package irvine.oeis.a400;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400289 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A400289 extends Sequence1 {

  // After Michael S. Branicky

  private int mB = 0;

  private static int[] digits(final Z n, final int base) {
    Z t = n;
    final ArrayList<Integer> d = new ArrayList<>();
    while (!t.isZero()) {
      final Z[] qr = t.divideAndRemainder(Z.valueOf(base));
      d.add(qr[1].intValue());
      t = qr[0];
    }
    final int[] res = new int[d.size()];
    for (int k = 0; k < res.length; ++k) {
      res[k] = d.get(res.length - 1 - k);
    }
    return res;
  }

  private boolean ok(final int b) {
    for (int x = 1; x < b - 1; ++x) {
      for (int y = x + 1; y < b; ++y) {
        final Z p = Functions.PRIME.z((long) b * x + y);
        final Z q = Functions.PRIME.z((long) b * y + x);
        final int[] dp = digits(p, b);
        final int[] dq = digits(q, b);
        if (dp.length == dq.length) {
          boolean match = true;
          for (int k = 0; k < dp.length; ++k) {
            if (dp[dp.length - 1 - k] != dq[k]) {
              match = false;
              break;
            }
          }
          if (match) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mB;
      if (ok(mB)) {
        return Z.valueOf(mB);
      }
    }
  }
}
