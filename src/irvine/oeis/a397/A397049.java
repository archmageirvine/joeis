package irvine.oeis.a397;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397049 Number of sets S of nonempty words with n total letters such that no words in S share letters and the concatenation of all words in S covers an initial interval.
 * @author Sean A. Irvine
 */
public class A397049 extends Sequence0 {

  private static final SeriesRing<Z> SZ = SeriesRing.SZ;

  private int mN = -1;

  private final MemoryFunction1<Series<Z>> mB = new MemoryFunction1<>() {
    @Override
    protected Series<Z> compute(final int k) {
      Series<Z> den = SZ.one();
      for (int i = 1; i <= k; ++i) {
        den = SZ.multiply(den, SZ.create(Z.ONE, Z.valueOf(-i)));
      }
      return SZ.divide(SZ.monomial(Functions.FACTORIAL.z(k), k), den);
    }
  };

  private Z a(final int k, final int n) {
    Z sum = Z.ZERO;
    final IntegerPartition ip = new IntegerPartition(k);
    int[] p;
    final int[] cnt = new int[k + 1];
    while ((p = ip.next()) != null) {
      IntegerPartition.toCountForm(p, cnt);
      Z mult = Functions.FACTORIAL.z(k);
      Series<Z> prod = SZ.one();
      for (int part = 1; part < cnt.length; ++part) {
        final int c = cnt[part];
        if (c != 0) {
          mult = mult.divide(Functions.FACTORIAL.z(part).pow(c)).divide(Functions.FACTORIAL.z(c));
          for (int j = 0; j < c; ++j) {
            prod = SZ.multiply(prod, mB.get(part));
          }
        }
      }
      sum = sum.add(SZ.multiply(prod, mult).coeff(n));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(a(k, mN));
    }
    return sum;
  }
}
