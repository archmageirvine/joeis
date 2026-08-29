package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399068 Numbers of the form x^^y + w^^z, where x, y, w, z are integers greater than 1 and ^^ denotes tetration.
 * @author Sean A. Irvine
 */
public class A399068 extends Sequence1 {

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
    final TreeSet<Z> v = new TreeSet<>();
    for (long r = 2; Z.valueOf(r).pow(r).compareTo(mLimit) < 0; ++r) {
      for (int s = 2; ; ++s) {
        final Z x = tet(r, s, mLimit);
        if (x.compareTo(mLimit) >= 0) {
          break;
        }
        v.add(x);
      }
    }

    final Set<Z> sums = new HashSet<>();
    for (final Z x : v) {
      for (final Z y : v) {
        final Z z = x.add(y);
        if (z.compareTo(mLimit) >= 0) {
          break;
        }
        sums.add(z);
        if (x.equals(y)) {
          break;
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
