package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a062.A062692;

/**
 * A398874 allocated for Dar\u00edo Clavijo.
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
