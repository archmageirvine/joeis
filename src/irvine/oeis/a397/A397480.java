package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002445;

/**
 * A397480 a(n) = n/m for the smallest m such that denominator(B_{2m}) = denominator(B_{2n}), where B_k is the k-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A397480 extends Sequence1 {

  private final Sequence mA = new A002445().skip();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mN).divide(Functions.CARMICHAEL_LAMBDA.z(mA.next()));
  }
}
