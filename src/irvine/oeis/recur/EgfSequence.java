package irvine.oeis.recur;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A sequence defined by an exponential generating function.
 * @author Sean A. Irvine
 */
public class EgfSequence extends GfSequence {

  /**
   * Construct a sequence from an exponential generating function.
   * @param offset first valid term has this index
   * @param egf the exponential generating function
   */
  public EgfSequence(final int offset, final String egf) {
    super(offset, egf);
  }

  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN));
  }
}
