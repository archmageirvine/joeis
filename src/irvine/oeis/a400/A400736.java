package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.a144.A144625;

/**
 * A400736 Three-dimensional multiplication table read by triangular shells.
 * @author Sean A. Irvine
 */
public class A400736 extends A144625 {

  @Override
  public Z next() {
    return super.next().multiply(super.next()).multiply(super.next());
  }
}
