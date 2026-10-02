package irvine.oeis.a400;

import irvine.math.z.Integers;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400393 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400393 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400393() {
    super(1, (p, e) -> Integers.SINGLETON.sum(0, e, k -> p.pow(k & (e - k))));
  }
}

