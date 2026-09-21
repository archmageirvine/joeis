package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;

/**
 * A399914 Take the record low points among the negative terms in A399184, and negate them.
 * @author Sean A. Irvine
 */
public class A399914 extends RecordSequence {

  /** Construct the sequence. */
  public A399914() {
    super(1, new A399184() {
      @Override
      public Z next() {
        return super.next().negate();
      }
    }, false);
    skip(2); // go past initial negative terms
  }
}
