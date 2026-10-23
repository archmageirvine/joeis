package irvine.oeis.a400;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400863 Least degree of a nonzero polynomial P(t) over GF(2) such that x^n - 1 divides P(1 + x + x^3).
 * @author Sean A. Irvine
 */
public class A400863 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z modulus = Z.ONE.shiftLeft(++mN).add(1);
    final Map<Integer, Z> pivots = new HashMap<>();
    Z power = Z.ONE;
    for (int degree = 0; degree <= mN; ++degree) {
      Z value = power;
      while (!value.isZero() && pivots.containsKey(value.bitLength())) {
        value = value.xor(pivots.get(value.bitLength()));
      }
      if (value.isZero()) {
        return Z.valueOf(degree);
      }
      pivots.put(value.bitLength(), value);
      // Multiply by 1+x+x^3 over GF(2)
      power = power.xor(power.shiftLeft(1)).xor(power.shiftLeft(3));
      // Reduce modulo x^n+1
      while (power.bitLength() > mN) {
        power = power.xor(modulus.shiftLeft(power.bitLength() - mN - 1));
      }
    }
    throw new RuntimeException("No linear dependence found for n=" + mN);
  }
}
