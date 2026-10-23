package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400826 Grundy value of n in the impartial game in which from even n the only move is to n/2, from odd n &gt; 1 the moves are to 3n+1 or to (3n+1)/2, and 1 has no moves.
 * @author Sean A. Irvine
 */
public class A400826 extends Sequence1 {

  // After Miquel Cerda

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    if (Predicates.POWER_OF_TWO.is(mN)) {
      return Z.valueOf((Functions.DIGIT_LENGTH.l(2, mN) - 1) & 1);
    }
    if ((mN & 1) == 0) {
      final long v = Functions.DIGIT_LENGTH.l(2, mN & -mN) - 1;
      return Z.valueOf(1 - (v & 1));
    } else {
      final long v = Functions.DIGIT_LENGTH.l(2, (mN + 1) & -(mN + 1)) - 1;
      return Z.valueOf(1 + (v & 1));
    }
  }
}
