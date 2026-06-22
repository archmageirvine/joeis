package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a073.A073642;

/**
 * A397100 allocated for Natalia L. Skirrow.
 * @author Sean A. Irvine
 */
public class A397100 extends A073642 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Long.bitCount(++mN)).square().subtract(super.next().multiply2());
  }
}
