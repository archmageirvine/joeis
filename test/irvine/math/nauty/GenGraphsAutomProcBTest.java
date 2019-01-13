package irvine.math.nauty;

import java.io.IOException;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GenGraphsAutomProcBTest extends TestCase {

  public void testC3Free7() throws IOException {
    GenerateGraphsTest.check(new String[] {"-t", "7"},
      ">A [-t, 7]",
      "F??F_",
      "FCxv?",
      ">Z 107 graphs generated in ");
  }
}
