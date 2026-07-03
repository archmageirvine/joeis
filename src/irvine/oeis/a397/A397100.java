package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.a073.A073642;

/**
 * A397100 a(n) is the number of steps by which n's trajectory under f is ahead of 0's; i.e., f^k(0) = f^(k-a(n))(n) for all sufficiently large k, where f(n) = n XOR 2^A000120(n).
 * @author Sean A. Irvine
 */
public class A397100 extends A073642 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(Long.bitCount(++mN)).square().subtract(super.next().multiply2());
  }
}
