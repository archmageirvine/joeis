package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a062.A062692;

/**
 * A398874 Number of recursive calls made by the binary Fredricksen-Kessler-Maiorana (FKM) recursive generator when generating a de Bruijn sequence of order n.
 * @author Sean A. Irvine
 */
public class A398874 extends PartialSumSequence {

  /** Construct the sequence. */
  public A398874() {
    super(1, new A062692());
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
