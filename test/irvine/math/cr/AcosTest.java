package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AcosTest extends TestCase {

  public void testAcos() {
    final UnaryCrFunction acos = new Acos();
    CRTest.assertEquals("acos", CR.ONE, acos.execute(CR.ONE.cos()));
  }
}
