package irvine.oeis.a399;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399680 allocated for Jaroslav Krizek.
 * @author Sean A. Irvine
 */
public class A399680 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z[] dn = Jaguar.factor(mN).divisorsSorted();
    long k = mN;
    while (true) {
      final Z[] dk = Jaguar.factor(--k).divisorsSorted();
      if (dk.length <= dn.length && Arrays.equals(dk, 0, dk.length, dn, 0, dk.length)) {
        return Z.valueOf(k);
      }
    }
  }
}

