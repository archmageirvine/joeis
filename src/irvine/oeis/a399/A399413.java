package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399413 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399413 extends A399406 {

  /** Construct the sequence. */
  public A399413() {
    super(CR.THREE.sqrt().subtract(CR.SQRT2));
  }
}
