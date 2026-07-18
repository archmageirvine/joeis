package irvine.oeis.a396;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A396762 a(n) is the number of distinct triples of triangles chosen from n^2 unit triangles of a triangular grid up to rotation and reflection without having centers of all three triangles in a same symmetrical axis.
 * @author Sean A. Irvine
 */
public class A396762 extends A396761 {

  @Override
  public Z next() {
    return super.next().subtract(Binomial.binomial(mN, 3));
  }
}

