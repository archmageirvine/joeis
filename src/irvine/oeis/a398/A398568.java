package irvine.oeis.a398;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a033.A033620;

/**
 * A398568 Nonpalindromic composite numbers all of whose proper divisors are palindromic.
 * @author Sean A. Irvine
 */
public class A398568 extends FilterSequence {

  /** Construct the sequence. */
  public A398568() {
    super(1, new A033620(), k -> {
      if (Predicates.PALINDROME.is(k) || k.isProbablePrime()) {
        return false;
      }
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!d.isOne() && !d.equals(k) && !Predicates.PALINDROME.is(d)) {
          return false;
        }
      }
      return true;
    });
  }
}
