package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitProductPersistenceTest extends TestCase {

  public void test() {
    final Function1 f = new DigitProductPersistence();
    assertEquals(0, f.l(0));
    assertEquals(0, f.l(1));
    assertEquals(1, f.l(10));
    assertEquals(1, f.l(42));
    assertEquals(2, f.l(1234));
  }
}
