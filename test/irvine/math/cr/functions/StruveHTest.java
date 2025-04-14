package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StruveHTest extends TestCase {

  public void test() {
    assertEquals("0.05217374424234107038", CrFunctions.STRUVE_H.cr(1, CR.HALF).toString(20));
  }
}
