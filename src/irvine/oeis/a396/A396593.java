package irvine.oeis.a396;

import irvine.oeis.a089.A089582;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A396593 Run length transform of A089582.
 * @author Sean A. Irvine
 */
public class A396593 extends RunLengthTransform {

  /** Construct the sequence. */
  public A396593() {
    super(1, new A089582());
  }
}
