package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398788 allocated for Harry Richman.
 * @author Sean A. Irvine
 */
public class A398788 extends CachedSequence {

  /** Construct the sequence. */
  public A398788() {
    super(2, Long.class, (self, n) -> {
      if (n <= 3) {
        return n == 2 ? Z.ONE : Z.TWO;
      }
      final long s = Functions.NEXT_POWER_OF_2.l(n / 3);
      return self.a(s).multiply(self.a(n - s)).multiply(s).multiply(n - s);
    });
  }
}
