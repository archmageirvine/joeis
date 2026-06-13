package irvine.oeis.a396;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007774;

/**
 * A396597 Numbers m with exactly two distinct prime factors q and p such that m = q^k * p^j and p &gt; q^k with k, j &gt;= 1.
 * @author Sean A. Irvine
 */
public class A396597 extends FilterSequence {

  /** Construct the sequence. */
  public A396597() {
    super(1, new A007774(), k -> {
      final FactorSequence fs = Jaguar.factor(k);
      assert fs.omega() == 2;
      final Z[] p = fs.toZArray();
      return p[1].compareTo(p[0].pow(fs.getExponent(p[0]))) > 0 || p[0].compareTo(p[1].pow(fs.getExponent(p[1]))) > 0;
    });
  }
}
