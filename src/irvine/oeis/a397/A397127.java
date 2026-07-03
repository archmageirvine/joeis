package irvine.oeis.a397;

import irvine.oeis.a126.A126706;

/**
 * A397127 Lexicographically earliest sequence of distinct numbers k that are neither squarefree nor prime powers (k in A126706), such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A397127 extends A397126 {

  /** Construct the sequence. */
  public A397127() {
    super(new A126706());
  }
}
