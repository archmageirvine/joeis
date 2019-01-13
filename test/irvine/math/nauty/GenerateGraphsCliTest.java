package irvine.math.nauty;

import java.io.IOException;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GenerateGraphsCliTest extends GenerateGraphsTest {

  public void testHelp() throws IOException {
    check(new String[] {"--help"},
      "Required flags:",
      "number of vertices",
      "only generate biconnected graphs",
      "only generate bipartite graphs",
      "canonically label output graphs",
      "-c, --connected",
      "upper bound for the maximum degree",
      "-m, --min-edges=INTEGER",
      "split level increment (Default is 0)",
      "only generate residue class r out of n",
      "-r, --subset=R/N",
      "save memory at the expense",
      "canonise",
      "quiet",
      "maximum number of edges",
      "--max-degree",
      "Generate all graphs of a specified class.",
      "--verbose",
      "-M, --max-edges=INTEGER",
      "-d, --min-degree=INTEGER",
      "-m, --min-edges=INTEGER",
      "-S, --safe",
      "use extra safety margin on edges",
      "-n, --nauty",
      "-g, --graph6",
      "-X, --split-level-int=INTEGER",
      "name of file to write output into (default is");
  }
}
