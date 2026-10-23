package irvine.oeis.a399;

import irvine.math.cr.CR;

/**
 * A399411 Order array, U, of the array W given by w(n, k) = k*(n + sqrt(1/3)), for n &gt;= 1, k &gt;= 1, a rectangular array, read by descending antidiagonals; see Comments.
 * @author Sean A. Irvine
 */
public class A399411 extends A399406 {

  /** Construct the sequence. */
  public A399411() {
    super(CR.THREE.sqrt().inverse());
  }
}
