package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AssociatedStirling1Test extends TestCase {

  public void testAssociatedFirstKind() {
    assertEquals(Z.valueOf(183783600), Functions.ASSOCIATED_STIRLING1.z(17, 8));
  }
}
