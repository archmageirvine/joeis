package irvine.math.nauty;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import irvine.TestUtils;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MultigraphTest extends TestCase {

  public void test1() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(1);
    mg.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, false);
    assertEquals(1, mg.getGraphsOutputCount());
  }

  public void testEmpty() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(2);
    mg.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, false);
    assertEquals(1, mg.getGraphsOutputCount());
  }

  public void testEdge() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(2);
    graph.addEdge(0, 1);
    mg.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, false);
    assertEquals(3, mg.getGraphsOutputCount());
  }

  public void testEdgeOrient() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(2);
    graph.addEdge(0, 1);
    mg.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, true);
    assertEquals(1, mg.getGraphsOutputCount());
  }

  public void testBigger() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(6);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(2, 3);
    graph.addEdge(1, 3);
    graph.addEdge(3, 5);
    graph.addEdge(2, 4);
    mg.multi(graph, 0, 0, Multigraph.NOLIMIT, 3, 4, false);
    assertEquals(18, mg.getGraphsOutputCount());
    assertEquals(1, mg.getGraphsInputCount());
  }

  public void testAnother() throws IOException {
    final Multigraph mg = new Multigraph(null);
    final Graph graph = GraphFactory.create(6);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(2, 3);
    graph.addEdge(1, 3);
    graph.addEdge(3, 5);
    graph.addEdge(2, 4);
    graph.addEdge(4, 5);
    mg.multi(graph, 0, 0, 10, 10, 10, false);
    assertEquals(42, mg.getGraphsOutputCount());
    mg.multi(graph, 0, 0, 9, 10, 10, false);
    assertEquals(57, mg.getGraphsOutputCount());
    assertEquals(2, mg.getGraphsInputCount());
  }

  private void check(final InputStream is, final String[] command, final String... expected) throws IOException {
    final PrintStream oldOut = System.out;
    final PrintStream oldErr = System.err;
    final InputStream oldIn = System.in;
    try {
      final ByteArrayOutputStream bos = new ByteArrayOutputStream();
      try (final PrintStream out = new PrintStream(bos)) {
        System.setOut(out);
        System.setErr(out);
        System.setIn(is);
        Multigraph.main(command);
      } catch (final IllegalArgumentException e) {
        assertEquals("Exit with: 0", e.getMessage());
      }
      final String s = bos.toString();
      //oldOut.println(s);
      TestUtils.containsAll(s, expected);
    } finally {
      System.setOut(oldOut);
      System.setErr(oldErr);
      System.setIn(oldIn);
    }
  }

  private void check(final String[] command, final String... expected) throws IOException {
    check(null, command, expected);
  }

  public void testHelp() throws IOException {
    check(new String[] {"--help"},
      "Optional flags:",
      "Multigraph",
      "Generate all multigraphs of a graph with given constraints.",
      "do not output generated graphs, just count them",
      "upper bound for the maximum degree",
      "maximum edge multiplicity (minimum 1)",
      "make regular of specified degree",
      "make regular multigraphs with multiloops",
      "use the group that fixes",
      "INTEGER",
      "produce less output",
      "specify a value or range of the total number of arcs");
  }

  public void testCli1() throws IOException {
    try (final InputStream is = getClass().getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-r", "2"},
        "3 3 0 1 1 0 2 1 1 2 1",
        ">Z 2 graphs read from stdin; 1 multigraphs written to stdout;",
        "sec");
    }
  }

  public void testCli2() throws IOException {
    try (final InputStream is = getClass().getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-u", "-e", "2:3"},
        ">Z 2 graphs read from stdin; 3 multigraphs generated;");
    }
  }

  public void testCli3() throws IOException {
    try (final InputStream is = getClass().getClassLoader().getResourceAsStream("irvine/math/nauty/gen2.lst")) {
      check(is, new String[] {"-D", "9"},
        "5 7 0 3 1 0 4 1 1 3 1 1 4 1 2 3 1 2 4 1 3 4 1",
        "5 7 0 3 1 0 4 1 1 3 1 1 4 1 2 3 1 2 4 1 3 4 2",
        "5 7 0 3 1 0 4 1 1 3 1 1 4 1 2 3 1 2 4 1 3 4 3",
        "5 7 0 3 2 0 4 2 1 3 2 1 4 2 2 3 1 2 4 1 3 4 3",
        "5 7 0 2 7 0 3 1 0 4 1 1 4 6 2 3 1 2 4 1 3 4 1",
        "5 8 0 2 1 0 3 1 0 4 1 1 3 1 1 4 1 2 3 1 2 4 1 3 4 1",
        "5 7 0 2 3 0 3 1 0 4 1 1 2 1 1 3 1 1 4 3 2 4 3",
        "5 8 0 2 3 0 3 2 0 4 1 1 2 1 1 3 1 1 4 1 2 4 1 3 4 3",
        ">Z 6 graphs read from stdin; 21549 multigraphs written to stdout;");
    }
  }

  public void testCli4() throws IOException {
    try (final InputStream is = getClass().getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[] {"-l", "2"},
        "3 3 0 1 1 0 2 1 1 2 1",
        ">Z 2 graphs read from stdin; 1 multigraphs written to stdout;",
        "sec");
    }
  }

}
