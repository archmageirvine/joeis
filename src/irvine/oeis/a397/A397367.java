package irvine.oeis.a397;

import irvine.oeis.DirectSequence;
import irvine.oeis.a246.A246655;

/**
 * A397367 Lexicographically earliest sequence of distinct prime powers p^m, m &gt;= 1, such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A397367 extends A397126 {

  /** Construct the sequence. */
  public A397367() {
    super(DirectSequence.forceCreate(1, new A246655()));
  }
}
