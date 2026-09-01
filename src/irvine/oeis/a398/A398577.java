package irvine.oeis.a398;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398577 a(n) is the maximum number of unordered representations of an integer as a sum of two positive divisors of n.
 * @author Sean A. Irvine
 */
public class A398577 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisors();
    final HashMap<Z, Long> c = new HashMap<>();
    long m = 0;
    for (final Z dj : d) {
      for (final Z di : d) {
        final Z s = di.add(dj);
        m = Math.max(m, c.merge(s, 1L, Long::sum));
        if (di.equals(dj)) {
          break;
        }
      }
    }
    return Z.valueOf(m);
  }
}
