package irvine.oeis.a398;

import irvine.oeis.UnionSequence;
import irvine.oeis.a005.A005117;
import irvine.oeis.a397.A397710;

/**
 * A398754 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A398754 extends UnionSequence {

  /** Construct the sequence. */
  public A398754() {
    super(new A005117(), new A397710());
  }
}
