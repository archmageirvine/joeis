package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398486 allocated for Chang Sunny Lu.
 * @author Sean A. Irvine
 */
public class A398486 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final CR c0 = CR.valueOf(mN).cos();
      final CR c1 = CR.valueOf(mN + 1).cos();
      if (c0.compareTo(c1) > 0) {
        final CR c2 = CR.valueOf(mN + 2).cos();
        if (c1.compareTo(c2) > 0) {
          final CR c3 = CR.valueOf(mN + 3).cos();
          if (c2.compareTo(c3) > 0) {
            final CR c4 = CR.valueOf(mN + 4).cos();
            if (c3.compareTo(c4) > 0) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}

