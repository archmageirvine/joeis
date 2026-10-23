package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A400920 allocated for Hector Yan Estivel.
 * @author Sean A. Irvine
 */
public class A400920 extends FilterSequence {

  /** Construct the sequence. */
  public A400920() {
    super(1, new A400684(), p -> {
      final Z p1 = p.subtract(1);
      final Z p12 = p1.square();
      if (!p12.add(3).isProbablePrime()) {
        return false;
      }
      final Z p14 = p12.square();
      if (!p14.add(1).isProbablePrime() || !p14.add(3).isProbablePrime()) {
        return false;
      }
      return p14.square().add(1).isProbablePrime();
    });
  }
}

