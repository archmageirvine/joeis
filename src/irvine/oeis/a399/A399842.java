package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A007770.
 * @author Sean A. Irvine
 */
public class A399842 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399842() {
    super(0, new A002110(), k -> new Z(k.toString().replace("0", "")));
  }
}
