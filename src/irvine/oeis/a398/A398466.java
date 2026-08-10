package irvine.oeis.a398;

import irvine.oeis.FilterSequence;
import irvine.oeis.a250.A250070;

/**
 * A086210.
 * @author Sean A. Irvine
 */
public class A398466 extends FilterSequence {

  /** Construct the sequence. */
  public A398466() {
    super(1, new A250070(), k -> {
      final String s = k.toString();
      return s.length() >= 6 && s.substring(0, 3).equals(s.substring(3, 6));
    });
  }
}
