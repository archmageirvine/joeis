package irvine.oeis.a399;

import irvine.oeis.Combiner;
import irvine.oeis.a001.A001187;
import irvine.oeis.a001.A001832;

/**
 * A399826 Number of labeled graphs whose family of open neighborhoods is connected.
 * @author Sean A. Irvine
 */
public class A399826 extends Combiner {

  /** Construct the sequence. */
  public A399826() {
    super(0, new A001187(), new A001832().prepend(1), SUBTRACT);
  }
}
