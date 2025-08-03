package irvine.oeis.recur;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A sequence defined by an ordinary generating function.
 * @author Sean A. Irvine
 */
public class EgfSequence extends AbstractSequence {

  protected int mN;
  private final Series<Q> mSeries;

  /**
   * Construct a sequence from an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public EgfSequence(final int offset, final String gf) {
    super(offset);
    mN = offset - 1;
    mSeries = new SeriesParser().parse(gf);
  }

  @Override
  public Z next() {
    return mSeries.coeff(++mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
