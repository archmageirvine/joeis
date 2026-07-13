package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397654 allocated for Robert G. Wilson v.
 * @author Sean A. Irvine
 */
public class A397654 extends Sequence2 {

  private long mN = 1;

  private List<Long> digits(long k) {
    final ArrayList<Long> d = new ArrayList<>();
    while (k != 0) {
      d.add(k % mN);
      k /= mN;
    }
    return d;
  }

  private boolean is(final long k) {
    if (Predicates.PRIME.is(k)) {
      return false;
    }
    final List<Long> lst = digits(k);
    final List<Long> f = new ArrayList<>();
    for (final Z p : Jaguar.factor(k).toZArray()) {
      f.addAll(digits(p.longValue()));
    }
    if (f.size() != lst.size()) {
      return false;
    }
    Collections.sort(lst);
    Collections.sort(f);
    return lst.equals(f);
  }

  @Override
  public Z next() {
    ++mN;
    long k = (mN + 1) * (mN + 1);
    while (!is(k)) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
