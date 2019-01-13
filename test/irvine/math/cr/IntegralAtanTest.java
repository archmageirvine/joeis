package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegralAtanTest extends TestCase {

  private static final String PI = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148";

  public void testIntegralAtan() {
    assertEquals(PI, CR.PI.toString(PI.length() - 2, 10));
  }
}
