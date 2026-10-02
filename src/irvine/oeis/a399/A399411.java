package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399411 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399411 extends A399406 {

  /** Construct the sequence. */
  public A399411() {
    super(CR.THREE.sqrt().inverse());
  }
}
