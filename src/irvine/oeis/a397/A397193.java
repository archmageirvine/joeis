package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a014.A014574;

/**
 * A397193 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A397193 extends FilterSequence {

  /** Construct the sequence. */
  public A397193() {
    super(1, new A014574(), k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        final Z t = d.shiftLeft(k.divide(d).longValueExact());
        if (t.subtract(1).isProbablePrime() && t.add(1).isProbablePrime()) {
          return true;
        }
      }
      return false;
    });
  }
}
