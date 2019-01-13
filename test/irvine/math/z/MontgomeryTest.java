package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MontgomeryTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testCons() {
    try {
      new Montgomery(null);
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new Montgomery(Z.ZERO);
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      new Montgomery(Z.TWO);
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      new Montgomery(Z.NEG_ONE);
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  private Montgomery getMontgomery(final int i) {
    return new Montgomery(Z.valueOf(new BigInteger(i, RANDOM)).add(1).setBit(0));
  }

  public void testSpecific() {
    final Montgomery m = new Montgomery(Z.valueOf(5000011));
    assertEquals(3865929, m.toMontgomery(Z.valueOf(5000000)).intValue());
  }

  public void testMapping() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM));
      final Z am = a.mod(n);
      assertEquals(am, m.toZ(m.toMontgomery(am)));
      assertEquals(am, m.toZ(m.toMontgomery(a)));
      final Z na = am.negate();
      assertEquals(na.mod(n), m.toZ(m.toMontgomery(na)));
    }
  }

  public void testAdd() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      assertEquals(a.add(b).mod(n), m.toZ(m.add(m.toMontgomery(a), m.toMontgomery(b))));
    }
  }

  public void testSubtract() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      assertEquals(a.subtract(b).mod(n), m.toZ(m.subtract(m.toMontgomery(a), m.toMontgomery(b))));
    }
  }

  public void testMultiply() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      assertEquals(a.multiply(b).mod(n), m.toZ(m.multiply(m.toMontgomery(a), m.toMontgomery(b))));
    }
  }

  public void testMultiplyLong() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      final long b = RANDOM.nextLong();
      assertEquals(a.multiply(b).mod(n), m.toZ(m.multiply(m.toMontgomery(a), b)));
    }
  }

  public void testSquare() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      assertEquals(a.square().mod(n), m.toZ(m.square(m.toMontgomery(a))));
    }
  }

  public void testDivide() {
    for (int i = 2; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      if (!Z.ZERO.equals(b)) {
        final Z ib = b.modInverse(n);
        if (b.auxiliary() == 0) {
          final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
          final Z md = m.divide(m.toMontgomery(a), m.toMontgomery(b));
          assertEquals(a.multiply(ib).mod(n), m.toZ(md));
        }
      }
    }
  }

  public void testInverse() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      try {
        m.inverse(Z.ZERO);
        fail();
      } catch (final ArithmeticException e) {
        // ok
      }
      final Z n = m.getModulus();
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      if (!Z.ZERO.equals(a)) {
        final Z inv = a.modInverse(n);
        if (a.auxiliary() == 0) {
          assertEquals(inv, m.toZ(m.inverse(m.toMontgomery(a))));
        } else {
          try {
            m.inverse(m.toMontgomery(a));
            fail();
          } catch (final ArithmeticException e) {
            // ok
          }
        }
      }
    }
  }

  public void testPow() {
    for (int i = 1; i < 100; ++i) {
      final Montgomery m = getMontgomery(i);
      final Z n = m.getModulus();
      if (Z.ONE.equals(n)) {
        continue;
      }
      final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      final Z ma = m.toMontgomery(a);
      final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
      assertEquals(a.modPow(b, n), m.toZ(m.pow(ma, b)));
      final Z nb = b.negate();
      try {
        final Z s = a.modPow(nb, n);
        try {
          final Z t = m.toZ(m.pow(ma, nb));
          assertEquals(a + "^" + nb + "%" + n, s, t);
        } catch (final ArithmeticException ex) {
          fail("std worked but montgomery failed");
        }
      } catch (final ArithmeticException e) {
        try {
          m.pow(ma, nb);
          fail("std failed but montgomery worked");
        } catch (final ArithmeticException ex) {
          // ok
        }
      }
    }
  }

}
