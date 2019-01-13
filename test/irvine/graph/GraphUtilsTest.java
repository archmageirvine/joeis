package irvine.graph;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GraphUtilsTest extends TestCase {

  public void test1() throws IOException {
    try (final InputStream is = GraphUtilsTest.class.getClassLoader().getResourceAsStream("irvine/graph/bollobas1.1.gph")) {
      final Graph<String, String> g = GraphUtils.load(is);
      assertEquals(9, g.order());
      assertEquals(21, g.size());
    }
  }

  public void testEmpty() {
    try {
      GraphUtils.empty(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < 5; ++k) {
      final Graph<Integer, String> g = GraphUtils.empty(k);
      assertEquals(k, g.order());
      assertEquals(0, g.size());
    }
  }

  public void testComplete() {
    try {
      GraphUtils.complete(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < 7; ++k) {
      final Graph<Integer, String> g = GraphUtils.complete(k);
      assertEquals(k, g.order());
      assertEquals(k * (k - 1) / 2, g.size());
      if (k > 0) {
        final Vertex<Integer, String> v = g.vertices().iterator().next();
        assertFalse(v.isAdjacent(v));
        assertFalse(v.neighbours().contains(v));
      }
    }
  }

  public void testRandomUndirected() {
    try {
      GraphUtils.randomUndirected(-1, 0, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      GraphUtils.randomUndirected(0, 1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      GraphUtils.randomUndirected(1, -1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Graph<Integer, Integer> g = GraphUtils.randomUndirected(32, 17, 0);
    assertEquals(32, g.order());
    assertEquals(17, g.size());
  }
}

