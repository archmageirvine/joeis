package irvine.oeis.a396;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A396354 Number of unsatisfiable 3-SAT formulas with n variables and 4 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A396354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A396354() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {10, 831, 9641, 50018, 183940, 549145, 1416331, 3270676});
  }
}
