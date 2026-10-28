package irvine.oeis.a401;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401314 allocated for Miquel Cerda.
 * @author Sean A. Irvine
 */
public class A401314 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Q x = Q.valueOf(++mN);
    long cnt = 0;
    while (!x.isOne()) {
      ++cnt;
      if (x.isInteger()) {
        if (x.toZ().isEven()) {
          x = x.multiply(3).add(1);
        } else {
          x = x.subtract(1).divide(4);
        }
      } else {
        x = x.multiply(6).add(2);
      }
    }
    return Z.valueOf(cnt);
  }
}

