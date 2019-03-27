package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CountIndependentSetsTest extends TestCase {

  public void test() {
    assertEquals(5, CountIndependentSets.count(GraphFactory.complete(4)));
  }
}
