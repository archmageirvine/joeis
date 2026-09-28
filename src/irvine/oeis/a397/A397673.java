package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397673 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A397673 extends Sequence1 {

  private long mA = 2;
  private long mB = 3;

  @Override
  public Z next() {
    while (true) {
      mB += 2;
      if (mB > mA * mA / 2) {
        ++mA;
        mB = mA + 1;
      }
      final long c2 = mA * mA + mB * mB;
      final long c = Functions.SQRT.l(c2);
      if (c * c == c2) {
        final long u = mA * mA + mB * mB;
        for (long x = 1; x < mA; ++x) {
          final long y = c - x;
          assert (x + y) * (x + y) == u;
          final long z2 = mA * mA - x * x;
          final long z = Functions.SQRT.l(z2);
          if (z * z == z2 && y * y + z2 == mB * mB && Functions.GCD.l(mA, mB, x, y, z) == 1) { // Janaka omits c
            //System.out.println("Ok: (" + mA + "," + mB + "," + c + "," + x + "," + y + "," + z + ")");
            return Z.valueOf(mA);
          }
        }
      }
    }
  }
}
