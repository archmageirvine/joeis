package irvine.oeis.gf;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesParser;

/**
 * A sequence defined by an ordinary generating function.
 * @author Sean A. Irvine
 */
public class EgfSequence extends GfSequence {

  /**
   * Construct a sequence from an exponential generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public EgfSequence(final int offset, final int step, final Series<Q> gf) {
    super(offset, step, gf);
  }

  /**
   * Construct a sequence from an exponential generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public EgfSequence(final int offset, final Series<Q> gf) {
    this(offset, 1, gf);
  }

  /**
   * Construct a sequence from an exponential generating function.
   * @param offset first valid term has this index
   * @param step increment to apply
   * @param gf the generating function
   */
  public EgfSequence(final int offset, final int step, final String gf) {
    this(offset, step, new SeriesParser().parse(gf));
  }

  /**
   * Construct a sequence from an exponential generating function.
   * @param offset first valid term has this index
   * @param gf the generating function
   */
  public EgfSequence(final int offset, final String gf) {
    this(offset, 1, gf);
  }

  @Override
  protected Q q(final int n) {
    return super.q(n).multiply(Functions.FACTORIAL.z(n));
  }
}
