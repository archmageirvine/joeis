package irvine.math.group;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.set.Permutation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MatrixGroupTest extends TestCase {

  public void testSymmetric() {
    final MatrixGroup<Permutation<Integer>> group = new MatrixGroup<>(2, 2, SymmetricGroup.create(4));
    assertEquals(Z.valueOf(331776), group.size());
    assertFalse(group.isAbelian());
    assertTrue(group.contains(group.zero()));
    assertFalse(group.contains(null));
    assertEquals("M_{2,2}(S_{4})", group.toString());
  }

  public void testIntegers() {
    final MatrixGroup<Z> group = new MatrixGroup<>(2, 3, Integers.SINGLETON);
    assertNull(group.size());
    assertTrue(group.isAbelian());
    assertTrue(group.contains(group.zero()));
    assertFalse(group.contains(null));
    assertEquals(2, group.rows());
    assertEquals(3, group.cols());
    assertEquals("M_{2,3}(\\Z)", group.toString());
    try {
      group.add(null, group.zero());
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      group.add(group.zero(), null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      group.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    assertEquals(group.zero(), group.negate(group.zero()));
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}}, Z.ZERO);
    final Matrix<Z> b = new DefaultMatrix<>(new Z[][] {{Z.TWO, Z.ONE, Z.TWO}, {Z.TWO, Z.TWO, Z.TWO}}, Z.ZERO);
    assertEquals("[[2 2 4][4 5 4]]", group.add(a, b).toString());
    assertEquals("[[-2 0 0][0 1 0]]", group.subtract(a, b).toString());
    try {
      group.trace(a);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testTrace() {
    final MatrixGroup<Z> group = new MatrixGroup<>(3, 3, Integers.SINGLETON);
    final Matrix<Z> a = new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}, {Z.ZERO, Z.ZERO, Z.FIVE}}, Z.ZERO);
    assertEquals(Z.EIGHT, group.trace(a));
  }

  public void testIsSymmetric() {
    final MatrixGroup<Z> group = new MatrixGroup<>(3, 3, Integers.SINGLETON);
    assertTrue(group.isSymmetric(group.zero()));
    assertFalse(group.isSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}}, Z.ZERO)));
    assertFalse(group.isSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}, {Z.ZERO, Z.ZERO, Z.FIVE}}, Z.ZERO)));
    assertTrue(group.isSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.ONE, Z.THREE, Z.FOUR}, {Z.TWO, Z.FOUR, Z.TWO}}, Z.ZERO)));
  }

  public void testIsSkewSymmetric() {
    final MatrixGroup<Z> group = new MatrixGroup<>(3, 3, Integers.SINGLETON);
    assertTrue(group.isSkewSymmetric(group.zero()));
    assertFalse(group.isSkewSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}}, Z.ZERO)));
    assertFalse(group.isSkewSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.TWO, Z.THREE, Z.TWO}, {Z.ZERO, Z.ZERO, Z.FIVE}}, Z.ZERO)));
    assertTrue(group.isSkewSymmetric(new DefaultMatrix<>(new Z[][] {{Z.ZERO, Z.ONE, Z.TWO}, {Z.NEG_ONE, Z.ZERO, Z.valueOf(-4)}, {Z.valueOf(-2), Z.FOUR, Z.ZERO}}, Z.ZERO)));
  }

  public void testCyclicIterator() {
    final MatrixGroup<Z> group = new MatrixGroup<>(1, 2, new CyclicGroup(2));
    final Iterator<Matrix<Z>> it = group.iterator();
    assertTrue(it.hasNext());
    assertEquals("[[0 0]]", it.next().toString());
    assertEquals("[[0 1]]", it.next().toString());
    assertEquals("[[1 0]]", it.next().toString());
    assertTrue(it.hasNext());
    assertEquals("[[1 1]]", it.next().toString());
    assertFalse(it.hasNext());
    assertFalse(it.hasNext());
    try {
        it.next();
        fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void testRandom() {
    final MatrixGroup<Z> g = new MatrixGroup<>(2, 2, new CyclicGroup(3));
    final Random r = new Random(42);
    final HashSet<Object> h = new HashSet<>();
    for (int k = 0; k < 300; ++k) {
      h.add(g.random(r));
    }
    assertEquals(81, h.size());
  }

}
