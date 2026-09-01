package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A397766 Primes of the form x^^y + w^^y, where x, y, w &gt;= 2 and ^^ denotes tetration.
 * @author Sean A. Irvine
 */
public class A397766 extends Sequence1 {

  private int mN = 0;
  private Z mLimit = Z.valueOf(32);
  private ArrayList<Z> mA = new ArrayList<>();

  private void extend() {
    final Set<Z> sums = new HashSet<>();
    for (int s = 2; Z.valueOf(s).pow(s).compareTo(mLimit) < 0; ++s) {
      final TreeSet<Z> v = new TreeSet<>();
      for (long r = 2; ; ++r) {
        final Z x = ZUtils.tetration(r, s, mLimit);
        if (x.compareTo(mLimit) >= 0) {
          break;
        }
        v.add(x);
      }
      for (final Z x : v) {
        for (final Z y : v) {
          final Z z = x.add(y);
          if (z.compareTo(mLimit) >= 0) {
            break;
          }
          if (z.isProbablePrime()) {
            sums.add(z);
          }
          if (x.equals(y)) {
            break;
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
