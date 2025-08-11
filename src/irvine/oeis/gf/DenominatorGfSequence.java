package irvine.oeis.gf;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;
import irvine.math.z.Z;

/**
 * A sequence defined by the denominators of an ordinary generating function.
 * @author Sean A. Irvine
 */
public class DenominatorGfSequence extends GfSequence {

  /**
   * Construct a sequence from the denominators an ordinary generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public DenominatorGfSequence(final int offset, final int step, final Series<Q> gf) {
    super(offset, step, gf);
  }

  /**
   * Construct a sequence from the denominators an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public DenominatorGfSequence(final int offset, final Series<Q> gf) {
    this(offset, 1, gf);
  }

  /**
   * Construct a sequence from the denominators an ordinary generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public DenominatorGfSequence(final int offset, final int step, final String gf) {
    this(offset, step, new SeriesParser().parse(gf));
  }

  /**
   * Construct a sequence from the denominators an ordinary generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public DenominatorGfSequence(final int offset, final String gf) {
    this(offset, 1, gf);
  }

  @Override
  public Z a(final int n) {
    return q(n).den();
  }
}
