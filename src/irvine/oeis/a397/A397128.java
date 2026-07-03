package irvine.oeis.a397;

import irvine.oeis.a332.A332785;

/**
 * A397128 Lexicographically earliest sequence of distinct numbers k that are neither squarefree nor powerful (k in A332785), such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A397128 extends A397126 {

  /** Construct the sequence. */
  public A397128() {
    super(new A332785());
  }
}
