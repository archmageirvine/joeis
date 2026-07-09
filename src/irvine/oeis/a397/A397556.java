package irvine.oeis.a397;

import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.a386.A386016;

/**
 * A397556 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A397556 extends A386016 {

  /** Construct the sequence. */
  public A397556() {
    super(new MemoryFunction1<>() {
      @Override
      protected CR compute(final int n) {
        return n == 0 ? CR.ZERO : Zeta.zeta(3).multiply(Z.valueOf(n).pow(3)).inverse();
      }
    });
  }
}

