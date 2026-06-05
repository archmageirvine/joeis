package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396513 a(n) is the minimum integer k such that rad(k)=rad(k+2n), where rad(x) is the squarefree kernel of x (A007947).
 * @author Sean A. Irvine
 */
public class A396513 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    while (true) {
      if (Functions.RAD.l(++k) == Functions.RAD.l(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

