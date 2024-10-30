package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiNsTest extends TestCase {

  public void test() {
    assertEquals("1.28238439755842751266", CrFunctions.JACOBI_NS.cr(new Q(25, 10), new Q(3, 10)).toString(20));
    assertEquals("2.12426764488287289918", CrFunctions.JACOBI_NS.cr(CR.HALF, CR.HALF).toString(20));
  }
}
