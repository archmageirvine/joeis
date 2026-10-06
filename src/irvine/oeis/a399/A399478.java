package irvine.oeis.a399;

import irvine.oeis.gf.EgfSequence;

/**
 * A086786.
 * @author Sean A. Irvine
 */
public class A399478 extends EgfSequence {

  /** Construct the sequence. */
  public A399478() {
    super(1, "log(1-x) * (1-2*x) / (1-x)");
  }
}
