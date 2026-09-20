package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007770;

/**
 * A397343 allocated for Harry E. Neel.
 * @author Sean A. Irvine
 */
public class A397343 extends FilterSequence {

  private static final Z Z100 = Z.valueOf(100);

  /** Construct the sequence. */
  public A397343() {
    super(1, new A007770(), k -> {
      while (!k.isOne()) {
        if (Z100.equals(k)) {
          return true;
        }
        k = Functions.DIGIT_SUM_SQUARES.z(k);
      }
      return false;
    });
  }
}
