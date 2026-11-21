package irvine.oeis.a402;

/**
 * A402235 Triangle read by rows: T(n,k) is the number of acyclic digraphs (or DAGs) on n labeled nodes in which every node has in-degree at most 2 and the longest directed path has k arcs, n &gt;= 1, 0 &lt;= k &lt;= n-1.
 * @author Gregory Morse
 */
public class A402235 extends A402234 {
  /** Construct the sequence. */
  public A402235() {
    super(2);
  }
}
