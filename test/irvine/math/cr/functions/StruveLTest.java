package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StruveLTest extends TestCase {

  public void test() {
    assertEquals("0.05394218262352266329", CrFunctions.STRUVE_L.cr(1, CR.HALF).toString(20));
  }
}
