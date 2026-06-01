package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a386.A386016;

/**
 * A396405 A sequence constructed by greedily sampling the probability distribution given by 1/log_2(i+1)^2 - 1/log_2(i+2)^2 to minimize ratio discrepancy.
 * @author Sean A. Irvine
 */
public class A396405 extends A386016 {

  /** Construct the sequence. */
  public A396405() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return CR.valueOf(n + 1).log2().square().inverse().subtract(CR.valueOf(n + 2).log2().square().inverse());
      }
    });
  }
}

