package irvine.oeis.a396;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A396792 Maximum number of parts K in a partition of n such that there exists a part size p whose multiplicity is exactly p*K/100.
 * @author Sean A. Irvine
 */
public class A396792 extends AbstractSequence {

  private int mN = 18;

  /** Construct the sequence. */
  public A396792() {
    super(19);
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
    int max = 0;
    final int[] c = new int[mN + 1];
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length > max) {
        IntegerPartition.toCountForm(p, c);
        for (int k = 1; k < c.length; ++k) {
          if (c[k] * 100 == k * p.length) {
            max = p.length;
            break;
          }
        }
      }
    }
    return Z.valueOf(max);
  }
}
