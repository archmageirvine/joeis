package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IdentifierTest extends TestCase {

  public void test() {
    assertEquals("x", new Identifier("x").toString());
    assertTrue(new Identifier("x").equals(new Identifier("x")));
    assertFalse(new Identifier("x").equals(new Identifier("y")));
  }
}
