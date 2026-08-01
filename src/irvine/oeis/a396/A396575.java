package irvine.oeis.a396;

import java.util.Arrays;
import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396575 allocated for Andrea Cutri.
 * @author Sean A. Irvine
 */
public class A396575 extends Sequence1 {

  private int mN = 0;

  private Z contribution(final int[] q) {
    int m = Functions.SUM.i(q);
    final int g = Functions.GCD.i(q);
    Z sum = Z.ZERO;
    for (final Z dz : Jaguar.factor(g).divisors()) {
      final int d = dz.intValueExact();
      Z t = Functions.PHI.z(d).multiply(Functions.FACTORIAL.z(m / d));
      for (final int x : q) {
        t = t.divide(Functions.FACTORIAL.z(x / d));
      }
      sum = sum.add(t);
    }
    return sum.divide(m);
  }

  @Override
  public Z next() {
    final HashSet<String> seen = new HashSet<>();
    final IntegerPartition part = new IntegerPartition(++mN);
    final int[] q = new int[mN + 1];
    int[] p;
    Z sum = Z.ZERO;
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, q);
      Arrays.sort(q);
      if (seen.add(Arrays.toString(q))) {
        sum = sum.add(contribution(q));
      }
    }
    return sum;
  }
}
