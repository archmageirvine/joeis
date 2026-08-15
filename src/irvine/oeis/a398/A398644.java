package irvine.oeis.a398;

import irvine.math.partition.FixedLengthPartition;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398644 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A398644 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FixedLengthPartition part = new FixedLengthPartition(++mN, 3);
    int[] p;
    long count = 0;
    while ((p = part.next()) != null) {
      final long t = (long) p[0] * p[0] + (long) p[1] * p[1] + (long) p[2] * p[2];
      if (t % 3 == 0 && Predicates.SQUARE.is(t / 3)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
