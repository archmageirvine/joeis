package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AddTest extends TestCase {

  public void test() {
    final PAdic p = PAdic.create(7, 320);
    assertEquals("3,0,6,1,0", new Add(p, p).toString(4));
  }
}
