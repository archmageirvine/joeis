package irvine.math.nauty;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class WriteNautyTest extends TestCase {

  public void testEmpty() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try (final DataOutputStream dos = new DataOutputStream(bos)) {
      final WriteNauty w = new WriteNauty(dos);
      final Graph g = GraphFactory.create(3);
      g.addEdge(0, 1);
      g.addEdge(0, 2);
      w.process(g);
    }
    assertEquals("[3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 96, 0, 0, 0, 0, 0, 0, 0, 63, 0, 0, 0, 0, 0, 0, 0, 63]",
      Arrays.toString(bos.toString(StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.US_ASCII)));
  }

}
