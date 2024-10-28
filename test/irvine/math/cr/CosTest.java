package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CosTest extends TestCase {

  public void testCos() {
    final UnaryCrFunction acos = new Acos();
    CRTest.assertEquals("acos", CR.ONE, acos.execute(CR.ONE.cos()));
  }
}
