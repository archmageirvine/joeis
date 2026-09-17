package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007770;

/**
 * A399577 allocated for Harry E. Neel.
 * @author Sean A. Irvine
 */
public class A399577 extends FilterSequence {

  /** Construct the sequence. */
  public A399577() {
    super(1, new A007770(), k -> {
      while (!k.isOne()) {
        if (Z.TEN.equals(k)) {
          return true;
        }
        k = Functions.DIGIT_SUM_SQUARES.z(k);
      }
      return false;
    });
  }
}
