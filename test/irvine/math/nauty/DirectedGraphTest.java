package irvine.math.nauty;

import java.io.IOException;
import java.io.InputStream;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DirectedGraphTest extends StandardIoTestCase {

  private void check(final InputStream is, final String[] command, final String... expected) throws IOException {
    final InputStream oldIn = System.in;
    try {
      try {
        System.setIn(is);
        DirectedGraph.main(command);
      } catch (final IllegalArgumentException e) {
        assertEquals("Exit with: 0", e.getMessage());
      }
      final String s = getOut() + getErr();
      //oldOut.println(s);
      TestUtils.containsAll(s, expected);
    } finally {
      System.setIn(oldIn);
    }
  }

  private void check(final String[] command, final String... expected) throws IOException {
    check(null, command, expected);
  }

  public void testHelp() throws IOException {
    check(new String[] {"--help"},
      "Optional flags:",
      "DirectedGraph",
      "Generate all digraphs from input graphs with",
      "do not output generated graphs, just count them",
      "use a simple text output format",
      "MIN[:MAX]",
      "specify a value or range of the total number of arcs",
      "produce less output",
      "use the group that fixes the first",
      "display counts by number of edges",
      "orient each edge in only one direction, never both"
    );
  }

  public void testCli1() throws IOException {
    try (final InputStream is = DirectedGraphTest.class.getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-o", "-T"},
        "3 2 0 2 1 2",
        "3 2 0 2 2 1",
        "3 2 2 0 2 1",
        "3 3 0 1 0 2 1 2",
        "3 3 0 1 2 0 1 2",
        ">Z 2 graphs read from stdin; 5 digraphs written to stdout;",
        "sec");
    }
  }

  public void testCli2() throws IOException {
    try (final InputStream is = DirectedGraphTest.class.getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-T"},
        "3 2 0 2 1 2",
        "3 2 0 2 2 1",
        "3 2 2 0 2 1",
        "3 3 0 1 0 2 1 2",
        "3 3 0 1 2 0 1 2",
        "3 6 0 1 1 0 0 2 2 0 1 2 2 1",
        ">Z 2 graphs read from stdin; 13 digraphs written to stdout;",
        "sec");
    }
  }

  public void testCli3() throws IOException {
    try (final InputStream is = DirectedGraphTest.class.getClassLoader().getResourceAsStream("irvine/math/nauty/gen2.lst")) {
      check(is, new String[] {"-T", "-u"},
        ">Z 6 graphs read from stdin; 5000 digraphs generated;");
    }
  }

  public void testCli4() throws IOException {
    try (final InputStream is = DirectedGraphTest.class.getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-e", "2:3", "-T"},
        "3 3 0 1 2 0 1 2",
        ">Z 2 graphs read from stdin; 7 digraphs written to stdout;",
        "sec");
    }
  }
}
