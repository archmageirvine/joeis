package irvine.util;

import junit.framework.TestCase;

import java.util.Map;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class LimitedLengthPriorityQueueTest extends TestCase {

  public void test() {
    final LimitedLengthPriorityQueue<String> q = new LimitedLengthPriorityQueue<>(2, true);
    assertEquals(0, q.size());
    q.add(42.0, "Hi");
    q.add(42.0, "Hi");
    q.add(43.0, "there");
    assertEquals(2, q.size());
    q.add(44.0, "mate");
    assertEquals(2, q.size());
    final Map<String, Double> map = q.map();
    assertEquals(2, map.size());
    assertEquals(44.0, map.get("mate"), 1E-20);
    assertEquals(43.0, map.get("there"), 1E-20);
  }
}
