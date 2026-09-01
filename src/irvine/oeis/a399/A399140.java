package irvine.oeis.a399;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005835;
import irvine.oeis.a192.A192270;

/**
 * A399140 Integers that are both pseudoperfect and pseudo-antiperfect.
 * @author Sean A. Irvine
 */
public class A399140 extends FilterSequence {

  private static boolean isPseudoperfect(final Z k) {
    final Z[] d = Jaguar.factor(k).divisorsSorted();
    return A005835.isPseudoperfect(d, d.length - 1, Z.ZERO);
  }

  /** Construct the sequence. */
  public A399140() {
    super(1, new A192270(), A399140::isPseudoperfect);
  }
}
