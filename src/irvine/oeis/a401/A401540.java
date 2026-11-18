package irvine.oeis.a401;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005153;

/**
 * A087450.
 * @author Sean A. Irvine
 */
public class A401540 extends A005153 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mP = super.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mP) >= 0) {
      final Z s = Functions.SIGMA1.z(mP);
      if (s.add(2).isProbablePrime()) {
        mA.add(s);
      }
      mP = super.next();
    }
    return mA.pollFirst().add(1);
  }
}
