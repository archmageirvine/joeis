package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a025.A025487;

/**
 * A397114 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A397114 extends A025487 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    final int[] e = new int[fs.omega()];
    final int[] c = new int[fs.maxExponent() + 1];
    int k = 0;
    for (final Z p : fs.toZArray()) {
      e[k++] = fs.getExponent(p);
    }
    IntegerPartition.toCountForm(e, c);
    return Binomial.multinomial(e.length, c);
  }
}
