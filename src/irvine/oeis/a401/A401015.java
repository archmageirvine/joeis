package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.a006.A006527;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401015 allocated for Peter M. Chema.
 * @author Sean A. Irvine
 */
public class A401015 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A401015() {
    super(0, new A006527(), k -> Functions.DIGIT_SUM_ROOT.z(k));
  }
}
