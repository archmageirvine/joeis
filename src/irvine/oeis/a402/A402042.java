package irvine.oeis.a402;

import irvine.math.z.Z;

/**
 * A402042 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A402042 extends A402041 {

  @Override
  protected Z select(final Z a, final Z b) {
    return b;
  }
}
