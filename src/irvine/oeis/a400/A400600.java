package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400600 Largest m such that one defective in an m-item set and one in a disjoint 5-item set can always be identified in at most n adaptive tests, each returning the number of defectives in a selected subset (0 if no positive m is feasible).
 * @author Sean A. Irvine
 */
public class A400600 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final Z f = Z.ONE.shiftLeft(++mN).subtract(mN * (mN - 3) / 2).subtract(5);
    if (mN <= 8) {
      return f;
    }
    if (mN <= 10) {
      return f.add(1);
    }
    return f.add(2);
  }
}

