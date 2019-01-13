package irvine.math.set;

import irvine.math.api.InfiniteEffort;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DefaultInfiniteEffortTest extends TestCase {

  public void test() {
    final InfiniteEffort e = new DefaultInfiniteEffort();
    assertEquals(1000, e.getInfiniteEffort());
    e.setInfiniteEffort(42);
    assertEquals(42, e.getInfiniteEffort());
  }
}
