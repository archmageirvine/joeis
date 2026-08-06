package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398230 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A398230 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> vals = new TreeSet<>();
    for (int i = (mN + 2) / 3; i <= mN; ++i) {
      final Z c1 = Binomial.binomial(mN, i);
      final int jMax = Math.min(i, mN - i);
      for (int j = (mN - i + 1) / 2; j <= jMax; ++j) {
        vals.add(c1.multiply(Binomial.binomial(mN - i, j)));
      }
    }
    final ArrayList<Z> list = new ArrayList<>(vals);
    final HashSet<Z> sums = new HashSet<>();
    for (int i = 0; i < list.size(); ++i) {
      final Z a = list.get(i);
      for (int j = i; j < list.size(); ++j) {
        sums.add(a.add(list.get(j)));
      }
    }
    final long m = list.size();
    return Z.valueOf(m * (m + 1L) / 2 - sums.size());
  }
}
