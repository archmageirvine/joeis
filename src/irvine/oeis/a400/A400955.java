package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400955 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A400955 extends A400954 {

  @Override
  protected Z select(final Z ways, final long min) {
    return Z.valueOf(min);
  }
}
