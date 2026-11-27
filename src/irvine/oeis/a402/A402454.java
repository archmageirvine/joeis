package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A402454 allocated for G. L. Honaker, Jr.
 * @author Sean A. Irvine
 */
public class A402454 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A402454() {
    super(1, new A000040(), p -> Z.TWO.equals(p) ? Z.FOUR : Z.THREE.equals(p) ? Z.valueOf(84) : p.multiply(p.subtract(1)).multiply(p.subtract(2)).divide(6));
  }
}
