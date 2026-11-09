package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014574;

/**
 * A399960 allocated for Mourad Belafsahi.
 * @author Sean A. Irvine
 */
public class A399960 extends Sequence1 {

  // Will be far too slow to discover any further terms

  private final Sequence mA = new A014574();

  @Override
  public Z next() {
    while (true) {
      final Z m = mA.next();
      final Z m2 = m.multiply2();
      final Sequence s = new A014574();
      while (true) {
        final Z t = s.next();
        if (t.equals(m)) {
          return m;
        }
        final Z u = m2.subtract(t);
        if (u.subtract(1).isProbablePrime() && u.add(1).isProbablePrime()) {
          break;
        }
      }
    }
  }
}
