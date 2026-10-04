package irvine.oeis.a400;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a036.A036903;

/**
 * A400381 Scan decimal expansion of sqrt(2) until all n-digit strings have been seen; a(n) is number of digits that must be scanned.
 * @author Sean A. Irvine
 */
public class A400381 extends A036903 {

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
