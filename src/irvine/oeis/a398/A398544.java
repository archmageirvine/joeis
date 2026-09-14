package irvine.oeis.a398;

import irvine.oeis.FilterSequence;
import irvine.oeis.a173.A173056;

/**
 * A398544 allocated for Gerhard Kirchner.
 * @author Sean A. Irvine
 */
public class A398544 extends FilterSequence {

  /** Construct the sequence. */
  public A398544() {
    super(1, new A173056(), k -> k.mod(3) == 0);
  }
}
