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
public class NauGroupTest extends StandardIoTestCase {

  public void test() {
    final NauGroup group = new NauGroup();
    assertNotNull(group.newPermRec(1));
  }

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

  public void testCli1() throws IOException {
    try (final InputStream is = getClass().getClassLoader().getResourceAsStream("irvine/math/nauty/gen1.lst")) {
      check(is, new String[]{"-o", "-T"},
        "3 2 0 2 1 2",
        "3 2 0 2 2 1",
        "3 2 2 0 2 1",
        "3 3 0 1 0 2 1 2",
        "3 3 0 1 2 0 1 2",
        ">Z 2 graphs read from stdin; 5 digraphs written to stdout;",
        "sec");
    }
  }
}
