package irvine.oeis.a401;

import irvine.math.q.Q;
import irvine.oeis.a065.A065442;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A401890 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A401890 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A401890() {
    super(1, new A065442().getCR().divide(2).add(new Q(5, 4)));
  }
}
