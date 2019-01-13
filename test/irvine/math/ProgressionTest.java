package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ProgressionTest extends TestCase {

  public void testAP() {
    assertFalse(Progression.isArithmeticProgression(null));
    assertFalse(Progression.isArithmeticProgression(new int[0]));
    assertFalse(Progression.isArithmeticProgression(new int[] {1}));
    assertFalse(Progression.isArithmeticProgression(new int[] {1, 2}));
    assertFalse(Progression.isArithmeticProgression(new int[] {1, 2, 4}));
    assertTrue(Progression.isArithmeticProgression(new int[] {1, 2, 3}));
    assertTrue(Progression.isArithmeticProgression(new int[] {1, 2, 3, 4}));
    assertTrue(Progression.isArithmeticProgression(new int[] {2, 4, 6, 8}));
    assertTrue(Progression.isArithmeticProgression(new int[24]));
    assertFalse(Progression.isArithmeticProgression(new int[] {2, 4, 6, 9}));
    assertFalse(Progression.isArithmeticProgression(new int[] {2, 4, 6, 9, 10}));
  }

  public void testGP() {
    assertFalse(Progression.isGeometricProgression(null));
    assertFalse(Progression.isGeometricProgression(new int[0]));
    assertFalse(Progression.isGeometricProgression(new int[] {1}));
    assertFalse(Progression.isGeometricProgression(new int[] {1, 2}));
    assertFalse(Progression.isGeometricProgression(new int[] {1, 2, 3}));
    assertFalse(Progression.isGeometricProgression(new int[] {0, 2, 4}));
    assertTrue(Progression.isGeometricProgression(new int[] {1, 2, 4}));
    assertTrue(Progression.isGeometricProgression(new int[] {1, 2, 4, 8}));
    assertTrue(Progression.isGeometricProgression(new int[] {3, 9, 27, 81}));
    assertFalse(Progression.isGeometricProgression(new int[] {2, 4, 6, 8}));
    assertFalse(Progression.isGeometricProgression(new int[] {2, 4, 6, 8, 16}));
    assertFalse(Progression.isGeometricProgression(new int[] {2, 4, 0, 8, 16}));
    assertTrue(Progression.isGeometricProgression(new int[24]));
    assertFalse(Progression.isGeometricProgression(new int[] {0, 1, 0}));
  }

  public void testOdd() {
    assertFalse(Progression.isOdd(null));
    assertTrue(Progression.isOdd(new int[0]));
    assertFalse(Progression.isOdd(new int[1]));
    assertFalse(Progression.isOdd(new int[2]));
    assertFalse(Progression.isOdd(new int[200]));
    assertTrue(Progression.isOdd(new int[] {1}));
    assertTrue(Progression.isOdd(new int[] {1, 1}));
    assertTrue(Progression.isOdd(new int[] {1, 3}));
    assertTrue(Progression.isOdd(new int[] {1, 3, 7}));
    assertTrue(Progression.isOdd(new int[] {1, 3, -7}));
    assertFalse(Progression.isOdd(new int[] {1, 2, -7}));
    assertFalse(Progression.isOdd(new int[] {1, -2, -7}));
  }

  public void testEven() {
    assertFalse(Progression.isEven(null));
    assertTrue(Progression.isEven(new int[0]));
    assertTrue(Progression.isEven(new int[1]));
    assertTrue(Progression.isEven(new int[2]));
    assertTrue(Progression.isEven(new int[200]));
    assertFalse(Progression.isEven(new int[] {1}));
    assertFalse(Progression.isEven(new int[] {1, 1}));
    assertTrue(Progression.isEven(new int[] {2, 4}));
    assertTrue(Progression.isEven(new int[] {2, 4, 8}));
    assertTrue(Progression.isEven(new int[] {2, 4, -8}));
    assertFalse(Progression.isEven(new int[] {2, 3, -8}));
    assertFalse(Progression.isEven(new int[] {2, -3, -8}));
  }
}
