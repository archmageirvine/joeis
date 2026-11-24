package irvine.oeis.a402;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a001.A001132;

/**
 * A402330 allocated for Charles L. Hohn.
 * @author Sean A. Irvine
 */
public class A402330 extends PartialProductSequence {

  /** Construct the sequence. */
  public A402330() {
    super(1, new A001132());
  }
}
