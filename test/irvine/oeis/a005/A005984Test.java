package irvine.oeis.a005;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.util.array.LongDynamicArray;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005984Test extends AbstractSequenceTest {

  public void testG() {
    final LongDynamicArray<Polynomial<Z>> vg = new LongDynamicArray<>();
    new A005984().g(5, vg);
    assertEquals(6, vg.length());
    assertNull(vg.get(0));
    assertEquals("1+x", vg.get(1).toString());
    assertNull(vg.get(2));
    assertNull(vg.get(3));
    assertEquals("1+x^3", vg.get(4).toString());
    assertEquals("1+x+x^4+x^6", vg.get(5).toString());
  }

}
