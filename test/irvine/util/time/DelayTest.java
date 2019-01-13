package irvine.util.time;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DelayTest extends TestCase {

  public void test() {
    final Delay delay = new Delay(10000);
    assertFalse(delay.delay(System.nanoTime()));
    assertFalse(delay.delay(System.nanoTime()));
  }
}
