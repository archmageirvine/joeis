package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CatalanTest extends TestCase {

  public void test() {
    final Function1 f = new Catalan();
    assertEquals(5, f.l(3));
  }
}
