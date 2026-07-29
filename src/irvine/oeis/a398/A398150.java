package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398150 a(n) = L1 distance between rows n and n+1 of A027746.
 * @author Sean A. Irvine
 */
public class A398150 extends Sequence1 {

  private long mN = 0;

  private List<Z> toList(final long n) {
    final ArrayList<Z> lst = new ArrayList<>();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      for (int k = 0; k < fs.getExponent(p); ++k) {
        lst.add(p);
      }
    }
    return lst;
  }

  @Override
  public Z next() {
    final List<Z> a = toList(++mN);
    final List<Z> b = toList(mN + 1);
    Z sum = Z.ZERO;
    for (int k = a.size() - 1, j = b.size() - 1; k >= 0 || j >= 0; --k, --j) {
      sum = sum.add((k < 0 ? Z.ONE : a.get(k)).subtract(j < 0 ? Z.ONE : b.get(j)).abs());
    }
    return sum;
  }
}
