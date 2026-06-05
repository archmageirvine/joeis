package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.a381.A381617;

/**
 * A396505 A sequence constructed by greedily sampling the probability distribution given by log_2(1+1/i)^2 - log_2(1+1/(i+1))^2 to minimize discrepancy.
 * @author Sean A. Irvine
 */
public class A396505 extends A381617 {

  /** Construct the sequence. */
  public A396505() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : CR.valueOf(new Q(n + 1, n)).log2().square().subtract(CR.valueOf(new Q(n + 2, n + 1)).log2().square());
      }
    });
  }
}

