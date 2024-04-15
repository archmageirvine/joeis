package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitalRootTest extends TestCase {

  public void test() {
    final Function1 f = new DigitalRoot();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(1, f.l(10));
    assertEquals(6, f.l(42));
    assertEquals(1, f.l(1234));
  }
}
