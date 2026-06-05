package irvine.oeis.a395;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395951 Fix-ordered complementary factors of prime(m-1)+1 where m belongs to set where denominators in the expression m!/(prime(m-1)+1) for m &gt; 1 are not integers.
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

