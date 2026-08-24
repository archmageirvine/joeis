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

  private static final Sequence S = new A026238();

  /** Construct the sequence. */
  public A397887() {
    super(1, Long.class, (self, n) -> n == 1 ? Z.ONE : self.a(S.next()).add(n));
  }
}
