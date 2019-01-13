package irvine.math.diophantine;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class OneVariableSolverTest extends TestCase {

  public void test1() {
    final OneVariableSolver s = new OneVariableSolver(Z.THREE, Z.THREE.negate(), -4);
    assertEquals("3x^{-4}-3=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(-4, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(3, s.coefficients().get(0).intValue());
    assertEquals(-3, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertTrue(it.hasNext());
    assertEquals(1, it.next().get(0).intValue());
    assertEquals(-1, it.next().get(0).intValue());
    assertFalse(it.hasNext());
    it = s.iterator();
    assertEquals(1, it.next().size());
    assertTrue(it.hasNext());
    assertEquals(1, it.next().size());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test2() {
    final OneVariableSolver s = new OneVariableSolver(Z.THREE, Z.THREE.negate(), 0);
    assertEquals("3x^{0}-3=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(0, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(3, s.coefficients().get(0).intValue());
    assertEquals(-3, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    for (int k = 1; k < 8; ++k) {
      assertTrue(it.hasNext());
      assertEquals(k, it.next().get(0).intValue());
    }
    assertTrue(it.hasNext());
    it = s.iterator();
    for (int k = 1; k < 8; ++k) {
      assertTrue(it.hasNext());
      assertEquals(1, it.next().size());
    }
    assertTrue(it.hasNext());
  }

  public void test3() {
    final OneVariableSolver s = new OneVariableSolver(Z.TWO, Z.ONE, 1);
    assertEquals("2x+1=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(1, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(2, s.coefficients().get(0).intValue());
    assertEquals(1, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    it = s.iterator();
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test4() {
    final OneVariableSolver s = new OneVariableSolver(Z.TWO, Z.NEG_ONE, -1);
    assertEquals("2x^{-1}-1=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(-1, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(2, s.coefficients().get(0).intValue());
    assertEquals(-1, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertTrue(it.hasNext());
    assertEquals(2, it.next().get(0).intValue());
    assertFalse(it.hasNext());
    it = s.iterator();
    assertEquals(1, it.next().size());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test5() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.ZERO, 2);
    assertEquals("x^{2}=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(2, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(1, s.coefficients().get(0).intValue());
    assertEquals(0, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertTrue(it.hasNext());
    assertEquals(0, it.next().get(0).intValue());
    assertFalse(it.hasNext());
    it = s.iterator();
    assertEquals(1, it.next().size());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test6() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.FOUR.negate(), 2);
    assertEquals("x^{2}-4=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(2, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(1, s.coefficients().get(0).intValue());
    assertEquals(-4, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertTrue(it.hasNext());
    assertEquals(2, it.next().get(0).intValue());
    assertEquals(-2, it.next().get(0).intValue());
    assertFalse(it.hasNext());
    it = s.iterator();
    assertEquals(1, it.next().size());
    assertEquals(1, it.next().size());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test7() {
    assertEquals("-x+1=0", new OneVariableSolver(Z.NEG_ONE, Z.ONE, 1).toString());
  }

  public void test8() {
    final OneVariableSolver s = new OneVariableSolver(Z.ZERO, Z.ONE, 1);
    assertEquals("0x+1=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(1, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(0, s.coefficients().get(0).intValue());
    assertEquals(1, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    assertFalse(it.hasNext());
    it = s.iterator();
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void test9() {
    final OneVariableSolver s = new OneVariableSolver(Z.ZERO, Z.ZERO, 1);
    assertEquals("0x=0", s.toString());
    assertEquals(1, s.powers().size());
    assertEquals(1, s.powers().get(0).intValue());
    assertEquals(2, s.coefficients().size());
    assertEquals(0, s.coefficients().get(0).intValue());
    assertEquals(0, s.coefficients().get(1).intValue());
    Iterator<List<Z>> it = s.iterator();
    for (int k = 1; k < 8; ++k) {
      assertTrue(it.hasNext());
      assertEquals(k, it.next().get(0).intValue());
    }
    assertTrue(it.hasNext());
    it = s.iterator();
    for (int k = 1; k < 8; ++k) {
      assertTrue(it.hasNext());
      assertEquals(1, it.next().size());
    }
    assertTrue(it.hasNext());
  }

  public void test10() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.FOUR, 2);
    assertFalse(s.iterator().hasNext());
  }

  public void test11() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.FOUR, 0);
    assertFalse(s.iterator().hasNext());
  }

  public void test12() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.FOUR.negate(), 2);
    assertTrue(s.iterator().hasNext());
  }

  public void test13() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.THREE.negate(), 2);
    assertFalse(s.iterator().hasNext());
  }

  public void test14() {
    final OneVariableSolver s = new OneVariableSolver(Z.ONE, Z.EIGHT, 3);
    assertTrue(s.iterator().hasNext());
  }

}

