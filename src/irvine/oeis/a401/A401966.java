package irvine.oeis.a401;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401966 allocated for Tesfamichael Bogale.
 * @author Sean A. Irvine
 */
public class A401966 extends Sequence1 {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      mSeen.add(Z.TWO);
      return mA;
    }
    Z prod = Z.ONE;
    for (final Z p : mSeen) {
      if (p.compareTo(mA) >= 0) {
        break;
      }
      prod = prod.multiply(p);
    }
    prod = prod.add(mA);
    while (true) {
      if (prod.isOne()) {
        throw new UnsupportedOperationException("Sequence terminates");
      }
      final Z p = Functions.LPF.z(prod);
      if (mUsed.add(p) && mSeen.add(p)) {
        mSeen.removeIf(q -> q.compareTo(p) > 0);
        mA = p;
        return p;
      }
      prod = prod.divide(p);
    }
  }
}
