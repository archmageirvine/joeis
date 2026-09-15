package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A399575 allocated for Michael R. Page.
 * @author Sean A. Irvine
 */
public class A399575 extends AbstractSequence {

  /** Construct the sequence. */
  public A399575() {
    super(6);
  }

  private long mP = 11;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.l(mP);
    long k = mP / 2;
    while (true) {
      if (!Predicates.PRIME.is(k) && !Predicates.PRIME.is(mP - k)) {
        return Z.valueOf(mP - 2 * k);
      }
      --k;
    }
  }
}
