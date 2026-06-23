package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397070 Norms of multiplicatively perfect Gaussian integers (Gaussian integers having exactly four divisors up to associates).
 * @author Sean A. Irvine
 */
public class A397070 extends FilterNumberSequence {

  private static boolean hasProduct4(final List<Set<Long>> sets, final int pos, final long prod) {
    if (prod > 4) {
      return false;
    }
    if (pos == sets.size()) {
      return prod == 4;
    }
    for (final long v : sets.get(pos)) {
      if (hasProduct4(sets, pos + 1, prod * v)) {
        return true;
      }
    }
    return false;
  }

  /** Construct the sequence. */
  public A397070() {
    super(1, n -> {
      final ArrayList<Set<Long>> sets = new ArrayList<>();
      final FactorSequence fs = Jaguar.factor(n);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        if (p.mod(4) == 3) {
          if ((e & 1) == 1) {
            return false;
          }
          sets.add(Collections.singleton(e / 2 + 1L));
        } else if (Z.TWO.equals(p)) {
          sets.add(Collections.singleton(e + 1L));
        } else {
          final HashSet<Long> s = new HashSet<>();
          for (int a = 0; a <= e; ++a) {
            final long v = (a + 1L) * (e - a + 1L);
            if (v <= 4) {
              s.add(v);
            }
          }
          sets.add(s);
        }
      }
      return !sets.isEmpty() && hasProduct4(sets, 0, 1);
    });
  }
}
