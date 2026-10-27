package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399800 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A399800 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      final Z t = Z.THREE.pow(mN).add(2);
      return t.isProbablePrime() ? t : Z.NEG_ONE;
    }
    Z p = Z.ONE;
    while (true) {
      p = Functions.NEXT_PRIME.z(p);
      final Z t = p.pow(mN).add(2);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
