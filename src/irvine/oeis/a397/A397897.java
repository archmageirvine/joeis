package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000040;

/**
 * A397897 a(n) = Sum_{j=1..n} (-1)^(j+1) * j * prime(n-j+1).
 * @author Sean A. Irvine
 */
public class A397897 extends AbstractSequence {

  /** Construct the sequence. */
  public A397897() {
    super(0);
  }

  private Z mA = null;
  private Z mB = Z.ZERO;
  private A000040 mSeq = new A000040();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    final Z t = mSeq.next().subtract(mB.multiply2()).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
