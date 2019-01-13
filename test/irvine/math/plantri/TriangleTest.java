package irvine.math.plantri;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class TriangleTest extends TestCase {

  public void testArray() {
    assertEquals(0, Triangle.create(0).length);
    final Triangle[] t = Triangle.create(2);
    assertEquals(2, t.length);
    assertNotNull(t[0]);
    assertNotNull(t[1]);
  }

  public void testInstance() {
    final Triangle t = new Triangle();
    assertNull(t.mEdge1);
    assertNull(t.mEdge2);
    assertNull(t.mEdge3);
  }
}
