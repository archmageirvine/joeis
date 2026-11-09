package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

public class A397673 extends Sequence0 {

  // After Andrew Howroyd

  private long mN = 0;
  private long mM = 0;

  /**
   * A397673 Shortest sides, r, of right-angled triangles (r,s,x+y) that can be dissected into two distinct integer-sided right-angled triangles corresponding to primitive solutions of five side lengths (r,s,x,y,z).
   * @param fs factorization of r
   * @param index current prime index
   * @param value current divisor
   * @param divisors list of divisors
   */
  private static void divisors(final FactorSequence fs, final int index, final Z value, final List<Z> divisors) {
    if (index >= fs.omega()) {
      divisors.add(value);
      return;
    }
    final Z p = fs.toZArray()[index];
    final int exp = 2 * fs.getExponent(p);
    Z v = value;
    for (int e = 0; e <= exp; ++e) {
      divisors(fs, index + 1, v, divisors);
      v = v.multiply(p);
    }
  }

  /**
   * Count admissible solutions for r.
   * @param r parameter
   * @return number of solutions
   */
  private static long isok(final long r) {
    final Z rz = Z.valueOf(r);
    final Z r2 = rz.square();
    final FactorSequence fs = Jaguar.factor(rz);
    final List<Z> divs = new ArrayList<>();
    divisors(fs, 0, Z.ONE, divs);
    long count = 0;
    for (final Z d : divs) {
      final Z sNumerator = r2.divide(d).subtract(d);
      if (sNumerator.isOdd()) {
        continue;
      }
      final Z s = sNumerator.divide(Z.TWO);
      if (s.compareTo(rz) <= 0) {
        continue;
      }
      final Z ypx = s.add(d);
      final Z numerator = s.square().subtract(r2);
      final Z[] qr = numerator.divideAndRemainder(ypx);
      if (!qr[1].isZero()) {
        continue;
      }
      final Z xNumerator = ypx.subtract(qr[0]);
      if (xNumerator.isOdd()) {
        continue;
      }
      final Z x = xNumerator.divide(Z.TWO);
      final Z radicand = r2.subtract(x.square());
      if (radicand.signum() < 0) {
        continue;
      }
      if (!radicand.isSquare()) {
        continue;
      }
      if (rz.gcd(s).gcd(x).equals(Z.ONE)) {
        ++count;
      }
    }
    return count;
  }

  @Override
  public Z next() {
    while (mM == 0) {
      mM = isok(++mN);
    }
    --mM;
    return Z.valueOf(mN);
  }
}
