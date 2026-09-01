package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a026.A026238;

/**
 * A397887 a(1) = 1; a(n) = n + a(A026238(n)) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A397887 extends CachedSequence {

  private final Sequence mS = new A026238();

  /** Construct the sequence. */
  public A397887() {
    super(1);
  }

  @Override
  protected Z compute(final Z nn) {
    final long n = nn.longValueExact();
    return n <= 1 ? Z.ONE : a(mS.next()).add(n);
  }
}
