package irvine.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CubicGeneratorTest extends TestCase {

  public void test() {
    final CubicGenerator cg = new CubicGenerator();
    assertEquals(1, cg.next().size());
    assertEquals(2, cg.next().size());
    assertEquals(6, cg.next().size());
    assertEquals(20, cg.next().size());
    //assertEquals(91, cg.next().size());
  }
}
