package irvine.oeis.a398;

import irvine.math.MemoryFunction1;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a400.A400564;

/**
 * A398731
 * @author Sean A. Irvine
 */
public class A398756 extends CachedSequence {

  private static final DirectSequence A400564 = new A400564();
  private static final MemoryFunction1<Z> B = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ZERO;
      }
      return Integers.SINGLETON.sumdiv(n, d -> Z.NEG_ONE.pow(n / d + 1).multiply(d).multiply(A400564.a(d).subtract(1)));
    }
  };

  /** Construct the sequence. */
  public A398756() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(1, n, k -> B.get(k).multiply(self.a(n - k))).divide(n);
    });
  }
}
