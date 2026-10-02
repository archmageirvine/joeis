package irvine.oeis.a400;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000040;

/**
 * A400237 allocated for A. Lamek.
 * @author Sean A. Irvine
 */
public class A400237 extends FilterSequence {

  /** Construct the sequence. */
  public A400237() {
    super(1, new A000040(), p -> {
      final Z mod = p.square().multiply2();
      final Z m = Z.TWO.pow(p).subtract(1);
      final Z v = p.multiply2().add(1).mod(m);
      for (final Z d : Jaguar.factor(m).divisors()) {
        if (d.compareTo(v) > 0 && !d.equals(m) && d.mod(mod).equals(v)) {
          return true;
        }
      }
      return false;
    });
  }
}

