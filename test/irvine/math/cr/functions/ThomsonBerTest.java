package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ThomsonBerTest extends TestCase {

  public void test() {
    assertEquals("0.99902346399083825555", CrFunctions.BER.cr(CR.HALF).toString(20));
  }
}
