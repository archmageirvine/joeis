package irvine.math.group;

import irvine.math.c.ComplexField;
import junit.framework.TestCase;
import irvine.math.c.C;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyFieldTest extends TestCase {

  public void test() {
    final ComplexField c = ComplexField.SINGLETON;
    assertEquals(C.ONE, AbstractField.pow(C.ONE, 10, c));
    assertEquals(C.ONE, AbstractField.pow(C.ONE, -10, c));
    assertEquals(C.ONE, AbstractField.pow(C.ONE, -1, c));
    assertEquals(C.ONE, AbstractField.pow(C.ONE, 0, c));
  }
}
