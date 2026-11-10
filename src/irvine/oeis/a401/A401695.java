package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401695 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A401695 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      sum += Integer.bitCount(e);
    }
    return Functions.BELL.z(sum);
  }
}
