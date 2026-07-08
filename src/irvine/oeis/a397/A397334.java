package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061067;

/**
 * A397334 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A397334 extends Sequence1 {

  private final Sequence mA = new A061067();

  @Override
  public Z next() {
    Z m = mA.next();
    m = m.add(Functions.PRIME_PI.z(m));
    long cnt = 0;
    while (m.isProbablePrime()) {
      //m = Functions.PRIME_PI.z(m.add(Functions.PRIME_PI.z(m)));
      m = m.add(Functions.PRIME_PI.z(m));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
