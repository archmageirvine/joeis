package irvine.oeis.a401;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401143 Number of steps starting from 2*n-1 until the first repeated value under the map k -&gt; (5*k+3)/2^v_2(5*k+3) if k == 1 (mod 4) and k -&gt; (5*k+1)/2^v_2(5*k+1) if k == 3 (mod 4) where v_2(k) = A007814(k); or -1 if no value ever repeats.
 * @author Sean A. Irvine
 */
public class A401143 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    Z m = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      if (m.mod(4) == 1) {
        m = m.multiply(5).add(3);
      } else {
        m = m.multiply(5).add(1);
      }
      m = m.makeOdd();
    }
    return Z.valueOf(seen.size());
  }
}
