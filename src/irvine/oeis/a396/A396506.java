package irvine.oeis.a396;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.oeis.a381.A381617;

/**
 * A396506 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A396506 extends A381617 {

  /** Construct the sequence. */
  public A396506() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return CR.valueOf(n + 1).log2().square().inverse().subtract(CR.valueOf(n + 2).log2().square().inverse());
      }
    });
  }
}

