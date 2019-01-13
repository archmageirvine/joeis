package irvine.math.group;

import java.util.HashSet;

import irvine.math.set.Permutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AlternatingGroupTest extends TestCase {

  public void testA4() {
    final AlternatingGroup<Integer> a4 = AlternatingGroup.create(4);
    assertEquals(Z.valueOf(12), a4.size());
    assertEquals("A_{4}", a4.toString());
    assertEquals("[1, 2, 3, 4]", a4.zero().toString());
    assertFalse(a4.isAbelian());
    assertFalse(a4.isSimple());
    final HashSet<Permutation<Integer>> elements = new HashSet<>();
    for (final Permutation<Integer> e : a4) {
      elements.add(e);
    }
    assertEquals(elements.toString(), 12, elements.size());
    for (final Permutation<Integer> a : elements) {
      for (final Permutation<Integer> b : elements) {
        final Permutation<Integer> c = a4.add(a, b);
        assertTrue(a + " + " + b + " = " + c, elements.contains(c));
        assertTrue(a4.contains(c));
      }
    }
  }

  public void testIllegal() {
    try {
      AlternatingGroup.create(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testProperties() {
    assertTrue(AlternatingGroup.create(3).isAbelian());
    assertFalse(AlternatingGroup.create(5).isAbelian());
    assertTrue(AlternatingGroup.create(3).isSimple());
    assertFalse(AlternatingGroup.create(2).isSimple());
  }
}
