package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class BesselKTest extends TestCase {

  public void test() {
    assertEquals("0.60190723019723457474", CrFunctions.BESSEL_K.cr(1, CR.ONE).toString(20));
  }
}
