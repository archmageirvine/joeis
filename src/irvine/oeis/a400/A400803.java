package irvine.oeis.a400;

import irvine.math.z.Z;

/**
 * A400803 Number of independent linear relations among the columns of the adjacency matrix of the divisor graph on {2,...,n}, after removing isolated vertices.
 * @author Sean A. Irvine
 */
public class A400803 extends A400804 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(b(++mN));
  }
}
