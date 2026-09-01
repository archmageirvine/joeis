package irvine.oeis.a398;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398435 a(n) is the number of collisions among unordered pairwise sums of positive divisors of n.
 * @author Sean A. Irvine
 */
public class A398435 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisors();
    final HashSet<Z> c = new HashSet<>();
    for (final Z dj : d) {
      for (final Z di : d) {
        final Z s = di.add(dj);
        c.add(s);
        if (di.equals(dj)) {
          break;
        }
      }
    }
    return Z.valueOf(Functions.TRIANGULAR.l(d.length) - c.size());
  }
}
