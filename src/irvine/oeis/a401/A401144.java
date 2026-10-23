package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401144 Number of steps starting from n until the first repeated value under the map k -&gt; (floor(6*k/5)+1)/5^v_5(floor(6*k/5)+1), where v_5(m) is the 5-adic valuation of m; or -1 if no value ever repeats.
 * @author Sean A. Irvine
 */
public class A401144 extends Sequence1 {

  private long mN = 0;

  private Z reduce5(Z m) {
    while (m.mod(5) == 0) {
      m = m.divide(5);
    }
    return m;
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      m = reduce5(m.multiply(6).divide(5).add(1));
    }
    return Z.valueOf(seen.size());
  }
}
