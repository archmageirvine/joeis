package irvine.oeis.a399;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399458 a(1) = 1. For n &gt; 1, choose the least k &gt;= 1 such that 2^k*a(n-1) - 1 has a divisor not previously occurring in the sequence; a(n) is the least such unused divisor.
 * @author Sean A. Irvine
 */
public class A399458 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      mUsed.add(Z.ONE);
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      for (final Z d : Jaguar.factor(mA.shiftLeft(++k).subtract(1)).divisorsSorted()) {
        if (mUsed.add(d)) {
          mA = d;
          return d;
        }
      }
    }
  }
}
