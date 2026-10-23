package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399161 Primes of the form 42*10^(k+2) + 43.
 * @author Sean A. Irvine
 */
public class A399161 extends Sequence1 {

  private Z mA = Z.valueOf(420);

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(10);
      final Z t = mA.add(43);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
