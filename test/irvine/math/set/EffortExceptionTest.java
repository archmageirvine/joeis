package irvine.math.set;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EffortExceptionTest extends TestCase {

  public void test() {
    assertNull(new EffortException().getMessage());
  }
}
