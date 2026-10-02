package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399410 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A399410 extends A399406 {

  /** Construct the sequence. */
  public A399410() {
    super(CR.SQRT2.inverse());
  }
}
