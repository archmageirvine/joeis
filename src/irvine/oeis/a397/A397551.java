package irvine.oeis.a397;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397551 a(n) is the number of repeated subset sums among binomial(n, 0), ..., binomial(n, floor((n - 1)/2)).
 * @author Sean A. Irvine
 */
public class A397551 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;

    final int m = (mN - 1) / 2;
    final Z[] b = new Z[m + 1];
    for (int k = 0; k <= m; ++k) {
      b[k] = Binomial.binomial(mN, k);
    }

    Map<Z, Integer> sums = new HashMap<>();
    sums.put(Z.ZERO, 1);
    for (final Z x : b) {
      final Map<Z, Integer> next = new HashMap<>(sums);
      for (final Map.Entry<Z, Integer> e : sums.entrySet()) {
        final Z t = e.getKey().add(x);
        next.merge(t, e.getValue(), Integer::sum);
      }
      sums = next;
    }

    long cnt = 0;
    for (final int v : sums.values()) {
      if (v > 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
