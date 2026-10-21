package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400953 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A400953 extends A400952 {

  @Override
  protected Z select(final Z ways, final long min) {
    return Z.valueOf(min);
  }
}
