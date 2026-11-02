package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a007.A007602;

/**
 * A401427 allocated for Vaibhav Kodag.
 * @author Sean A. Irvine
 */
public class A401427 extends FilterSequence {

  /** Construct the sequence. */
  public A401427() {
    super(1, new A007602(), k -> {
      final long sum = Functions.DIGIT_SUM.l(k);
      if (k.mod(sum) != 0) {
        return false;
      }
      final Z prod = Functions.DIGIT_PRODUCT.z(k);
      return k.mod(prod.multiply(sum)).isZero();
    });
  }
}
