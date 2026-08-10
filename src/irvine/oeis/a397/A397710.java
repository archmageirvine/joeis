package irvine.oeis.a397;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A397710 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397710 extends A005117 {

  private final TreeSet<Z> mS = new TreeSet<>();
  {
    super.next(); // skip 1
  }
  private Z mA = super.next();

  @Override
  public Z next() {
    // Once 2 * mA > smallest element in tree, we can safely emit the element
    while (mS.isEmpty() || mA.multiply2().compareTo(mS.first()) < 0) {
      mS.add(mA.multiply(Functions.LPF.z(mA)));
      mA = super.next();
    }
    return mS.pollFirst();
  }
}
