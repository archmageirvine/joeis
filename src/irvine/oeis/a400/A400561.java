package irvine.oeis.a400;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400561 a(n) is the maximum numbers of regions (both closed or open) outside a strictly convex n-polygon, delimited by the n edges and the n*(n-3)/2 diagonals of the polygon itself, where all these elements (edges and diagonals) are extended to infinity as straight lines.
 * @author Sean A. Irvine
 */
public class A400561 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).add(Binomial.binomial(mN, 4)).multiply2();
  }
}
