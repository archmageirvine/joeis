package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398143 Survivor in the Josephus problem with golden-ratio steps: n people stand in a circle, counting starts at person 1, and the i-th person eliminated is the A282162(i)-th person counted (steps 3,2,3,3,2,3,2,3,3,2,..., the Fibonacci word with 0 -&gt; 3, 1 -&gt; 2).
 * @author Sean A. Irvine
 */
public class A398143 extends Sequence1 {

  private long mN = 0;

  private Z b(final long m) {
    return Z.FIVE.multiply(m * m).sqrt().add(m).divide2().add(m);
  }

  @Override
  public Z next() {
    ++mN;
    long r = 1;
    while (Functions.FIBONACCI.l(r) <= mN) {
      ++r;
    }
    final long j = mN - Functions.FIBONACCI.i(--r);
    return j > 0 ? b(j).add(2) : (r & 1) == 0 ? Z.ONE : Z.TWO;
  }
}
