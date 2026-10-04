package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399196 allocated for Jakub Buczak.
 * @author Sean
 */
public class A399196 extends Sequence1 {

  private final long mBase;
  private Z mA = null;

  protected A399196(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A399196() {
    this(10);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    mA = mA.multiply(mBase);
    for (long d = 0; d < mBase; ++d) {
      final Z t = mA.add(d);
      if (Predicates.DEFICIENT.is(t)) {
        mA = t;
        return mA;
      }
    }
    return null; // If this happens the sequence is finite
  }
}
