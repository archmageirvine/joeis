package irvine.oeis.a397;

import irvine.oeis.DirectSequence;
import irvine.oeis.a246.A246547;

/**
 * A397368 Lexicographically earliest sequence of distinct proper prime powers p^m, m &gt;= 2, such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A397368 extends A397126 {

  /** Construct the sequence. */
  public A397368() {
    super(DirectSequence.forceCreate(1, new A246547()));
  }
}
