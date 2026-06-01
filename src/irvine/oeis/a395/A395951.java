package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395951 allocated for Alexander R. Povolotsky.
 * @author Sean A. Irvine
 */
public class A395951 extends A000040 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private long mN = 2;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      final Z gpf = Functions.GPF.z(t);
      if (gpf.compareTo(++mN) > 0) {
        final Z u = t.divide(gpf);
        if (mSeen.add(u)) {
          return u;
        }
      }
    }
  }
}

