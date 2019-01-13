package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MonotoneDerivativeTest extends TestCase {

  public void testFunctions() {
    final UnaryCRFunction cosine = new Sin().monotoneDerivative(CR.ZERO, CR.PI);
    assertEquals("monotoneDerivative failed", cosine.execute(CR.ONE), CR.ONE.cos());
    assertEquals("monotoneDerivative failed 2", cosine.execute(CR.THREE), CR.THREE.cos());
  }
}
