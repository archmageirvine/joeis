package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A397677 Composite integers k whose set of digits is equal to the union of the sets of digits of its divisors.
 * @author Sean A. Irvine
 */
public class A397677 extends FilterSequence {

  /** Construct the sequence. */
  public A397677() {
    super(1, new A002808(), k -> {
      final int syn = Functions.SYNDROME.i(k);
      if ((syn & 2) == 0) {
        return false; // no 1 in the number
      }
      int sd = 0;
      for (final Z d : Jaguar.factor(k).divisors()) {
        sd |= Functions.SYNDROME.i(d);
        if ((sd & ~syn) != 0) {
          return false;
        }
      }
      return true;
    });
  }
}
