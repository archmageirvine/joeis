package irvine.oeis.a399;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a130.A130310;

/**
 * A399305 allocated for Geoffrey Caveney.
 * @author Sean A. Irvine
 */
public class A399305 extends Sequence1 {

  private final Sequence mS = new A130310().skip();
  private final HashSet<Z> mA = new HashSet<>();
  private long mN = 0;
  {
    mA.add(Z.ONE); // Handle an edge case near the start
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mS.next();
      mA.add(t);
      final Z[] qr = t.divideAndRemainder(10);
      if (qr[1].isZero() && mA.contains(qr[0])) {
        return Z.valueOf(mN);
      }
    }
  }
}
