package irvine.oeis.a401;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a003.A003418;

/**
 * A401177 allocated for Sophie Wynn.
 * @author Sean A. Irvine
 */
public class A401177 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A401177() {
    super(1, 0, new A003418(), k -> k.subtract(1).isProbablePrime() && k.add(1).isProbablePrime());
  }
}
