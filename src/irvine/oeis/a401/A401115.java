package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a005.A005835;

/**
 * A401115 Pseudoperfect numbers k such that every proper divisor of k belongs to at least one subset of proper divisors summing to k.
 * @author Sean A. Irvine
 */
public class A401115 extends A005835 {

  private static boolean isPseudoperfect(final Z[] d, final int pos, final Z sum, final Z target) {
    final int c = sum.compareTo(target);
    if (c >= 0) {
      return c == 0;
    }
    for (int k = pos - 1; k >= 0; --k) {
      if (isPseudoperfect(d, k, sum.add(d[k]), target)) {
        return true;
      }
    }
    return false;
  }

  private static boolean isOmniperfect(final Z pp) {
    final Z[] d = Jaguar.factor(pp).divisorsSorted();
    final Z[] e = new Z[d.length - 2]; // -1 for pp, and -1 for element k that we skip
    for (int k = 0; k < d.length - 1; ++k) {
      System.arraycopy(d, 0, e, 0, k);
      System.arraycopy(d, k + 1, e, k, d.length - k - 2);
      if (!isPseudoperfect(e, e.length, Z.ZERO, pp.subtract(d[k]))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      if (isOmniperfect(pp)) {
        return pp;
      }
    }
  }
}
