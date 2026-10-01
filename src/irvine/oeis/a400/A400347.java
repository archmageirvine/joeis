package irvine.oeis.a400;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400347 allocated for Tesfamichael Bogale.
 * @author Sean A. Irvine
 */
public class A400347 extends Sequence1 {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    Z prod = Z.TWO;
    for (final Z p : mSeen) {
      if (p.compareTo(mA) > 0) {
        break;
      }
      prod = prod.multiply(p);
    }
    prod = prod.add(1);
    while (true) {
      if (prod.isOne()) {
        throw new UnsupportedOperationException("Sequence terminates");
      }
      final Z p = Functions.LPF.z(prod);
      if (mSeen.add(p)) {
        mA = p;
        return p;
      }
      prod = prod.divide(p);
    }
  }
}
