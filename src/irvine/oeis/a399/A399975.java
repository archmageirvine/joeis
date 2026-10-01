package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A399975 allocated for \u017diga Pirc.
 * @author Sean A. Irvine
 */
public class A399975 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A399975() {
    super(1, k -> {
      Z xor = Z.ZERO;
      for (final Z p : Jaguar.factor(k).toZArray()) {
        xor = xor.xor(p);
      }
      return xor.isZero();
    });
  }
}
