package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class PolylogarithmTest extends TestCase {

  public void test() {
    assertEquals("0.51747906167389938629", CrFunctions.POLYLOG.cr(4, CR.HALF).toString(20));
  }
}
