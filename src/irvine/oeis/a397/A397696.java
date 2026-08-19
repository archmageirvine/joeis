package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.math.cr.CR;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397696 allocated for Lark Song.
 * @author Sean A. Irvine
 */
public class A397696 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<CR> s = new TreeSet<>();
    long zeros = 0;
    for (long k = mN; k <= 2 * mN; ++k) {
      if (Predicates.SQUARE.is(k)) {
        ++zeros;
      } else {
        s.add(CR.valueOf(k).sqrt().frac());
      }
    }
    final CR lim = CR.valueOf(new Q(1, mN));
    long cnt = zeros - 1;
    CR prev = zeros > 0 ? CR.ZERO : CR.NEG_ONE;
    for (final CR v : s) {
      if (v.subtract(prev).compareTo(lim) < 0) {
        ++cnt;
      }
      prev = v;
    }
    return Z.valueOf(cnt);
  }
}

