package irvine.factor.util;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FactorSequenceTest extends TestCase {

  /** Local new line convention */
  private static final String LS = System.lineSeparator();

  public void testEmpty() {
    final FactorSequence fs = new FactorSequence();
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(0, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ZERO);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(0, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(0, fs.getExponent(Z.ONE));
    assertEquals(0, fs.maxExponent());
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    assertEquals("", fs.toString());
  }

  public void testAdd() {
    final FactorSequence fs = new FactorSequence();
    fs.add(Z.ONE, FactorSequence.UNKNOWN, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.COMPOSITE, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.PRIME, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.PROB_PRIME, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.COMPOSITE, 3);
    assertEquals(1, fs.omega());
    assertEquals(3, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.UNKNOWN);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.COMPOSITE);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE, FactorSequence.PRIME);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    fs.add(1L, FactorSequence.UNKNOWN, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.COMPOSITE, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.PRIME, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.PROB_PRIME, 1);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.COMPOSITE, 3);
    assertEquals(1, fs.omega());
    assertEquals(3, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.UNKNOWN);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.COMPOSITE);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.PRIME);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L, FactorSequence.PROB_PRIME);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(1L);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
    fs.add(Z.ONE);
    assertEquals(1, fs.omega());
    assertEquals(1, fs.getExponent(Z.ONE));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ONE));
    fs.remove(Z.ONE);
    assertEquals(0, fs.omega());
    assertEquals(0, fs.getExponent(Z.ZERO));
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(Z.ZERO));
  }

  public void testAddLots() {
    final FactorSequence fs = new FactorSequence();
    for (int i = 1; i < 500; ++i) {
      fs.add((long) i);
      assertEquals(i, fs.omega());
      if (i == 5) {
        assertEquals("1" + LS + "2" + LS + "3" + LS + "4" + LS + "5" + LS, fs.toString());
      }
    }
  }

  public void testAddLotsTS() {
    final FactorSequence fs = new FactorSequence();
    for (int i = 1; i <= 5; ++i) {
      fs.add((long) i, FactorSequence.PRIME);
    }
    assertEquals("<1>" + LS + "<2>" + LS + "<3>" + LS + "<4>" + LS + "<5>" + LS, fs.toString());
    assertEquals(1, fs.maxExponent());
  }

  public void testExponentCollation() {
    final FactorSequence fs = new FactorSequence();
    for (int i = 1, j = 1; i < 500; ++i, j += i) {
      fs.add(1L, FactorSequence.UNKNOWN, i);
      assertEquals(1, fs.omega());
      assertEquals(j, fs.getExponent(Z.ONE));
    }
  }

  public void testToZs() {
    final FactorSequence fs = new FactorSequence();
    for (int i = 1; i < 50; ++i) {
      fs.add((long) i);
      assertEquals(i, fs.omega());
      assertEquals(i, fs.toZArray().length);
    }
  }

  public void testConstants() {
    assertEquals(0, FactorSequence.UNKNOWN);
    assertEquals(1, FactorSequence.COMPOSITE);
    assertEquals(2, FactorSequence.PRIME);
    assertEquals(3, FactorSequence.PROB_PRIME);
  }

  private static final Z TWENTY = Z.valueOf(20);

  public void testUpgrades1() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PRIME, 2);
    fs.add(20, FactorSequence.PROB_PRIME, 3);
    assertEquals(FactorSequence.PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>" + LS, fs.toString());
  }

  public void testUpgrades2() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PROB_PRIME, 3);
    assertEquals("<20^3>#" + LS, fs.toString());
    fs.add(20, FactorSequence.PRIME, 2);
    assertEquals(FactorSequence.PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>" + LS, fs.toString());
  }

  public void testUpgrades3() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.UNKNOWN, 2);
    assertEquals("20^2" + LS, fs.toString());
    fs.add(20, FactorSequence.COMPOSITE, 3);
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("[20^5]" + LS, fs.toString());
  }

  public void testUpgrades4() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.COMPOSITE, 3);
    fs.add(20, FactorSequence.UNKNOWN, 2);
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("[20^5]" + LS, fs.toString());
  }

  public void testUpgrades5() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PRIME, 2);
    fs.add(20, FactorSequence.COMPOSITE, 3);
    assertEquals(FactorSequence.PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>" + LS, fs.toString());
  }

  public void testUpgrades6() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PRIME, 2);
    fs.add(20, FactorSequence.UNKNOWN, 3);
    assertEquals(FactorSequence.PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>" + LS, fs.toString());
  }

  public void testUpgrades7() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PROB_PRIME, 2);
    fs.add(20, FactorSequence.COMPOSITE, 3);
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>#" + LS, fs.toString());
  }

  public void testUpgrades8() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PROB_PRIME, 2);
    fs.add(20, FactorSequence.UNKNOWN, 3);
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>#" + LS, fs.toString());
  }

  public void testUpgrades9() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.PROB_PRIME, 2);
    fs.add(20, FactorSequence.PROB_PRIME, 3);
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>#" + LS, fs.toString());
  }

  public void testUpgradesA() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.COMPOSITE, 2);
    fs.add(20, FactorSequence.COMPOSITE, 3);
    assertEquals(FactorSequence.COMPOSITE, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("[20^5]" + LS, fs.toString());
  }

  public void testUpgradesB() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.UNKNOWN, 2);
    fs.add(20, FactorSequence.UNKNOWN, 3);
    assertEquals(FactorSequence.UNKNOWN, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("20^5" + LS, fs.toString());
  }

  public void testUpgradesC() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.COMPOSITE, 2);
    fs.add(20, FactorSequence.PROB_PRIME, 3);
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>#" + LS, fs.toString());
  }

  public void testUpgradesD() {
    final FactorSequence fs = new FactorSequence();
    fs.add(20, FactorSequence.UNKNOWN, 2);
    fs.add(20, FactorSequence.PROB_PRIME, 3);
    assertEquals(FactorSequence.PROB_PRIME, fs.getStatus(TWENTY));
    assertEquals(5, fs.getExponent(TWENTY));
    assertEquals("<20^5>#" + LS, fs.toString());
  }

  public void testNegativeOneHandling() {
    final Z no = Z.NEG_ONE;
    final FactorSequence fs = new FactorSequence();
    fs.add(-1, FactorSequence.PRIME, 1);
    assertEquals("<-1>" + LS, fs.toString());
    assertEquals(1, fs.getExponent(Z.NEG_ONE));
    // now cancel it out
    fs.add(-1, FactorSequence.PRIME, 1);
    assertEquals(0, fs.getExponent(Z.NEG_ONE));
    assertEquals(0, fs.omega());

    for (int i = 0; i < 10; i += 2) {
      fs.add(no, FactorSequence.PRIME, i);
      assertEquals(0, fs.omega());
      assertEquals(0, fs.getExponent(no));
      fs.remove(no);
    }
    for (int i = 1; i < 10; i += 2) {
      fs.add(no, FactorSequence.PRIME, i);
      assertEquals(1, fs.omega());
      assertEquals(1, fs.getExponent(no));
      fs.remove(no);
    }
  }

  public void testDivisors() {
    final FactorSequence fs = new FactorSequence();
    assertEquals(1, fs.divisors().length);
    fs.add(2, FactorSequence.PRIME);
    Z[] d = fs.divisors();
    assertEquals(2, d.length);
    assertEquals(Z.ONE, d[0]);
    assertEquals(Z.TWO, d[1]);
    fs.add(2, FactorSequence.PRIME);
    d = fs.divisors();
    assertEquals(3, d.length);
    assertEquals(Z.ONE, d[0]);
    assertEquals(Z.TWO, d[1]);
    assertEquals(Z.FOUR, d[2]);
    fs.add(3, FactorSequence.PRIME);
    d = fs.divisors();
    assertEquals(6, d.length);
    Arrays.sort(d);
    assertEquals(Z.ONE, d[0]);
    assertEquals(Z.TWO, d[1]);
    assertEquals(Z.THREE, d[2]);
    assertEquals(Z.FOUR, d[3]);
    assertEquals(Z.SIX, d[4]);
    assertEquals(Z.valueOf(12), d[5]);
    fs.remove(Z.TWO);
    fs.add(3, FactorSequence.PRIME);
    fs.add(3, FactorSequence.PRIME);
    d = fs.divisors();
    assertEquals(4, d.length);
    Arrays.sort(d);
    assertEquals(Z.ONE, d[0]);
    assertEquals(Z.THREE, d[1]);
    assertEquals(Z.NINE, d[2]);
    assertEquals(Z.valueOf(27), d[3]);
    fs.add(5, FactorSequence.PRIME);
    fs.add(5, FactorSequence.PRIME);
    fs.add(7, FactorSequence.PRIME);
    d = fs.divisors();
    assertEquals(24, d.length);
    Arrays.sort(d);
    assertEquals(Z.ONE, d[0]);
    assertEquals(Z.THREE, d[1]);
    assertEquals(Z.FIVE, d[2]);
    assertEquals(Z.SEVEN, d[3]);
    assertEquals(Z.NINE, d[4]);
    assertEquals(Z.valueOf(15), d[5]);
    assertEquals(Z.valueOf(21), d[6]);
    assertEquals(Z.valueOf(25), d[7]);
    assertEquals(Z.valueOf(27), d[8]);
    assertEquals(Z.valueOf(35), d[9]);
    assertEquals(Z.valueOf(45), d[10]);
    assertEquals(Z.valueOf(63), d[11]);
    assertEquals(Z.valueOf(75), d[12]);
    assertEquals(Z.valueOf(105), d[13]);
    assertEquals(Z.valueOf(135), d[14]);
    assertEquals(Z.valueOf(175), d[15]);
    assertEquals(Z.valueOf(189), d[16]);
    assertEquals(Z.valueOf(225), d[17]);
    assertEquals(Z.valueOf(315), d[18]);
    assertEquals(Z.valueOf(525), d[19]);
    assertEquals(Z.valueOf(675), d[20]);
    assertEquals(Z.valueOf(945), d[21]);
    assertEquals(Z.valueOf(1575), d[22]);
    assertEquals(Z.valueOf(4725), d[23]);
    fs.add(2, FactorSequence.PRIME, Integer.MAX_VALUE);
    try {
      fs.divisors();
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    fs.remove(Z.TWO);
    fs.add(2, FactorSequence.PRIME, Integer.MAX_VALUE >> 2);
    try {
      fs.divisors();
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  public void testDivisors2() {
    final FactorSequence fs = new FactorSequence();
    fs.add(2, FactorSequence.PRIME, 300);
    fs.add(3, FactorSequence.PRIME, 50);
    final Z[] d = fs.divisors();
    assertEquals(15351, d.length);
    for (final Z aD : d) {
      Z o = aD.makeOdd();
      assertTrue(aD.auxiliary() <= 300);
      int q = 0;
      while (o.mod(3) == 0) {
        o = o.divide(3);
        ++q;
      }
      assertEquals(Z.ONE, o);
      assertTrue(q <= 50);
    }
  }

  public void testMerge() {
    final FactorSequence fs = new FactorSequence();
    fs.add(2, FactorSequence.PRIME, 300);
    fs.add(3, FactorSequence.PRIME, 50);
    assertTrue(fs.isComplete());
    fs.merge(null);
    fs.merge(fs);
    assertEquals(600, fs.getExponent(Z.TWO));
    assertEquals(100, fs.getExponent(Z.THREE));
    assertEquals(FactorSequence.PRIME, fs.getStatus(Z.TWO));
    fs.add(7, FactorSequence.PROB_PRIME);
    assertTrue(fs.isComplete());
    fs.add(9, FactorSequence.COMPOSITE);
    assertFalse(fs.isComplete());
  }

  public void testCons2() {
    final FactorSequence fs = new FactorSequence(2);
    assertEquals(1, fs.omega());
  }

  public void testCons3() {
    final FactorSequence fs = new FactorSequence(Z.TWO);
    assertEquals(1, fs.omega());
  }

  public void testLambda() {
    final PrimeDivision f = new PrimeDivision(100);
    assertEquals(1, f.factorize(Z.ONE).lambda());
    assertEquals(-1, f.factorize(Z.TWO).lambda());
    assertEquals(-1, f.factorize(Z.THREE).lambda());
    assertEquals(1, f.factorize(Z.FOUR).lambda());
  }
}
