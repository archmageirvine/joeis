package irvine.oeis.a397;

import irvine.math.z.Z;

/**
 * A397699 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A397699 extends A397698 {

  @Override
  protected Z select(final long best, final long bestPrime) {
    return Z.valueOf(bestPrime);
  }
}
