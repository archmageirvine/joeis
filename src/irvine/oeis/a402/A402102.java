package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * A402102 Number of ways to earn a score of 1.5*n on the AMC 10 or AMC 12, distinct up to the particular questions answered correctly, left blank, or answered incorrectly. See comments.
 * @author Sean A. Irvine
 */
public class A402102 extends GfSequence {

  /** Construct the sequence. */
  public A402102() {
    super(0, "(1+x+x^4)^25");
  }

  @Override
  public Z next() {
    return mN >= 100 ? null : super.next();
  }
}
