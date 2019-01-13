package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ModTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testModBug() {
    final Z z = new Z("-430517197360049114649254761813334478176588766913774354007821113587705248241349891590870360903822781608045723719923315101376071263221414141097395043997147623598972753083995328634924039973804511581154270815651576129011117318130083129519611521490458295573646358890229396234985089298172148926978853528280");
    final long zm = z.mod(616L);
    assertEquals(0L, zm);
    final Z zz = z.mod(Z.valueOf(616L));
    assertEquals(Z.ZERO, zz);
  }

  public void testMod() {
    try {
      Z.ZERO.mod(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ONE.mod(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.NEG_ONE.mod(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(Z.ZERO, Z.ZERO.mod(Z.ONE));
    assertEquals(Z.ZERO, Z.ZERO.mod(Z.NEG_ONE));
    assertEquals(Z.ZERO, Z.ZERO.mod(Z.TWO));

    for (int i = 30; i < 1000; i += 7) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      for (int j = 1; j <= i; j += 13) {
        final BigInteger n = new BigInteger(j, RANDOM);
        if (!BigInteger.ZERO.equals(n)) {
          final Z zn = Z.valueOf(n);
          assertEquals(d.mod(n), zd.mod(zn).bigIntegerValue());
          if (!Z.ONE.equals(zn)) {
            final BigInteger dn = d.negate();
            final Z zdn = zd.negate();
            final Z znn = zn.negate();
            assertEquals(dn + "%" + n, dn.mod(n), zdn.mod(zn).bigIntegerValue());
            final BigInteger r = dn.mod(n).subtract(n);
            final Z zr = zdn.mod(znn);
            if (Z.ZERO == zr) {
              if (r != BigInteger.ZERO) {
                assertEquals(r, n.negate());
              }
            } else {
              assertEquals(dn + "%" + n.negate(), r, zr.bigIntegerValue());
            }
            final BigInteger l = d.mod(n).subtract(n);
            final Z lr = zd.mod(znn);
            if (Z.ZERO == lr) {
              if (l != BigInteger.ZERO) {
                assertEquals(l, n.negate());
              }
            } else {
              assertEquals(l, lr.bigIntegerValue());
            }
          }
          // check immutability
          assertEquals(d, zd.bigIntegerValue());
          assertEquals(n, zn.bigIntegerValue());
        }
      }
    }
  }

  public void testModBug2() {
    final Z n = new Z("39504074767719317671407029127860866626778006365631769238720332569099452021140678586536943197418387264258490455719815348098422442462406573494483908943062173006585323942964279480610531353800021862593379657198741616212551855906093001");
    final Z m = new Z("483307128567470272598786707707168927496458230246176997427362547794749648520751661873288023752014231795374071176086904927981482590043757092803551744535059679295610604046689742474161412258830417835171093350609168628803991532673");
    assertEquals(Z.ZERO, n.mod(m));
  }
}
