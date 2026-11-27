package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401955 Number of steps to reach 1 by the map x -&gt; (3x+1)/2 if x is odd, 3x/2 if x == 2 (mod 4), and largest odd factor of x if x == 0 (mod 4), or -1 if 1 is never reached.
 * @author Sean A. Irvine
 */
public class A401955 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z x = Z.valueOf(++mN);
    long cnt = 0;
    while (!x.isOne()) {
      if (x.isOdd()) {
        x = x.multiply(3).add(1).divide2();
      } else if (x.mod(4) == 2) {
        x = x.multiply(3).divide2();
      } else {
        x = x.makeOdd();
      }
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
