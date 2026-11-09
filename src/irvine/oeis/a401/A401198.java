package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a191.A191371;

/**
 * A401198 Number of ways to add one improperly colored vertex to a properly colored graph of n-1 vertices.
 * @author Sean A. Irvine
 */
public class A401198 extends Sequence1 {

  private final Sequence mS = new A191371();
  private Z mA = mS.next();
  private long mN = -1;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mS.next();
    return t.multiply(3).shiftLeft(++mN).subtract(mA);
  }
}

