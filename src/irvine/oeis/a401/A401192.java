package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A401192 a(n) is the number of inequivalent lattice triangles containing n lattice points, with no boundary lattice points other than their three vertices.
 * @author Sean A. Irvine
 */
public class A401192 extends Sequence3 {

  // After Felix Huber

  private long mN = 2;

  @Override
  public Z next() {
    final long m = 2 * ++mN - 5;
    Z u = Z.ONE;
    Z v = Z.ONE;
    final FactorSequence fs = Jaguar.factor(m);
    for (final Z q : fs.toZArray()) {
      final int e = fs.getExponent(q);
      u = u.multiply(q.pow(e - 1).multiply(q.subtract(2)));
      if (q.equals(Z.THREE)) {
        if (e > 1) {
          v = Z.ZERO;
        }
      } else if (q.mod(3) == 1) {
        v = v.multiply2();
      } else {
        v = Z.ZERO;
      }
    }
    return u.add(3).add(v.multiply2()).divide(6);
  }
}
