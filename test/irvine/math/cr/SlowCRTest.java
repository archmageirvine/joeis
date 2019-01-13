package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class SlowCRTest extends TestCase {

  public void testSlowCR() {
    CRTest.assertEquals("slow cr", CR.ONE, new PrescaledCos(new Acos().execute(CR.ONE)));
  }
}
