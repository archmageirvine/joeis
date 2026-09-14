package irvine.oeis.a398;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398414 a(1) = 2. For n &gt; 1, choose the least k &gt;= 1 such that 2^k*a(n-1) - 1 has a prime factor not previously occurring in the sequence; a(n) is the least such unused factor.
 * @author Sean A. Irvine
 */
public class A398414 extends Sequence1 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.add(Z.TWO);
      mA = Z.TWO;
      return Z.TWO;
    }
    long k = 0;
    while (true) {
      final Z t = mA.shiftLeft(++k).subtract(1);
      for (final Z p : Jaguar.factor(t).toZArray()) {
        if (mUsed.add(p)) {
          mA = p;
          return p;
        }
      }
    }
  }
}

