package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004154;

/**
 * A398949 allocated for Alexander Willis.
 * @author Sean A. Irvine
 */
public class A398949 extends Sequence1 {

  private final Sequence mF = new A004154().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z r = Functions.REVERSE.z(mF.next());
      if (r.mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
