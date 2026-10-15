package irvine.oeis.a398;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002133;

/**
 * A398920 Number of solutions of the Diophantine inequality a*b+b*c+c*d &lt;= n, with a,b,c &gt;= 1.
 * @author Sean A. Irvine
 */
public class A398920 extends PartialSumSequence {

  /** Construct the sequence. */
  public A398920() {
    super(1, new A002133());
  }
}

