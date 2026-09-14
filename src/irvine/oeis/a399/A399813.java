package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002113;

/**
 * A399813 allocated for Theodore Bonini.
 * @author Sean A. Irvine
 */
public class A399813 extends FilterSequence {

  /** Construct the sequence. */
  public A399813() {
    super(1, new A002113().skip(), k -> {
      int cnt = 0;
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!Predicates.PALINDROME.is(d) && ++cnt > 1) {
          return false;
        }
      }
      return cnt == 1;
    });
  }
}
