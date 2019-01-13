package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AddTest extends TestCase {

  public void testAdd() {
    CRTest.assertEquals("add", CR.ZERO, CR.ZERO.add(CR.ZERO));
    CRTest.assertEquals("add", CR.ONE, CR.ONE.add(CR.ZERO));
    CRTest.assertEquals("add", CR.TWO, CR.ONE.add(CR.ONE));
    CRTest.assertEquals("add", CR.ZERO, CR.ONE.negate().add(CR.ONE));
  }
}
