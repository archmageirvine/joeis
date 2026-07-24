package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A397864 Numbers k such that there are more divisors d of k where d + n/d is a square than those where it is not.
 * @author Sean A. Irvine
 */
public class A397864 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397864() {
    super(1, k -> {
      final Z[] divs = Jaguar.factor(k).divisors();
      int cnt = 0;
      for (int j = 0; j < divs.length; ++j) {
        final Z d = divs[j];
        if (Predicates.SQUARE.is(d.add(k / d.longValue()))) {
          cnt += 2;
          if (cnt > divs.length) {
            return true;
          }
          if (cnt + 2 * (divs.length - j) <= divs.length) {
            return false;
          }
        }
      }
      return false;
    });
  }
}
