package irvine.oeis.a399;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399003 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A399003 extends Sequence0 {

  private final Map<Integer, Z> mFirst = new HashMap<>();
  private Z mP = Z.ONE;
  private int mN = 0;

  private int f(final Z n) {
    int c = 0;
    Z pow10 = Z.TEN;
    while (true) {
      final Z[] qr = n.divideAndRemainder(pow10);
      if (qr[0].isZero()) {
        return c;
      }
      if (qr[0].isProbablePrime() && qr[1].isProbablePrime()) {
        ++c;
      }
      pow10 = pow10.multiply(10);
    }
  }

  @Override
  public Z next() {
    while (true) {
      mP = Functions.NEXT_PRIME.z(mP);
      final int v = f(mP.square());
      mFirst.putIfAbsent(v, mP);
      final Z r = mFirst.remove(mN);
      if (r != null) {
        ++mN;
        return r;
      }
    }
  }
}
