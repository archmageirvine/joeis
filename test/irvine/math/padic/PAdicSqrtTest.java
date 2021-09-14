package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PAdicSqrtTest extends TestCase {

  public void test1() {
    assertEquals("3,1,2,6,1,2,1,2,4", PAdicSqrt.sqrt(PAdic.create(7, 2)).toString(8));
  }
}
