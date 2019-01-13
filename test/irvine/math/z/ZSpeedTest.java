package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the speed of the Z class.
 *
 * @author Sean A. Irvine
 */
public class ZSpeedTest extends TestCase {

  /** True to include speed testing. -- runs rather slow if on. */
  private static final boolean SPEED = false;

  private static final Random RANDOM = new Random();


  public void testBitLengthSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;
      int total1 = 0;
      int total2 = 0;
      for (long i = 0L; i < 500000L; i += 3L) {
        final Z z = Z.valueOf(i);
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 10; ++j) {
          total2 += z.bitLength();
        }
        delta2 += System.currentTimeMillis() - t;
        final BigInteger v = BigInteger.valueOf(i);
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 10; ++j) {
          total1 += v.bitLength();
        }
        delta1 += System.currentTimeMillis() - s;
      }
      for (long i = 0L; i < 500000L; i += 3L) {
        final BigInteger v = BigInteger.valueOf(i);
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 10; ++j) {
          total1 += v.bitLength();
        }
        delta1 += System.currentTimeMillis() - s;
        final Z z = Z.valueOf(i);
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 10; ++j) {
          total2 += z.bitLength();
        }
        delta2 += System.currentTimeMillis() - t;
      }
      assertEquals(total1, total2);
      // allow our bitLength to be slightly slower than BigInteger's
      assertTrue("bitLength was slow: Z: " + delta2 + " BI: " + delta1, delta1 > delta2 * 2 / 3);
    }
  }

  public void testBitCountSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;
      int total1 = 0;
      int total2 = 0;
      for (long i = 0L; i < 10000000L; i += 17L) {
        final Z z = Z.valueOf(i);
        final long t = System.currentTimeMillis();
        total2 += z.bitCount();
        total2 += z.negate().bitCount();
        delta2 += System.currentTimeMillis() - t;
        final BigInteger v = BigInteger.valueOf(i);
        final long s = System.currentTimeMillis();
        total1 += v.bitCount();
        total1 += v.negate().bitCount();
        delta1 += System.currentTimeMillis() - s;
      }
      for (long i = 0L; i < 10000000L; i += 17L) {
        final BigInteger v = BigInteger.valueOf(i);
        final long s = System.currentTimeMillis();
        total1 += v.bitCount();
        total1 += v.negate().bitCount();
        delta1 += System.currentTimeMillis() - s;
        final Z z = Z.valueOf(i);
        final long t = System.currentTimeMillis();
        total2 += z.bitCount();
        total2 += z.negate().bitCount();
        delta2 += System.currentTimeMillis() - t;
      }
      assertEquals(total1, total2);
      // allow our bitCount to be slightly slower than BigInteger's
      assertTrue("bitCount was slow: Z: " + delta2 + " BI: " + delta1, delta1 > delta2 * 2 / 3);
    }
  }

  public void testAddSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;
      for (int i = 30; i < 3000; ++i) {
        BigInteger sum1 = BigInteger.ZERO;
        Z sum2 = Z.ZERO;
        final BigInteger v1 = new BigInteger(i, RANDOM);
        final Z v2 = Z.valueOf(v1);
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum1 = sum1.add(v1);
        }
        delta1 += System.currentTimeMillis() - t;
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum2 = sum2.add(v2);
        }
        delta2 += System.currentTimeMillis() - s;
        assertEquals(sum1, sum2.bigIntegerValue());
      }
      for (int i = 30; i < 3000; ++i) {
        BigInteger sum1 = BigInteger.ZERO;
        Z sum2 = Z.ZERO;
        final BigInteger v1 = new BigInteger(i, RANDOM);
        final Z v2 = Z.valueOf(v1);
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum2 = sum2.add(v2);
        }
        delta2 += System.currentTimeMillis() - s;
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum1 = sum1.add(v1);
        }
        delta1 += System.currentTimeMillis() - t;
        assertEquals(sum1, sum2.bigIntegerValue());
      }
      // our add should be about the same speed as BigInteger's
      assertTrue("slow add Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }

  public void testSubtractSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;
      for (int i = 30; i < 5000; ++i) {
        BigInteger sum1 = BigInteger.ZERO;
        Z sum2 = Z.ZERO;
        final BigInteger v1 = new BigInteger(i, RANDOM);
        final Z v2 = Z.valueOf(v1);
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum1 = sum1.subtract(v1);
        }
        delta1 += System.currentTimeMillis() - t;
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum2 = sum2.subtract(v2);
        }
        delta2 += System.currentTimeMillis() - s;
        assertEquals(sum1, sum2.bigIntegerValue());
      }
      for (int i = 30; i < 5000; ++i) {
        BigInteger sum1 = BigInteger.ZERO;
        Z sum2 = Z.ZERO;
        final BigInteger v1 = new BigInteger(i, RANDOM);
        final Z v2 = Z.valueOf(v1);
        final long s = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum2 = sum2.subtract(v2);
        }
        delta2 += System.currentTimeMillis() - s;
        final long t = System.currentTimeMillis();
        for (int j = 0; j < 100; ++j) {
          sum1 = sum1.subtract(v1);
        }
        delta1 += System.currentTimeMillis() - t;
        assertEquals(sum1, sum2.bigIntegerValue());
      }
      // our subtract should be about the same speed as BigInteger's
      assertTrue("slow subtract Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }

  public void testDivisionSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;

      BigInteger sumq = BigInteger.ZERO;
      BigInteger sumr = BigInteger.ZERO;
      Z zsumq = Z.ZERO;
      Z zsumr = Z.ZERO;

      for (int i = 30; i < 100000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i / 3, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger[] r = n.divideAndRemainder(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r[0]);
          sumr = sumr.add(r[1]);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z[] r = zn.divideAndRemainder(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r[0]);
          zsumr = zsumr.add(r[1]);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      assertEquals(sumr, zsumr.bigIntegerValue());
      for (int i = 30; i < 10000; i += 7) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i / 3, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z[] r = zn.divideAndRemainder(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r[0]);
          zsumr = zsumr.add(r[1]);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger[] r = n.divideAndRemainder(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r[0]);
          sumr = sumr.add(r[1]);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      assertEquals(sumr, zsumr.bigIntegerValue());
      for (int i = 30; i < 100000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger[] r = n.divideAndRemainder(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r[0]);
          sumr = sumr.add(r[1]);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z[] r = zn.divideAndRemainder(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r[0]);
          zsumr = zsumr.add(r[1]);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      assertEquals(sumr, zsumr.bigIntegerValue());
      for (int i = 30; i < 100000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z[] r = zn.divideAndRemainder(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r[0]);
          zsumr = zsumr.add(r[1]);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger[] r = n.divideAndRemainder(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r[0]);
          sumr = sumr.add(r[1]);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      assertEquals(sumr, zsumr.bigIntegerValue());
      System.err.println("DivZ: " + delta2 + " BI: " + delta1);
      assertTrue("slow division Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }

  public void testMultiplicationSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;

      BigInteger sumq = BigInteger.ZERO;
      Z zsumq = Z.ZERO;

      for (int i = 30; i < 20000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i / 3, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.multiply(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.multiply(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 2000; i += 7) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i / 3, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.multiply(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.multiply(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 20000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.multiply(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.multiply(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 20000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.multiply(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.multiply(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      System.err.println("MulZ: " + delta2 + " BI: " + delta1);
      assertTrue("slow multiply Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }

  public void testModSpeed() {
    if (SPEED) {
      System.err.println("Starting mod speed test");
      long delta1 = 0L;
      long delta2 = 0L;

      BigInteger sumq = BigInteger.ZERO;
      Z zsumq = Z.ZERO;

      for (int i = 30; i < 100000; i += 700) {
        final BigInteger d = new BigInteger(i / 3, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.mod(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.mod(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 10000; i += 70) {
        final BigInteger d = new BigInteger(i / 3, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.mod(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.mod(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 10000; i += 70) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.mod(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.mod(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 100000; i += 700) {
        final BigInteger d = new BigInteger(i, RANDOM);
        if (d.equals(BigInteger.ZERO)) {
          continue;
        }
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zd = Z.valueOf(d);
        final Z zn = Z.valueOf(n);
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.mod(zd);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.mod(d);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      System.err.println("ModZ: " + delta2 + " BI: " + delta1);
      assertTrue("slow mod Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }

  public void testPowSpeed() {
    if (SPEED) {
      long delta1 = 0L;
      long delta2 = 0L;

      BigInteger sumq = BigInteger.ZERO;
      Z zsumq = Z.ZERO;

      for (int i = 30; i < 200; i += 7) {
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zn = Z.valueOf(n);
        final int ex = RANDOM.nextInt() & 0x3FF;
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.pow(ex);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.pow(ex);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      for (int i = 30; i < 200; i += 7) {
        final BigInteger n = new BigInteger(i, RANDOM);
        final Z zn = Z.valueOf(n);
        final int ex = RANDOM.nextInt() & 0x3FF;
        for (int j = 0; j < 10; ++j) {
          final long s = System.currentTimeMillis();
          final Z r = zn.pow(ex);
          delta2 += System.currentTimeMillis() - s;
          zsumq = zsumq.add(r);
        }
        for (int j = 0; j < 10; ++j) {
          final long t = System.currentTimeMillis();
          final BigInteger r = n.pow(ex);
          delta1 += System.currentTimeMillis() - t;
          sumq = sumq.add(r);
        }
      }
      assertEquals(sumq, zsumq.bigIntegerValue());
      System.err.println("PowZ: " + delta2 + " BI: " + delta1);
      assertTrue("slow pow Z: " + delta2 + " BI: " + delta1, delta2 <= delta1 * 4 / 3);
    }
  }
}
