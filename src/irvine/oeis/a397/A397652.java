package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397652 Number of equivalence classes of Boolean functions of n variables under cyclic rotations of the variables.
 * @author Gregory Morse
 */
public class A397652 extends Sequence1 {
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    ++mN;
    for (final Z q : Jaguar.factor(mN).divisors()) {
      Z cycles = Z.ZERO;
      for (final Z d : Jaguar.factor(q).divisors()) {
        cycles = cycles.add(Functions.PHI.z(d).shiftLeft(mN / d.longValueExact()));
      }
      sum = sum.add(Functions.PHI.z(q).shiftLeft(cycles.divide(q).longValueExact()));
    }
    return sum.divide(mN);
  }
}
