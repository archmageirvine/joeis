package irvine.oeis.a401;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401592 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A401592 extends Sequence1 {

  private int mN = 0;

  /**
   * Polynomial multiplication over GF(2).
   * Bit i represents the coefficient of x^i.
   * @param a first polynomial
   * @param b second polynomial
   * @return product
   */
  private static Z polyMul(final Z a, final Z b) {
    Z r = Z.ZERO;
    for (int i = 0; i < b.bitLength(); ++i) {
      if (b.testBit(i)) {
        r = r.xor(a.shiftLeft(i));
      }
    }
    return r;
  }

  /**
   * Polynomial remainder over GF(2).
   * @param a dividend
   * @param b divisor
   * @return remainder
   */
  private static Z polyMod(Z a, final Z b) {
    final int db = b.bitLength() - 1;
    while (a.bitLength() > db) {
      a = a.xor(b.shiftLeft(a.bitLength() - 1 - db));
    }
    return a;
  }

  /**
   * Exact polynomial division over GF(2).
   * @param a dividend
   * @param b divisor
   * @return quotient
   */
  private static Z polyDiv(Z a, final Z b) {
    Z q = Z.ZERO;
    final int db = b.bitLength() - 1;
    while (a.bitLength() > db) {
      final int k = a.bitLength() - 1 - db;
      q = q.setBit(k);
      a = a.xor(b.shiftLeft(k));
    }
    if (!a.isZero()) {
      throw new ArithmeticException("Inexact polynomial division");
    }
    return q;
  }

  /**
   * Polynomial GCD over GF(2).
   * @param a first polynomial
   * @param b second polynomial
   * @return gcd
   */
  private static Z polyGcd(Z a, Z b) {
    while (!b.isZero()) {
      final Z t = polyMod(a, b);
      a = b;
      b = t;
    }
    return a;
  }

  /**
   * Polynomial power over GF(2).
   * @param a polynomial
   * @param n exponent
   * @return power
   */
  private static Z polyPow(Z a, int n) {
    Z r = Z.ONE;
    while (n > 0) {
      if ((n & 1) != 0) {
        r = polyMul(r, a);
      }
      n >>= 1;
      if (n != 0) {
        a = polyMul(a, a);
      }
    }
    return r;
  }

  /**
   * Calculate numerator and denominator of xh(n).
   * @param n argument
   * @return numerator and denominator
   */
  static Z[] calculate(final int n) {
    // Collatz parity sequence.
    Z v = Z.valueOf(n);
    final ArrayList<Boolean> w = new ArrayList<>();
    int m = 0;

    while (v.compareTo(Z.ONE) > 0) {
      final boolean odd = v.testBit(0);
      w.add(odd);
      if (odd) {
        ++m;
        v = v.multiply(Z.THREE).add(Z.ONE).divide(Z.TWO);
      } else {
        v = v.divide(Z.TWO);
      }
    }

    final int s = w.size();

    // Construct r over GF(2).
    Z r = Z.ZERO;
    int o = 0;

    for (int k = 1; k <= s; ++k) {
      if (w.get(k - 1)) {
        ++o;
        final Z term = polyMul(Z.ONE.shiftLeft(k - 1), polyPow(Z.THREE, m - o));
        r = r.xor(term);
      }
    }

    // h = (x^s + (1+x+x^2)*r) / ((1+x)^m * (1+x+x^2)).
    final Z numH = Z.ONE.shiftLeft(s).xor(polyMul(Z.SEVEN, r));
    final Z denH = polyMul(polyPow(Z.THREE, m), Z.SEVEN);

    // Reduce rational function over GF(2).
    final Z g = polyGcd(numH, denH);
    final Z num = polyDiv(numH, g);
    final Z den = polyDiv(denH, g);

    // Find multiplicative order of x modulo den.
    int e = 0;
    Z power = Z.ONE;

    do {
      power = polyMod(polyMul(power, Z.TWO), den);
      ++e;
    } while (!power.equals(Z.ONE));

    final Z xePlusOne = Z.ONE.shiftLeft(e).add(Z.ONE);
    final Z cPoly = polyMul(num, polyDiv(xePlusOne, den));
    final int p = Math.max(0, cPoly.bitLength() - e);

    // Lift coefficients to ordinary integers.
    final int[] c = new int[p + e];
    for (int i = 0; i < c.length; ++i) {
      c[i] = cPoly.testBit(i) ? 1 : 0;
    }
    for (int i = e; i < p + e; ++i) {
      c[i] ^= c[i - e];
    }

    // First sum: sum(i=1, p, c[i]*2^(i-1)).
    Z sum1 = Z.ZERO;
    for (int i = 0; i < p; ++i) {
      sum1 = sum1.add(Z.valueOf(c[i]).shiftLeft(i));
    }

    // Second sum: sum(i=1, e, c[p+i]*2^(i-1)).
    Z sum2 = Z.ZERO;
    for (int i = 0; i < e; ++i) {
      sum2 = sum2.add(Z.valueOf(c[p + i]).shiftLeft(i));
    }

    // xh(n) = sum1 + 2^p * sum2 / (1 - 2^e).
    final Z denInt = Z.ONE.subtract(Z.ONE.shiftLeft(e));
    final Z numInt = sum1.multiply(denInt).add(sum2.shiftLeft(p));

    // Reduce rational number.
    final Z gcd = numInt.gcd(denInt);
    Z a = numInt.divide(gcd);
    Z b = denInt.divide(gcd);

    if (b.signum() < 0) {
      a = a.negate();
      b = b.negate();
    }

    return new Z[] {a, b};
  }

  @Override
  public Z next() {
    return calculate(++mN)[0];
  }
}
