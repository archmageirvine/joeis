
package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401201 allocated for Alex Ratushnyak.
 * @author Sean A. Irvine
 */
public class A401201 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      Z prod = Z.ONE;
      for (long j = 0; j < mN; ++j) {
        prod = prod.multiply(k + j);
      }
      if (prod.subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
