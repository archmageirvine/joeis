package irvine.math.elliptic;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EllipticCurveTest extends TestCase {

  public void test() {
    // y^2 + 2xy + 3y = x3 + 4x2 + 5x + 6
    final EllipticCurve ec = new EllipticCurve(Q.TWO, new Q(4), Q.THREE, new Q(5), new Q(6));
    assertEquals(Q.TWO, ec.a1());
    assertEquals(new Q(4), ec.a2());
    assertEquals(Q.THREE, ec.a3());
    assertEquals(new Q(5), ec.a4());
    assertEquals(new Q(6), ec.a6());
    assertEquals(new Q(20), ec.b2());
    assertEquals(new Q(16), ec.b4());
    assertEquals(new Q(33), ec.b6());
    assertEquals(new Q(101), ec.b8());
    assertEquals(new Q(16), ec.c4());
    assertEquals(new Q(-3608), ec.c6());
    assertEquals(new Q(-7531), ec.discriminant());
    assertEquals(new Q(-4096, 7531), ec.j());
    final EllipticCurve ect = ec.twist(Q.ONE, Q.TWO, Q.THREE, new Q(4));
    assertEquals(ec.j(), ect.j());
    assertEquals(ec.discriminant().divide(16777216), ect.discriminant());
    assertEquals(ec.discriminant().multiply(1728), ec.c4().pow(3).subtract(ec.c6().square()));
  }

  private void check(final EllipticCurve ec) {
    assertEquals(ec.discriminant().multiply(1728), ec.c4().pow(3).subtract(ec.c6().square()));
    assertEquals(new Q(16), ec.c4());
    assertEquals(new Q(-3608), ec.c6());
    assertEquals(new Q(-7531), ec.discriminant());
    assertEquals(new Q(-4096, 7531), ec.j());
    assertEquals(Q.ZERO, ec.a1());
    assertEquals(Q.TWO, ec.a2());
    assertEquals(Q.ONE, ec.a3());
    assertEquals(Q.ONE, ec.a4());
    assertEquals(new Q(4), ec.a6());
    assertEquals(new Q(8), ec.b2());
    assertEquals(Q.TWO, ec.b4());
    assertEquals(new Q(17), ec.b6());
    assertEquals(new Q(33), ec.b8());
  }

  public void testKrausLaskaConnell() {
    check(new EllipticCurve(Z.valueOf(16), Z.valueOf(-3608)));
  }

  public void testConsistent() {
    check(new EllipticCurve(Q.ZERO, Q.TWO, Q.ONE, Q.ONE, new Q(4)));
  }

  private void check(final long p, final int[] curve, final String kodaira, final long cp) {
    final EllipticCurve ec = new EllipticCurve(new Q(curve[0]), new Q(curve[1]), new Q(curve[2]), new Q(curve[3]), new Q(curve[4]));
    final Z prime = Z.valueOf(p);
    final String kodairaSymbol = ec.kodairaSymbol(prime);
    assertEquals(kodairaSymbol, kodaira, kodairaSymbol);
    assertEquals(cp, ec.localIndex(prime));
  }

  public void testKodairaEtc() {
    // Tests from Cremona's table
    check(11, new int[] {0, -1, 1, -10, -20}, "I5", 5);
    check(11, new int[] {0, -1, 1, -7820, -263580}, "I1", 1);
    check(11, new int[] {0, -1, 1, 0, 0}, "I1", 1);
    check(2, new int[] {1, 0, 1, 4, -6}, "I6", 2);
    check(7, new int[] {1, 0, 1, 4, -6}, "I3", 3);
    check(2, new int[] {1, 0, 1, -36, -70}, "I3", 1);
    check(7, new int[] {1, 0, 1, -36, -70}, "I6", 6);
    check(2, new int[] {1, 0, 1, -171, -874}, "I18", 2);
    check(7, new int[] {1, 0, 1, -171, -874}, "I1", 1);
    check(3, new int[] {1, 1, 1, -10, -10}, "I4", 2);
    check(5, new int[] {1, 1, 1, -10, -10}, "I4", 4);
    check(17, new int[] {1, -1, 1, -1, -14}, "I4", 4);
    check(19, new int[] {0, 1, 1, 1, 0}, "I1", 1);
    check(2, new int[] {0, 1, 0, 4, 4}, "IV*", 3);
    check(5, new int[] {0, 1, 0, 4, 4}, "I2", 2);
    check(2, new int[] {0, 1, 0, -1, 0}, "IV", 3);
    check(5, new int[] {0, 1, 0, -1, 0}, "I1", 1);
    check(2, new int[] {0, 1, 0, -41, -116}, "IV", 1);
    check(5, new int[] {0, 1, 0, -41, -116}, "I3", 1);
    check(2, new int[] {0, -1, 0, -4, 4}, "I*1", 4);
    check(3, new int[] {0, -1, 0, -4, 4}, "I2", 2);
    check(2, new int[] {0, -1, 0, -24, -36}, "III*", 2);
    check(3, new int[] {0, -1, 0, -24, -36}, "I4", 2);
    check(2, new int[] {0, -1, 0, 1, 0}, "III", 2);
    check(3, new int[] {0, -1, 0, 1, 0}, "I1", 1);
    check(2, new int[] {0, -1, 0, -384, -2772}, "II*", 1);
    check(3, new int[] {0, -1, 0, -384, -2772}, "I2", 2);
    check(3, new int[] {0, 0, 1, 0, -7}, "IV*", 3);
    check(3, new int[] {0, 0, 1, -270, -1708}, "II*", 1);
    check(3, new int[] {0, 0, 1, 0, 0}, "II", 1);
    check(3, new int[] {0, 0, 1, -30, 63}, "IV", 1);
    check(2, new int[] {0, 0, 0, -11, 14}, "I*0", 2);
    check(2, new int[] {0, 0, 0, 0, 1}, "IV", 3);
    check(3, new int[] {0, 0, 0, 0, 1}, "III", 2);
    check(2, new int[] {0, 0, 0, -15, 22}, "IV*", 3);
    check(3, new int[] {0, 0, 0, -15, 22}, "III", 2);
    check(7, new int[] {1, -1, 0, -1822, 30393}, "III*", 2);
    check(2, new int[] {1, 0, 0, 115, 561}, "I5", 5);
    check(3, new int[] {1, 0, 0, 115, 561}, "I10", 10);
    check(11, new int[] {1, 0, 0, 115, 561}, "I2", 2);
  }
}
