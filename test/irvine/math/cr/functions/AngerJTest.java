package irvine.math.cr.functions;

import irvine.math.cr.CR;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AngerJTest extends TestCase {

  public void test() {
    assertEquals("0.24226845767487388638", CrFunctions.ANGER_J.cr(1, CR.HALF).toString(20));
  }
}
