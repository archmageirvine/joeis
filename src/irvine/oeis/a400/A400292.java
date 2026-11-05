package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A400292 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A400292 extends A400291 {

  @Override
  public Z next() {
    step();
    Z prod = Z.ONE;
    for (final Z p : mRow) {
      prod = prod.lcm(Functions.ORDER.z(p, 10));
    }
    return prod;
  }
}

