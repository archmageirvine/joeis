package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a120.A120944;

/**
 * A398442 Numbers k of the form q(k) * rad(k), where rad = A007947 and q(k) is the second smallest distinct prime factor of k.
 * @author Sean A. Irvine
 */
public class A398442 extends A120944 {

  private final TreeSet<Z> mS = new TreeSet<>();
  private Z mA = super.next();

  @Override
  public Z next() {
    // Once 3 * mA > smallest element in tree, we can safely emit the element
    while (mS.isEmpty() || mA.multiply(3).compareTo(mS.first()) < 0) {
      mS.add(mA.multiply(Functions.LPF.z(mA.divide(Functions.LPF.z(mA)))));
      mA = super.next();
    }
    return mS.pollFirst();
  }
}
