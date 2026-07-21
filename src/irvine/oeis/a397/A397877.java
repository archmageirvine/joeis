package irvine.oeis.a397;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397877 allocated for Daniel Okwor.
 * @author Sean A. Irvine
 */
public class A397877 extends Sequence2 {

  private int mN = 1;

  private Z f(final Z n) {
    Z p = Z.TWO;
    while (!n.modPow(p.subtract(1), p.square()).isOne()) {
      p = Functions.NEXT_PRIME.z(p);
    }
    return p;
  }

  @Override
  public Z next() {
    ++mN;
    final HashMap<Z, Long> seen = new HashMap<>();
    Z x = Z.valueOf(mN);
    long i = 0;
    while (seen.putIfAbsent(x, i) == null) {
      x = f(x);
      ++i;
    }
    return Z.valueOf(i).subtract(seen.get(x));
  }
}
