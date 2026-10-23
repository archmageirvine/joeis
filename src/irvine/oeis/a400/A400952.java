package irvine.oeis.a400;

/**
 * A400952 Triangle read by rows: T(n,k) is the number of distinct ways to get the minimum runtime for k threads to complete n tasks, where time(n_i) = i^2, with 1 &lt;= i &lt;= n.
 * @author Sean A. Irvine
 */
public class A400952 extends A400950 {

  @Override
  protected long bsum(final int i) {
    return (long) i * i;
  }
}
