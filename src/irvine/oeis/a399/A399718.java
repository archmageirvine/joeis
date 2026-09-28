package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399718 Denominators of "Farey fraction" approximations to Pi/2.
 * @author Sean A. Irvine
 */
public class A399718 extends A399717 {

  @Override
  protected Z select(final Z num, final Z den) {
    return den;
  }
}
