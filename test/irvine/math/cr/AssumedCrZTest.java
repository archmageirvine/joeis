package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AssumedCrZTest extends TestCase {

  public void testAssumedInt() {
    CRTest.assertEquals("assumed int", CR.ONE, new AssumedInt(CR.ONE));
  }
}
