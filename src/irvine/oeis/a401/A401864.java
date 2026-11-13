package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401864 allocated for Daniel Okwor.
 * @author Sean A. Irvine
 */
public class A401864 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = 2 * ++mN - 1;
    if (s == 1) {
      return Z.ONE;
    }
    final int k = Functions.OMEGA.i(s);
    final long n1 = s == 3 ? 1 : 0;
    final FactorSequence fs = Jaguar.factor(s);
    Z n2 = Z.ONE.shiftLeft(k - 1);
    for (final Z p : fs.toZArray()) {
      if (p.mod(4) != 1) {
        n2 = Z.ZERO;
        break;
      }
    }
    long j = k;
    for (final Z p : fs.toZArray()) {
      if (Z.THREE.equals(p)) {
        --j;
      } else if (p.mod(6) != 1) {
        j = 0;
        break;
      }
    }
    final Z n3 = j > 0 && s > 3 && s % 9 != 0 ? Z.ONE.shiftLeft(j - 1) : Z.ZERO;
    boolean ok = s > 3;
    if (ok) {
      for (final Z p : fs.toZArray()) {
        if (Z.THREE.compareTo(p) < 0) {
          final long r = p.mod(8);
          if (r != 1 && r != 3) {
            ok = false;
            break;
          }
        }
      }
    }
    final Z n4 = ok ? Z.ONE.shiftLeft(k - 1) : Z.ZERO;
    return Functions.DEDEKIND_PSI.z(s).subtract(4 * n1).subtract(n2.multiply(6)).subtract(n3.multiply(8)).subtract(n4.multiply(12)).divide(24)
      .add(n1).add(n2).add(n3).add(n4);
  }
}
