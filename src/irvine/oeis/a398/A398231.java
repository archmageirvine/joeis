package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398231 a(n) is the number of distinct unordered pairwise sums with repetition of the distinct trinomial coefficient values of order n that have more than one representation.
 * @author Sean A. Irvine
 */
public class A398231 extends Sequence0 {

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
    final HashMap<Z, Integer> seen = new HashMap<>();
    long count = 0;
    for (int i = 0; i < list.size(); ++i) {
      final Z a = list.get(i);
      for (int j = i; j < list.size(); ++j) {
        final Z sum = a.add(list.get(j));
        final Integer v = seen.get(sum);
        if (v == null) {
          seen.put(sum, 1);
        } else if (v == 1) {
          ++count;
          seen.put(sum, 2);
        }
      }
    }
    return Z.valueOf(count);
  }
}

