package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A396335 allocated for Andrey Samosyuk.
 * @author Sean A. Irvine
 */
public class A396335 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().square().add(++mN * mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
