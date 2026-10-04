package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a057.A057655;

/**
 * A395910 allocated for Andrew J. Morris.
 * @author Sean A. Irvine
 */
public class A395910 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A057655());
  private long mN = 0;

  private Z n(final long n, final long z) {
    final CR s = CR.valueOf(n * n - z * z).sqrt();
    final Z a = mA.a(s.add(n).square().floor().add(0));
    final Z b = mA.a(CR.valueOf(n).subtract(s).square().ceil().subtract(1));
    return a.subtract(b);
  }

  @Override
  public Z next() {
    return mA.a(4 * ++mN * mN).add(Integers.SINGLETON.sum(1, mN, k -> n(mN, k)).multiply2());
  }
}
