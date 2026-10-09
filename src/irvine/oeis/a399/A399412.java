package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399412 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399412 extends A399406 {

  /** Construct the sequence. */
  public A399412() {
    super(CR.THREE.sqrt().add(CR.SQRT2));
  }
}
