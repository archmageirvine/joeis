package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398300 a(n) is the minimum possible sum of the numbers on all non-mine cells when n mines are placed on an infinite Minesweeper board (each non-mine cell's number is the count of mines among its up to 8 neighbors).
 * @author Sean A. Irvine
 */
public class A398300 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(2 * Functions.CEIL_SQRT.l(28 * ++mN - 12));
  }
}
