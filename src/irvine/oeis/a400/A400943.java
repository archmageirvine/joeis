package irvine.oeis.a400;

import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400943 Maximum length J of a chain of factorizations j*n = d(j)*e(j) (j = 1..J) with d(1), e(1) &gt;= 2, d(j+1) &gt;= d(j) + 2 and e(j+1) &gt;= e(j) + 2.
 * @author Sean A. Irvine
 */
public class A400943 extends Sequence1 {

  // After Siegfried Pohl

  private long mN = 0;

  private static Set<Z> ddNext(final Z n, final int j, final Set<Z> r) {
    final Z nn = n.multiply(j + 1);
    final Set<Z> result = new TreeSet<>();
    final Z[] divs = Jaguar.factor(nn).divisors();
    for (final Z d : r) {
      final Z e = n.multiply(j).divide(d);
      final Z u = nn.divide(e.add(2));
      for (final Z dv : divs) {
        if (dv.compareTo(d.add(2)) >= 0 && dv.compareTo(u) <= 0) {
          result.add(dv);
        }
      }
    }
    return result;
  }

  @Override
  public Z next() {
    ++mN;
    final Z n = Z.valueOf(mN);
    Set<Z> r = new TreeSet<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.compareTo(Z.TWO) >= 0 && d.multiply2().compareTo(n) <= 0) {
        r.add(d);
      }
    }
    int j = 0;
    while (!r.isEmpty()) {
      ++j;
      r = ddNext(n, j, r);
    }
    return Z.valueOf(j);
  }
}
