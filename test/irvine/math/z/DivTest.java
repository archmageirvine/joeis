package irvine.math.z;

import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DivTest extends TestCase {

  public void testDivisionBug() {
    Z z = Z.valueOf(-232275907L);
    z.divide(-84450203L);
    final long rem = -232275907L % -84450203L;
    assertEquals(rem, z.auxiliary());
    assertEquals(rem, z.divideAndRemainder(Z.valueOf(-84450203L))[1].longValue());
    z = new Z("10935537140982855604");
    z.divide(249995176L);
    assertEquals(179293076L, z.auxiliary());
    assertEquals(179293076L, z.divideAndRemainder(Z.valueOf(249995176L))[1].longValue());
    z = Z.valueOf(62925537713L);
    z.divide(5187252779L);
    assertEquals(678504365L, z.auxiliary());
    assertEquals(678504365L, z.divideAndRemainder(Z.valueOf(5187252779L))[1].longValue());
    assertEquals(11L, Z.valueOf(-3008422456L).divideAndRemainder(Z.valueOf(-265925806L))[0].longValue());
  }

  public void testDivideAndRemainder() {
    try {
      Z.ZERO.divideAndRemainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    try {
      Z.ONE.divideAndRemainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    try {
      Z.NEG_ONE.divideAndRemainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    final Z[] hh = Z.ZERO.divideAndRemainder(Z.ONE);
    assertEquals(2, hh.length);
    assertEquals(Z.ZERO, hh[0]);
    assertEquals(Z.ZERO, hh[1]);
    final Z[] hi = Z.ONE.divideAndRemainder(Z.ONE);
    assertEquals(2, hi.length);
    assertEquals(Z.ONE, hi[0]);
    assertEquals(Z.ZERO, hi[1]);
    final Z[] hj = Z.TWO.divideAndRemainder(Z.TWO);
    assertEquals(2, hj.length);
    assertEquals(Z.ONE, hj[0]);
    assertEquals(Z.ZERO, hj[1]);

    for (int i = 30; i < 1000; ++i) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      if (d.equals(BigInteger.ZERO)) {
        continue;
      }
      final BigInteger n = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zn = Z.valueOf(n);
      final BigInteger[] r = n.divideAndRemainder(d);
      final Z[] zr = zn.divideAndRemainder(zd);
      assertEquals(2, zr.length);
      assertEquals(n + "/" + d + " mRemainder: " + r[1], r[1], zr[1].bigIntegerValue());
      assertEquals(n + "/" + d + " quotient: " + r[0], r[0], zr[0].bigIntegerValue());
      // check immutability
      assertEquals(d, zd.bigIntegerValue());
      assertEquals(n, zn.bigIntegerValue());
    }

    for (int i = 30; i < 1000; ++i) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      if (d.equals(BigInteger.ZERO)) {
        continue;
      }
      final BigInteger n = new BigInteger(i / 3, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zn = Z.valueOf(n);
      BigInteger[] r = n.divideAndRemainder(d);
      Z[] zr = zn.divideAndRemainder(zd);
      assertEquals(2, zr.length);
      assertEquals(n + "/" + d + " mRemainder: " + r[1], r[1], zr[1].bigIntegerValue());
      assertEquals(n + "/" + d + " quotient: " + r[0], r[0], zr[0].bigIntegerValue());
      r = n.negate().divideAndRemainder(d.negate());
      zr = zn.negate().divideAndRemainder(zd.negate());
      assertEquals(2, zr.length);
      assertEquals("mRemainder: " + r[1], r[1], zr[1].bigIntegerValue());
      assertEquals("quotient: " + r[0], r[0], zr[0].bigIntegerValue());
      r = n.divideAndRemainder(d.negate());
      zr = zn.divideAndRemainder(zd.negate());
      assertEquals(2, zr.length);
      assertEquals("mRemainder: " + r[1], r[1], zr[1].bigIntegerValue());
      assertEquals("quotient: " + r[0], r[0], zr[0].bigIntegerValue());
      r = n.negate().divideAndRemainder(d);
      zr = zn.negate().divideAndRemainder(zd);
      assertEquals(2, zr.length);
      assertEquals("mRemainder: " + r[1], r[1], zr[1].bigIntegerValue());
      assertEquals("quotient: " + r[0], r[0], zr[0].bigIntegerValue());
      // test n/n
      zr = zd.divideAndRemainder(zd);
      assertEquals(Z.ONE, zr[0]);
      assertEquals(Z.ZERO, zr[1]);
      // check immutability
      assertEquals(d, zd.bigIntegerValue());
      assertEquals(n, zn.bigIntegerValue());
    }
  }

  public void testRemainder() {
    try {
      Z.ZERO.remainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ONE.remainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.NEG_ONE.remainder(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(Z.ZERO, Z.ZERO.remainder(Z.ONE));
    assertEquals(Z.ZERO, Z.ONE.remainder(Z.ONE));
    assertEquals(Z.ZERO, Z.TWO.remainder(Z.TWO));

    for (int i = 30; i < 1000; i += 17) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      if (d.equals(BigInteger.ZERO)) {
        continue;
      }
      final BigInteger n = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zn = Z.valueOf(n);
      final BigInteger r = n.remainder(d);
      final Z zr = zn.remainder(zd);
      assertEquals(n + "/" + d + " mRemainder: " + r, r, zr.bigIntegerValue());
    }

    for (int i = 30; i < 1000; i += 17) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      if (d.equals(BigInteger.ZERO)) {
        continue;
      }
      final BigInteger n = new BigInteger(i / 3, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zn = Z.valueOf(n);
      BigInteger r = n.remainder(d);
      Z zr = zn.remainder(zd);
      assertEquals(n + "/" + d + " mRemainder: " + r, r, zr.bigIntegerValue());
      r = n.negate().remainder(d.negate());
      zr = zn.negate().remainder(zd.negate());
      assertEquals("mRemainder: " + r, r, zr.bigIntegerValue());
      r = n.remainder(d.negate());
      zr = zn.remainder(zd.negate());
      assertEquals("mRemainder: " + r, r, zr.bigIntegerValue());
      r = n.negate().remainder(d);
      zr = zn.negate().remainder(zd);
      assertEquals("mRemainder: " + r, r, zr.bigIntegerValue());
      // test n/n
      assertEquals(Z.ZERO, zd.remainder(zd));
    }
  }

  public void testDivideLong() {
    try {
      Div.divide(Z.ONE, 0);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    assertEquals(Z.ZERO, Div.divide(Z.ONE, 5L));
    assertEquals(1L, Z.ONE.auxiliary());
    assertEquals(Z.ONE, Div.divide(Z.valueOf(-((1L << 30) + 5L)), -((1L << 30) + 5L)));
    assertEquals(Z.NEG_ONE, Div.divide(Z.valueOf(-((1L << 30) + 5L)), (1L << 30) + 5L));
    assertEquals(Z.NEG_ONE, Div.divide(Z.valueOf((1L << 30) + 5L), -((1L << 30) + 5L)));
    assertEquals(Z.ONE, Div.divide(Z.valueOf(-((1L << 29) + 5L)), -((1L << 29) + 5L)));
    assertEquals(Z.NEG_ONE, Div.divide(Z.valueOf(-((1L << 29) + 5L)), (1L << 29) + 5L));
    assertEquals(Z.NEG_ONE, Div.divide(Z.valueOf((1L << 29) + 5L), -((1L << 29) + 5L)));

    Z z = new Z("-106292604518414490773807845947441");
    assertEquals(new BigInteger("-47174442418949952011780604"), Div.divide(z, 2253182L).bigIntegerValue());
    assertEquals(-1065513L, z.auxiliary());

    z = z.negate();
    assertEquals(new BigInteger("47174442418949952011780604"), Div.divide(z, 2253182L).bigIntegerValue());
    assertEquals(1065513L, z.auxiliary());

    z = new Z("30541168220095042431054083918185580287025707013672758859767590438664686395875709254027862430755429328008305210369908893439376470164640508650644520322655105537629487241860458431155257744940102379171095193674166522281075773669409700877600200235788345743973917992548693301386796532256088105621031106137");
    assertEquals(new BigInteger("54160724242868008919391121469523890180591542852723956974031928828693648515426848793835224553106091077719865771255271911574023205146548337134995611442551276752779640513804694608473787526828022114519065257610386222005229384405444620197685998392793830829337561194464814226266456212106223535194"), z.divide(563898815L).bigIntegerValue());
    assertEquals(23711027L, z.auxiliary());
    assertEquals(new BigInteger("-54160724242868008919391121469523890180591542852723956974031928828693648515426848793835224553106091077719865771255271911574023205146548337134995611442551276752779640513804694608473787526828022114519065257610386222005229384405444620197685998392793830829337561194464814226266456212106223535194"), z.divide(-563898815L).bigIntegerValue());
    assertEquals(23711027L, z.auxiliary());
    z = z.negate();
    assertEquals(new BigInteger("-54160724242868008919391121469523890180591542852723956974031928828693648515426848793835224553106091077719865771255271911574023205146548337134995611442551276752779640513804694608473787526828022114519065257610386222005229384405444620197685998392793830829337561194464814226266456212106223535194"), z.divide(563898815L).bigIntegerValue());
    assertEquals(-23711027L, z.auxiliary());
    assertEquals(new BigInteger("54160724242868008919391121469523890180591542852723956974031928828693648515426848793835224553106091077719865771255271911574023205146548337134995611442551276752779640513804694608473787526828022114519065257610386222005229384405444620197685998392793830829337561194464814226266456212106223535194"), z.divide(-563898815L).bigIntegerValue());
    assertEquals(-23711027L, z.auxiliary());

    z = new Z("493415792859216289592708390566919213946590390066373503403166451596916681700677551497738888813924837468687619393401829137031416364181549854025704706115151589992555046738068794891612246141889053857165547391653295769208385546311163254532059977896536757136079598303390");
    assertEquals(new BigInteger("1770793553754124713682572089579759759550837159700632431570445689507916319657546348329779138845957725931302512965611848939389680631352571850055783975682376423605892996308831135266325236280284943852731350475243296049793901682369293508042425541650382600238742"), z.divide(278641060L).bigIntegerValue());
    assertEquals(274356870, z.auxiliary());

    z = new Z("223465312562490822560");
    assertEquals(-1453662490, z.divide(976885430L).hashCode());
    assertEquals(957571700L, z.auxiliary());
    assertEquals(-904221348, z.divide(198766157L).hashCode());
    assertEquals(162226795L, z.auxiliary());

    z = new Z("763210106792267353483183732705366208227978145139630379");
    assertEquals(-938956756, z.divide(81036346L).hashCode());
    assertEquals(57208087L, z.auxiliary());

    z = new Z("3330836469671163716794760377986233290893470180890985561605050568946286691447313087734861508349208973889788370843100430353148521852904533720803410731744820");
    assertEquals(-1084550785, z.divide(1556212L).hashCode());
    assertEquals(347160, z.auxiliary());

    // random search over <= long size numbers
    for (int i = 0; i < 100; ++i) {
      final long n = AddTest.RANDOM.nextLong();
      final long d = AddTest.RANDOM.nextLong();
      if (d != 0L) {
        final Z nn = Z.valueOf(n);
        final Z qq = nn.divide(d);
        final long rr = nn.auxiliary();
        assertEquals(n % d, rr);
        assertEquals(n + "/" + d, Z.valueOf(n / d), qq);
      }
    }
  }

  public void testDivide() {
    try {
      Z.ZERO.divide(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    try {
      Z.ONE.divide(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }
    try {
      Z.NEG_ONE.divide(Z.ZERO);
      fail("Allowed division by zero");
    } catch (final ArithmeticException e) {
      assertEquals("Division by zero.", e.getMessage());
    }

    assertEquals(1L, Z.valueOf(1032009423L).divide(Z.valueOf(910589126L)).longValue());

    for (int i = 30; i < 10000; i += 137) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      if (d.equals(BigInteger.ZERO)) {
        continue;
      }
      final BigInteger n = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zn = Z.valueOf(n);
      final BigInteger q = n.divide(d);
      final Z zq = zn.divide(zd);
      assertEquals(n + "/" + d + " quotient: " + q, q, zq.bigIntegerValue());
      // check immutability
      assertEquals(d, zd.bigIntegerValue());
      assertEquals(n, zn.bigIntegerValue());
    }
  }

  public void testModLong() {
    try {
      Z.ONE.mod(0L);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertEquals(1L, Z.ONE.mod(5L));
    Z z = new Z("-106292604518414490773807845947441");
    assertEquals(-1065513L, z.mod(2253182L));
    assertEquals(1065513L, z.negate().mod(2253182L));
    z = new Z("30541168220095042431054083918185580287025707013672758859767590438664686395875709254027862430755429328008305210369908893439376470164640508650644520322655105537629487241860458431155257744940102379171095193674166522281075773669409700877600200235788345743973917992548693301386796532256088105621031106137");
    assertEquals(23711027L, z.mod(563898815L));
    assertEquals(23711027L, z.mod(-563898815L));
    z = z.negate();
    assertEquals(-23711027L, z.mod(563898815L));
    assertEquals(-23711027L, z.mod(-563898815L));
    z = new Z("493415792859216289592708390566919213946590390066373503403166451596916681700677551497738888813924837468687619393401829137031416364181549854025704706115151589992555046738068794891612246141889053857165547391653295769208385546311163254532059977896536757136079598303390");
    assertEquals(274356870, z.mod(278641060L));
    z = new Z("223465312562490822560");
    assertEquals(957571700L, z.mod(976885430L));
    assertEquals(162226795L, z.mod(198766157L));
    z = new Z("763210106792267353483183732705366208227978145139630379");
    assertEquals(57208087L, z.mod(81036346L));
    z = new Z("3330836469671163716794760377986233290893470180890985561605050568946286691447313087734861508349208973889788370843100430353148521852904533720803410731744820");
    assertEquals(347160L, z.mod(1556212L));
  }

  public void testBoundaryCases() {
    final Z expected = Z.ONE.shiftLeft(100);
    final Z a = Z.valueOf(Z.BASE).shiftLeft(100);
    assertEquals(expected, Div.divide(a, Z.BASE));
    assertEquals(0, a.auxiliary());
    final Z b = expected.subtract(Z.ONE);
    assertEquals(new Z("1180591620717411303423"), Div.divide(b, Z.BASE));
    assertEquals(Z.BASE - 1, b.auxiliary());
    final Z c = expected.add(1);
    assertEquals(new Z("1180591620717411303424"), Div.divide(c, Z.BASE));
    assertEquals(1, c.auxiliary());
    final Z d = expected.add(Z.BASE - 1);
    assertEquals(new Z("1180591620717411303424"), Div.divide(d, Z.BASE));
    assertEquals(1073741823, d.auxiliary());
    final Z e = expected.add(Z.BASE);
    assertEquals(new Z("1180591620717411303425"), Div.divide(e, Z.BASE));
    assertEquals(0, e.auxiliary());
    final Z f = Z.ONE.shiftLeft(2 * Z.BASE_BITS);
    assertEquals(3, f.getSize());
    final Z g = f.multiply2().add(1);
    assertEquals(3, g.getSize());
    final Z[] h = Div.divideAndRemainder(g, f);
    assertEquals(Z.TWO, h[0]);
    assertEquals(Z.ONE, h[1]);
    final Z i = Z.ONE.shiftLeft(2 * Z.BASE_BITS).add(Z.BASE - 1);
    assertEquals(3, i.getSize());
    final Z j = i.multiply2().add(1);
    final Z[] k = Div.divideAndRemainder(j, i);
    assertEquals(Z.TWO, k[0]);
    assertEquals(Z.ONE, k[1]);
  }

  public void testConstants() {
    assertEquals(Double.doubleToRawLongBits(1.0), Double.doubleToRawLongBits(1.0 + Div.EPSILON / 6.0));
    assertTrue(Double.doubleToRawLongBits(1.0) != Double.doubleToRawLongBits(1.0 + Div.EPSILON / 3.0));
    assertTrue(Div.FUDGE > Z.DBASE);
    assertTrue(Div.FUDGE < Z.DBASE + 1);
  }
}
