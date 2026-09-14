package irvine.oeis.a399;

import irvine.oeis.InverseSequence;
import irvine.oeis.a394.A394762;

/**
 * A399745 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399745 extends InverseSequence {

  /** Construct the sequence. */
  public A399745() {
    super(2, 2, new A394762());
  }
}
