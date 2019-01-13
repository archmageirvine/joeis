package irvine.math.nauty;

import java.io.IOException;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RefineXTest extends TestCase {

  public void testB() throws IOException {
    for (int k = 1; k < GenerateGraphsTest.EXPECTED_B.length; ++k) {
      GenerateGraphsTest.check(new String[] {"-b", String.valueOf(k)},
        ">A [-b, " + String.valueOf(k) + "]",
        ">Z " + GenerateGraphsTest.EXPECTED_B[k] + " graphs generated in ");
    }
  }

}
