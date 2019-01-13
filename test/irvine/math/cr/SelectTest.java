package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class SelectTest extends TestCase {

  public void testSelect() {
    CRTest.assertEquals("select", CR.THREE, CR.ONE.select(CR.TWO, CR.THREE));
    CRTest.assertEquals("select", CR.TWO, CR.ONE.negate().select(CR.TWO, CR.THREE));
  }
}
