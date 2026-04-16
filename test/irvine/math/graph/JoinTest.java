package irvine.math.graph;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class JoinTest extends TestCase {

  public void test() {
    assertEquals(6, Join.join(GraphFactory.complete(2), GraphFactory.complete(2)).size());
  }
}
