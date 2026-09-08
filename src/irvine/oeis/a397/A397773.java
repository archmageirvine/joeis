package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397773 a(n) is the number of distinct values of Sum_{x=0..n-1} exp(2*Pi*i*c*x^n/n^2) as c runs over the residues s^(2*(n-1)) mod n^2 with gcd(s,n) = 1.
 * @author Sean A. Irvine
 */
public class A397773 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final long k = (mN & 1) == 0 ? 2 : 1;
    Z r = (mN & 3) == 0 ? Z.TWO : Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (p.isOdd() && e == 1) {
        final long pp = p.longValue();
        r = r.multiply(p.multiply(Functions.GCD.l(mN / pp, pp - 1)).divide(k));
      }
    }
    return r;
  }
}

