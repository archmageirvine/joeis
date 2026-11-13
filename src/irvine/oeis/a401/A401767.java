package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.recur.LinearRecurrence;
import irvine.oeis.transform.MobiusTransformSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A401767 Product_{n&gt;=1} zeta(n*s)^a(n) equals the Dirichlet series of the 4-full numbers.
 * @author Sean A. Irvine
 */
public class A401767 extends Sequence1 {

  private final Sequence mA = new MobiusTransformSequence(1, new SimpleTransformSequence(1, new LinearRecurrence(1, new long[] {-1, 0, 0, 1}, new long[] {1, 1, 1, -3}), Z.ONE::subtract), 0).skip();
  private long mN = 0;

  @Override
  public Z next() {
    return mA.next().divide(++mN);
  }
}

