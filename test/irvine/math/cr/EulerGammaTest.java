package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class EulerGammaTest extends TestCase {

  public void testEulerGamma() {
    assertEquals("0.57721566490153286060651209008240243104215933593992359880576723488486772677766467093694706329174674951463144724980708248096050401448654283622417399764492353625350033374293733773767394279259525824709492", CR.GAMMA.toString(200));
  }
}
