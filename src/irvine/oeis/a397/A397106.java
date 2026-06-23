package irvine.oeis.a397;

import irvine.oeis.a275.A275314;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397106 a(n) = n + A275314(n), for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A397106 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397106() {
    super(1, new A275314(), (n, k) -> k.add(n));
  }
}
