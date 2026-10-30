package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399573 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399573 extends A399406 {

  /** Construct the sequence. */
  public A399573() {
    super(CR.THREE.sqrt().divide(2));
  }
}
