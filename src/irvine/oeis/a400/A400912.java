package irvine.oeis.a400;

import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.oeis.gf.GfSequence;

/**
 * A400912 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A400912 extends GfSequence {

  /** Construct the sequence. */
  public A400912() {
    super(0, SQ.inverse(new AbstractInfiniteSeries<>() {
      @Override
      public Q coeff(final long n) {
        if (n == 0) {
          return Q.ONE;
        }
        if (Predicates.FIBONACCI.is(n + 1)) {
          return Q.NEG_ONE;
        }
        return Q.ZERO;
      }
    }));
  }
}

