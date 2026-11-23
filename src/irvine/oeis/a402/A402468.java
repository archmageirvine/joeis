package irvine.oeis.a402;

import java.util.function.Function;

import irvine.math.q.Q;
import irvine.math.series.AbstractInfiniteSeries;
import irvine.math.series.Series;
import irvine.oeis.gf.GfSequence;

/**
 * A402282.
 * @author Sean A. Irvine
 */
public class A402468 extends GfSequence {

  /**
   * Construct a generating function of the form Sum_{k&gt;=1} x^shift(k) op1 Product_{j=1..multiplier * k} (1 op2 x^j).
   * @param offset sequence offset
   * @param multiplier multiplier for upper limit of product
   * @param divide true of op1 is "/" and op2 is "-" (otherwise op1 = "*" and op2 = "+")
   * @param shift lambda that gives the shift (e.g. k -> k * k).
   */
  protected A402468(final int offset, final long multiplier, final boolean divide, final Function<Long, Long> shift) {
    super(offset, new AbstractInfiniteSeries<>() {

      private Series<Q> mS = SQ.zero();
      private long mK = 1;

      @Override
      public Q coeff(final long n) {
        while (n >= shift.apply(mK)) {
          final long s = shift.apply(mK);
          final Series<Q> prod = SQ.product(1, multiplier * mK, j -> divide ? SQ.oneMinusXToTheN(j) : SQ.onePlusXToTheN(j));
          mS = SQ.add(mS, divide ? SQ.divide(SQ.monomial(Q.ONE, s), prod) : SQ.shift(prod, s));
          ++mK;
        }
        return mS.coeff(n);
      }
    });
  }

  /** Construct the sequence. */
  public A402468() {
    this(0, 4, false, k -> k * k);
  }
}
