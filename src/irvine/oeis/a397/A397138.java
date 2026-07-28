package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397138 allocated for Dillon Ryan.
 * @author Sean A. Irvine
 */
public class A397138 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397138() {
    super(1, 1, 2, k -> {
      final Z f = Functions.FIBONACCI.z(k);
      return f.square().add(f).multiply(5).add(1).isProbablePrime();
    });
  }
}
