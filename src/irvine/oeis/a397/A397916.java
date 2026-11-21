package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A397916 Number of equivalence classes of n X n {-1,1} matrices that are equivalent to their transposes under independent permutations of rows and columns and multiplication of rows and columns by -1.
 * @author Gregory Morse
 */
public class A397916 extends Sequence0 {
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final IntegerPartition partitions = new IntegerPartition(mN);
    Z sum = Z.ZERO;
    int[] p;
    while ((p = partitions.next()) != null) {
      int odd = 0;
      long pairs = 0;
      for (int i = 0; i < p.length; ++i) {
        odd += p[i] & 1;
        for (int j = 0; j < i; ++j) {
          pairs += Functions.GCD.i(p[i], p[j]);
        }
      }
      final long exponent = (mN + odd) / 2 - p.length + pairs + (odd == 0 ? 1 : 0);
      sum = sum.add(IntegerPartition.permCount(p).shiftLeft(exponent));
    }
    return sum.divide(Functions.FACTORIAL.z(mN));
  }
}
