package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.gf.GfSequence;

/**
 * A402102 allocated for Aidan Markey.
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
