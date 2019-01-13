package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PrecisionOverflowErrorTest extends TestCase {

  public void test() {
    final PrecisionOverflowError e = new PrecisionOverflowError("hi");
    assertEquals("hi", e.getMessage());
  }
}
