package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a176.A176135;

/**
 * A396575.
 * @author Sean A. Irvine
 */
public class A398468 extends A176135 implements Conjectural {

  private static final long HEURISTIC = 100; // Sufficient for at least 10000 terms
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  {
    mA.add(super.next());
  }

  @Override
  public Z next() {
    while (mA.first().multiply(HEURISTIC).compareTo(mA.last()) > 0) {
      mA.add(super.next());
    }
    final Z r = mA.pollFirst();
    if (r.compareTo(mPrev) < 0) {
      throw new RuntimeException("Heuristic failed");
    }
    mPrev = r;
    return r;
  }
}
