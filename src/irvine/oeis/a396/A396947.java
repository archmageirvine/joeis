package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A396947 Primes of the form x^^y - w^^z, where x &gt;= w &gt;= 2 and y &gt;= z &gt;= 2, and ^^ denotes tetration.
 * @author Sean A. Irvine
 */
public class A396947 extends Sequence1 {

  // After Marco Rip&agrave;

  private int mN = 0;
  private Z mLimit = Z.valueOf(32);
  private ArrayList<Z> mA = new ArrayList<>();

  // Compute a tetration, stopping as soon as the result exceeds m.
  private static Z tet(final long a, final int b, final Z m) {
    Z x = Z.valueOf(a);
    for (int k = 1; k < b; ++k) {
      if (x.compareTo(Z.valueOf(m.bitLength())) >= 0) {
        return m;
      }
      x = Z.valueOf(a).pow(x.longValueExact());
      if (x.compareTo(m) >= 0) {
        return m;
      }
    }
    return x;
  }

  private void extend() {
    final TreeSet<Triple<Z>> v = new TreeSet<>(Comparator.comparing(Triple<Z>::left).thenComparing(Triple::mid).thenComparing(Triple::right));
    for (long r = 2; Z.valueOf(r).pow(r).compareTo(mLimit) < 0; ++r) {
      for (int s = 2; ; ++s) {
        final Z x = tet(r, s, mLimit);
        if (x.compareTo(mLimit) >= 0) {
          break;
        }
        v.add(new Triple<>(x, Z.valueOf(r), Z.valueOf(s)));
      }
    }

    final Set<Z> sums = new HashSet<>();
    for (final Triple<Z> x : v) {
      for (final Triple<Z> y : v) {
        if (x.equals(y)) {
          break;
        }
        if (x.mid().compareTo(y.mid()) >= 0 && x.right().compareTo(y.right()) >= 0) {
          final Z z = x.left().subtract(y.left());
          if (z.compareTo(mLimit) >= 0) {
            break;
          }
          if (z.isProbablePrime()) {
            sums.add(z);
          }
        }
      }
    }

    mA = new ArrayList<>(sums);
    Collections.sort(mA);
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.size() <= mN) {
      extend();
      mLimit = mLimit.multiply2();
    }
    return mA.get(mN - 1);
  }
}
