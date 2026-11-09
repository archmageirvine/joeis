package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399418 Order array, U, of the array W given by w(n, k) = k*(n + 2*Pi), for n &gt;= 1, k &gt;= 1, a rectangular array, read by descending antidiagonals; see Comments.
 * @author Sean A. Irvine
 */
public class A399418 extends A399406 {

  /** Construct the sequence. */
  public A399418() {
    super(CR.TAU);
  }
}
