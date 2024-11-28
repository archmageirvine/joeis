package irvine.math.dirichlet;

import irvine.oeis.Sequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000034;
import irvine.oeis.a000.A000035;
import irvine.oeis.a000.A000122;
import irvine.oeis.a000.A000124;
import irvine.oeis.a000.A000203;
import irvine.oeis.a001.A001615;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DgfTest extends TestCase {

  private void check(final Ds series, final String expected, final int terms) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= terms; ++k) {
      sb.append(series.coeff(k)).append(',');
    }
    assertEquals(expected, sb.toString());
  }

  private void check(final Ds series, final String expected) {
    check(series, expected, 20);
  }

  private void check(final Ds series, final Sequence seq, final int terms) {
    for (int k = 1; k <= terms; ++k) {
      assertEquals(seq.next(), series.coeff(k));
    }
  }

  private void check(final Ds series, final Sequence seq) {
    check(series, seq, 20);
  }

  public void testOne() {
    check(Dgf.one(), "1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,");
  }

  public void testZeta() {
    check(Dgf.zeta(), "1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,");
  }

  public void testToString() {
    assertEquals("1+1/4^s+1/9^s+1/16^s", Dgf.toString(Dgf.zeta(2), 20));
  }

  public void testZetaP() {
    assertEquals("1+1/3^s+1/9^s+1/27^s", Dgf.toString(Dgf.zetam(3), 30));
  }

  public void testInverse() {
    assertEquals("1+-1/2^s+-1/3^s+-1/5^s+1/6^s+-1/7^s+1/10^s+-1/11^s+-1/13^s+1/14^s+1/15^s", Dgf.toString(Dgf.inverseZeta(), 15));
    assertEquals("1+-1/2^s+-1/3^s+-1/5^s+1/6^s+-1/7^s+1/10^s+-1/11^s+-1/13^s+1/14^s+1/15^s", Dgf.toString(Dgf.inverse(Dgf.zeta()), 15));
  }

  public void testA000005() {
    check(Dgf.pow(Dgf.zeta(), 2), new A000005());
    check(Dgf.square(Dgf.zeta()), new A000005());
  }

  public void testA000034() {
    check(Dgf.multiply(Dgf.zeta(), Dgf.from(1, 1)), new A000034());
  }

  public void testA000035() {
    check(Dgf.multiply(Dgf.from(1, -1), Dgf.zeta()), new A000035().skip());
  }

  public void testA000122() {
    check(Dgf.multiply(Dgf.zeta(2), 2), new A000122().skip());
    check(Dgf.multiply(Dgf.substitute(Dgf.zeta(), 2), 2), new A000122().skip());
  }

  public void testA000124() {
    // (zeta(s-2) + zeta(s-1) + 2*zeta(s))/2
    check(Dgf.divide(Dgf.add(Dgf.add(Dgf.zeta(1, 2), Dgf.zeta(1, 1)), Dgf.multiply(Dgf.zeta(), 2)), 2), new A000124().skip());
  }

  public void testA000203() {
    check(Dgf.multiply(Dgf.zeta(), Dgf.zeta(1, 1)), new A000203());
  }

  public void testA001615() {
    // zeta(s) * zeta(s - 1) / zeta(2s)
    check(Dgf.divide(Dgf.multiply(Dgf.zeta(), Dgf.zeta(1, 1)), Dgf.zeta(2)), new A001615());
  }
}
