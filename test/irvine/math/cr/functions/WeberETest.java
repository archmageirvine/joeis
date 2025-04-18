package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class WeberETest extends TestCase {

  public void test() {
    assertEquals("0.58444602812524027270", CrFunctions.WEBER_E.cr(1, CR.HALF).toString(20));
  }
}
