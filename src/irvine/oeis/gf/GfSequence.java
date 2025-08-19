package irvine.oeis.gf;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A sequence defined by (the numerators of) an ordinary generating function.
 * @author Sean A. Irvine
 */
public class GfSequence extends AbstractSequence implements DirectSequence {

  private int mN;
  private final int mStep;
  private final Series<Q> mSeries;

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public GfSequence(final int offset, final int step, final Series<Q> gf) {
    super(offset);
    mN = offset * step - step;
    mStep = step;
    mSeries = gf;
  }

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public GfSequence(final int offset, final Series<Q> gf) {
    this(offset, 1, gf);
  }

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public GfSequence(final int offset, final int step, final String gf) {
    this(offset, step, SeriesParser.parse(gf));
  }

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public GfSequence(final int offset, final String gf) {
    this(offset, 1, gf);
  }

  /**
   * Return the series underlying this sequence.
   * @return the series
   */
  public Series<Q> s() {
    return mSeries;
  }

  /**
   * Return the <code>n</code>th term of this sequence as a rational.
   * @param n term number
   * @return term value
   */
  protected Q q(final int n) {
    return mSeries.coeff(n);
  }

  @Override
  public Z next() {
    mN += mStep;
    return a(mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return q(n).num();
  }
}
