package irvine.oeis.a399;

import irvine.oeis.InverseSequence;
import irvine.oeis.a394.A394762;

/**
 * A399475 Position of the first appearance of n in A394762.
 * @author Sean A. Irvine
 */
public class A399475 extends InverseSequence {

  /** Construct the sequence. */
  public A399475() {
    super(2, 2, new A394762());
  }
}
