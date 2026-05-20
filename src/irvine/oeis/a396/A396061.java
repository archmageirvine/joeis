package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396061 allocated for Raghav Garg.
 * @author Sean A. Irvine
 */
public class A396061 extends Sequence1 {

  private long mN = 0;

  private boolean is(final Z n) {
    final Z r = Functions.REVERSE.z(n);
    return n.compareTo(r) < 0 && Functions.REVERSE.z(n.square()).equals(r.square());
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(Long.toString(++mN, 4));
      if (is(t)) {
        return t;
      }
    }
  }
}
