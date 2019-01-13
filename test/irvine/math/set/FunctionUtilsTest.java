package irvine.math.set;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FunctionUtilsTest extends TestCase {

  public void testInfinities() {
    assertNull(FunctionUtils.numberFunctions((Z) null, null));
    assertNull(FunctionUtils.numberFunctions(Z.ONE, null));
    assertNull(FunctionUtils.numberFunctions(null, Z.TWO));
    assertEquals(Z.ONE, FunctionUtils.numberFunctions(Z.ZERO, null));
    assertEquals(Z.ONE, FunctionUtils.numberFunctions(null, Z.ONE));
    assertNull(FunctionUtils.numberOntoFunctions((Z) null, null));
    assertNull(FunctionUtils.numberOntoFunctions(null, Z.TWO));
    assertEquals(Z.ONE, FunctionUtils.numberOntoFunctions(null, Z.ONE));
    assertNull(FunctionUtils.numberOneToOneFunctions((Z) null, null));
    assertEquals(Z.ZERO, FunctionUtils.numberOneToOneFunctions(Z.FOUR, Z.THREE));
    assertNull(FunctionUtils.numberOneToOneFunctions(Z.TWO, null));
    assertEquals(Z.ONE, FunctionUtils.numberOneToOneFunctions(Z.ZERO, null));
    final Z mu = Z.valueOf((1L << 31) + 1);
    try {
      FunctionUtils.numberOntoFunctions(Z.valueOf(1L << 35), mu);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    try {
      FunctionUtils.numberOntoFunctions(Z.valueOf(1L << 62).shiftLeft(1), Z.TWO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      FunctionUtils.numberOneToOneFunctions(mu, mu);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
  }

  public void testDurbin1p3() {
    final FiniteSet<String> s = new FiniteSet<>("x", "y", "z");
    final FiniteSet<Integer> t = new FiniteSet<>(1, 2, 3);
    assertEquals(Z.valueOf(27), FunctionUtils.numberFunctions(s, t));
    assertEquals(Z.SIX, FunctionUtils.numberOntoFunctions(s, t));
    assertEquals(Z.SIX, FunctionUtils.numberOneToOneFunctions(s, t));
    assertEquals(Z.EIGHT, FunctionUtils.numberFunctions(s, new FiniteSet<>(1, 2)));
  }

  public void testOneToOne() {
    assertEquals(Z.valueOf(360), FunctionUtils.numberOneToOneFunctions(Z.FOUR, Z.SIX));
  }

  public void testDurbin3p21() {
    assertEquals(Z.ONE, FunctionUtils.numberBinaryOperations(Z.ONE));
    assertEquals(Z.valueOf(16), FunctionUtils.numberBinaryOperations(Z.TWO));
    assertEquals(Z.valueOf(16), FunctionUtils.numberBinaryOperations(new FiniteSet<>(1, 2)));
    assertEquals(Z.valueOf(19683), FunctionUtils.numberBinaryOperations(Z.THREE));
    assertEquals(null, FunctionUtils.numberBinaryOperations((Z) null));
  }

  public void testDurbin3p22() {
    assertEquals(Z.ONE, FunctionUtils.numberCommutativeBinaryOperations(Z.ONE));
    assertEquals(Z.EIGHT, FunctionUtils.numberCommutativeBinaryOperations(Z.TWO));
    assertEquals(Z.EIGHT, FunctionUtils.numberCommutativeBinaryOperations(new FiniteSet<>(1, 2)));
    assertEquals(Z.valueOf(729), FunctionUtils.numberCommutativeBinaryOperations(Z.THREE));
    assertEquals(null, FunctionUtils.numberCommutativeBinaryOperations((Z) null));
  }

  public void testDurbin6p14() {
    assertEquals(new Z("10314424798490535546171949056"), FunctionUtils.numberBinaryOperations(new FiniteSet<>("u", "v", "w", "x", "y", "z")));
    assertEquals(Z.valueOf(243), FunctionUtils.numberBinaryOperationsWithIdentity(Z.THREE));
    assertEquals(null, FunctionUtils.numberBinaryOperationsWithIdentity((Z) null));
    assertEquals(new Z("170581728179578208256"), FunctionUtils.numberBinaryOperationsWithIdentity(new FiniteSet<>("u", "v", "w", "x", "y", "z")));
  }

  public void testDurbin9p9() {
    assertEquals(Z.FIVE, FunctionUtils.numberEquivalenceRelations(new FiniteSet<>("x", "y", "z")));
    assertEquals(Z.FIVE, FunctionUtils.numberEquivalenceRelations(Z.THREE));
    assertEquals(Z.valueOf(15), FunctionUtils.numberEquivalenceRelations(Z.FOUR));
    assertEquals(null, FunctionUtils.numberEquivalenceRelations((Z) null));
  }
}
