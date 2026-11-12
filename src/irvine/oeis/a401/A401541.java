
package irvine.oeis.a401;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005153;

/**
 * A401541 allocated for Guido Avagliano.
 * @author Sean A. Irvine
 */
public class A401541 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Sequence mPractical = new A005153();
  private Z mM = mPractical.next();

  @Override
  public Z next() {
    while (mA.isEmpty() || mM.square().compareTo(mA.first()) <= 0) {
      final Z s = Functions.SIGMA1.z(mM).add(2);
      if (s.isProbablePrime()) {
        mA.add(mM.multiply(s));
      }
      mM = mPractical.next();
    }
    return mA.pollFirst();
  }
}
