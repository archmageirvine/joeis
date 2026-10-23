package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399417 Order array, U, of the array W given by w(n, k) = k*(n + log(2)), for n &gt;= 1, k &gt;= 1, a rectangular array, read by descending antidiagonals; see Comments.
 * @author Sean A. Irvine
 */
public class A399417 extends A399406 {

  /** Construct the sequence. */
  public A399417() {
    super(CR.LOG2);
  }
}
