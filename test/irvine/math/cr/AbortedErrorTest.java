package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AbortedErrorTest extends TestCase {

  public void test() {
    final AbortedError e = new AbortedError("hi");
    assertEquals("hi", e.getMessage());
  }
}
