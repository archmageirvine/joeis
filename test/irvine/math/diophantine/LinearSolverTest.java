package irvine.math.diophantine;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LinearSolverTest extends TestCase {

  public void testNoSolution1() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.TWO, Z.TWO);
    final Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    assertEquals("2x_1+2x_2+3=0", s.toString());
  }

  public void testNoSolution2() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.FIVE, Z.valueOf(35), Z.valueOf(55));
    final Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void testBadArgs() {
    try {
      new LinearSolver(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LinearSolver(Z.TWO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      new LinearSolver(Z.TWO, (Z[]) null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LinearSolver(Z.TWO, Z.TWO, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LinearSolver(Z.TWO, null, Z.TWO);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new LinearSolver(Z.TWO, Z.TWO, Z.ZERO);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void test1TermA() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.TWO);
    final Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    assertEquals("2x_1+3=0", s.toString());
    assertEquals(1, s.powers().size());
    for (final Z w : s.powers()) {
      assertEquals(Z.ONE, w);
    }
    assertEquals(2, s.coefficients().size());
    assertEquals(2, s.coefficients().get(0).intValue());
    assertEquals(3, s.coefficients().get(1).intValue());
  }

  public void test1TermB() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.THREE);
    final Iterator<List<Z>> it = s.iterator();
    assertTrue(it.hasNext());
    final List<Z> r = it.next();
    assertEquals(1, r.size());
    assertEquals(-1, r.get(0).intValue());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    assertEquals("3x_1+3=0", s.toString());
    assertEquals(1, s.powers().size());
    for (final Z w : s.powers()) {
      assertEquals(Z.ONE, w);
    }
  }

  public void test2TermA() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.THREE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-3, r.get(0).longValue() * 3 + r.get(1).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+7x_2+3=0", s.toString());
    assertEquals(2, s.powers().size());
    for (final Z w : s.powers()) {
      assertEquals(Z.ONE, w);
    }
    assertEquals(3, s.coefficients().size());
    assertEquals(3, s.coefficients().get(0).intValue());
    assertEquals(7, s.coefficients().get(1).intValue());
    assertEquals(3, s.coefficients().get(2).intValue());
  }

  public void test2TermB() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.THREE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() * 3 + r.get(1).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+7x_2+1=0", s.toString());
  }

  public void test2TermC() {
    final LinearSolver s = new LinearSolver(Z.NEG_ONE, Z.THREE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(1, r.get(0).longValue() * 3 + r.get(1).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+7x_2-1=0", s.toString());
  }

  public void test2TermD() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.THREE.negate(), Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() * -3 + r.get(1).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("-3x_1+7x_2+1=0", s.toString());
  }

  public void test2TermE() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.THREE, Z.valueOf(-7));
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() * 3 + r.get(1).longValue() * -7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1-7x_2+1=0", s.toString());
  }

  public void test2TermF() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.ONE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() + r.get(1).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("x_1+7x_2+1=0", s.toString());
  }

  public void test2TermG() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.ONE, Z.ONE);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() + r.get(1).longValue());
      ++k;
    }
    assertEquals(10, k);
    assertEquals("x_1+x_2+1=0", s.toString());
  }

  public void test2TermH() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.ONE, Z.NEG_ONE);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-1, r.get(0).longValue() - r.get(1).longValue());
      ++k;
    }
    assertEquals(10, k);
    assertEquals("x_1-x_2+1=0", s.toString());
  }

  public void test2TermI() {
    final LinearSolver s = new LinearSolver(Z.THREE, Z.THREE, Z.SIX);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(-3, 3 * r.get(0).longValue() + 6 * r.get(1).longValue());
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+6x_2+3=0", s.toString());
  }

  public void test2Termj() {
    final LinearSolver s = new LinearSolver(Z.ZERO, Z.THREE, Z.SIX);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(2, r.size());
      assertEquals(0, 3 * r.get(0).longValue() + 6 * r.get(1).longValue());
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+6x_2=0", s.toString());
  }

  public void test3TermA() {
    final LinearSolver s = new LinearSolver(Z.ONE, Z.THREE, Z.FIVE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(3, r.size());
      assertEquals(-1, r.get(0).longValue() * 3 + r.get(1).longValue() * 5 + r.get(2).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+5x_2+7x_3+1=0", s.toString());
  }

  public void test3TermB() {
    final LinearSolver s = new LinearSolver(Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(3, r.size());
      assertEquals(-2, r.get(0).longValue() * 3 + r.get(1).longValue() * 5 + r.get(2).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+5x_2+7x_3+2=0", s.toString());
  }

  public void test3TermC() {
    final LinearSolver s = new LinearSolver(Z.TWO.negate(), Z.THREE, Z.FIVE, Z.SEVEN);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(3, r.size());
      assertEquals(2, r.get(0).longValue() * 3 + r.get(1).longValue() * 5 + r.get(2).longValue() * 7);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+5x_2+7x_3-2=0", s.toString());
  }

  public void test3TermD() {
    final LinearSolver s = new LinearSolver(Z.THREE.negate(), Z.THREE, Z.SIX, Z.valueOf(21));
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(3, r.size());
      //      System.out.println(r.get(0) + " " + r.get(1) + " " + r.get(2));
      assertEquals(3, r.get(0).longValue() * 3 + r.get(1).longValue() * 6 + r.get(2).longValue() * 21);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+6x_2+21x_3-3=0", s.toString());
    assertEquals(3, s.powers().size());
    for (final Z w : s.powers()) {
      assertEquals(Z.ONE, w);
    }
  }

  public void test3TermE() {
    final LinearSolver s = new LinearSolver(Z.NEG_ONE, Z.THREE, Z.SIX, Z.valueOf(21));
    final Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    assertEquals("3x_1+6x_2+21x_3-1=0", s.toString());
  }

  public void test3TermF() {
    final LinearSolver s = new LinearSolver(Z.valueOf(63), Z.THREE, Z.SIX, Z.valueOf(21));
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(3, r.size());
      //      System.out.println(r.get(0) + " " + r.get(1) + " " + r.get(2));
      assertEquals(-63, r.get(0).longValue() * 3 + r.get(1).longValue() * 6 + r.get(2).longValue() * 21);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("3x_1+6x_2+21x_3+63=0", s.toString());
  }

  public void test10TermA() {
    final LinearSolver s = new LinearSolver(Z.THREE.negate(), Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE, Z.ONE);
    final Iterator<List<Z>> it = s.iterator();
    int k = 0;
    while (k < 10 && it.hasNext()) {
      final List<Z> r = it.next();
      assertEquals(10, r.size());
      long v = 0;
      for (final Z z : r) {
        v += z.longValue();
      }
      assertEquals(3, v);
      ++k;
    }
    assertEquals(10, k);
    assertEquals("x_1+x_2+x_3+x_4+x_5+x_6+x_7+x_8+x_9+x_{10}-3=0", s.toString());
    assertEquals(10, s.powers().size());
    for (final Z w : s.powers()) {
      assertEquals(Z.ONE, w);
    }
  }

  public void testRandom1(final int terms) {
    final Random rnd = new Random();
    for (int i = 0; i < 10; ++i) {
      final Z[] t = new Z[1 + rnd.nextInt(30)];
      for (int k = 0; k < t.length; ++k) {
        t[k] = Z.valueOf(rnd.nextLong());
      }
      final LinearSolver s = new LinearSolver(Z.NEG_ONE, t);
      final Iterator<List<Z>> it = s.iterator();
      int k = 0;
      while (k < 10 && it.hasNext()) {
        final List<Z> r = it.next();
        assertEquals(10, r.size());
        Z v = Z.ZERO;
        for (final Z z : r) {
          v = v.add(z);
        }
        assertEquals(Z.ONE, v);
        ++k;
      }
    }
  }

  public void testRandom0(final int terms) {
    final Random rnd = new Random();
    for (int i = 0; i < 10; ++i) {
      final Z[] t = new Z[1 + rnd.nextInt(30)];
      for (int k = 0; k < t.length; ++k) {
        t[k] = Z.valueOf(rnd.nextLong());
      }
      final LinearSolver s = new LinearSolver(Z.ZERO, t);
      final Iterator<List<Z>> it = s.iterator();
      int k = 0;
      while (k < 10 && it.hasNext()) {
        final List<Z> r = it.next();
        assertEquals(10, r.size());
        Z v = Z.ZERO;
        for (final Z z : r) {
          v = v.add(z);
        }
        assertEquals(Z.ZERO, v);
        ++k;
      }
    }
  }
}
