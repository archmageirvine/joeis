package irvine.oeis.gf;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A sequence defined by an ordinary generating function.
 * @author Sean A. Irvine
 */
public class GfSequence extends AbstractSequence {

  protected int mN;
  private final Series<Q> mSeries;
  
  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public GfSequence(final int offset, final Series<Q> gf) {
    super(offset);
    mN = offset - 1;
    mSeries = gf;
  }

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public GfSequence(final int offset, final String gf) {
    this(offset, new SeriesParser().parse(gf));
  }

  /**
   * Return the series underlying this sequence.
   * @return the series
   */
  public Series<Q> s() {
    return mSeries;
  }

  @Override
  public Z next() {
    return mSeries.coeff(++mN).toZ();
  }
}
