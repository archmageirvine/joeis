package irvine.oeis.a396;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000009;
import irvine.oeis.a219.A219554;

/**
 * A396961 Number of bipartite partitions of (n, n) into distinct parts containing at least one part with both coordinates strictly positive.
 * @author Sean A. Irvine
 */
public class A396961 extends Combiner {

  /** Construct the sequence. */
  public A396961() {
    super(0, new A219554(), new A000009(), (a, b) -> a.subtract(b.square()));
  }
}
