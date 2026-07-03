package irvine.oeis.a397;

import irvine.oeis.a120.A120944;

/**
 * A397340 Lexicographically earliest sequence of distinct squarefree composite numbers, such that for any prime p, any run of consecutive multiples of p has length exactly 2.
 * @author Sean A. Irvine
 */
public class A397340 extends A397126 {

  /** Construct the sequence. */
  public A397340() {
    super(new A120944());
  }
}
