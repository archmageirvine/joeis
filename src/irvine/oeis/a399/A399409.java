package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399409 Order array of the array W given by w(n, k) = k*(n + sqrt(5)), for n &gt;= 1, k &gt;= 1, a rectangular array, read by descending antidiagonals; see Comments.
 * @author Sean A. Irvine
 */
public class A399409 extends A399406 {

  /** Construct the sequence. */
  public A399409() {
    super(CR.FIVE.sqrt());
  }
}
