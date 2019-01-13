package irvine.math.nauty;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GenerateGraphsTest extends TestCase {

  static void check(final String[] command, final String... expected) throws IOException {
    final PrintStream oldOut = System.out;
    final PrintStream oldErr = System.err;
    try {
      final ByteArrayOutputStream bos = new ByteArrayOutputStream();
      try (final PrintStream out = new PrintStream(bos)) {
        System.setOut(out);
        System.setErr(out);
        GenerateGraphsCli.main(command);
      } catch (final IllegalArgumentException e) {
        assertEquals("Exit with: 0", e.getMessage());
      }
      final String s = bos.toString();
      //oldOut.println(s);
      TestUtils.containsAll(s, expected);
    } finally {
      System.setOut(oldOut);
      System.setErr(oldErr);
    }
  }

  public void test2() throws IOException {
    check(new String[] {"-n", "-o", "-", "2"},
      ">A [-n, -o, -, 2]",
      "\u0002\0\0\0",
      ">Z 2 graphs generated in ");
  }

  public void test6() throws IOException {
    check(new String[] {"6"},
      ">A [6]",
      "E???",
      "E~~w",
      ">Z 156 graphs generated in ");
  }

  public void test7() throws IOException {
    check(new String[] {"7"},
      ">A [7]",
      "F??F_",
      "F~~~w",
      ">Z 1044 graphs generated in ");
  }

  public void testC3Free7() throws IOException {
    check(new String[] {"-t", "7"},
      ">A [-t, 7]",
      "F??F_",
      "FCxv?",
      ">Z 107 graphs generated in ");
  }

  public void testC4Free7() throws IOException {
    check(new String[] {"-f", "-g", "7"},
      ">A [-f, -g, 7]",
      "F??F_",
      "FCQ`_",
      ">Z 117 graphs generated in ");
  }

  public void testC3C4Free7() throws IOException {
    check(new String[] {"-f", "-t", "-u", "7"},
      ">A [-f, -t, -u, 7]",
      ">Z 48 graphs generated in ");
  }

  static final int[] EXPECTED_B = {0, 1, 2, 3, 7, 13, 35, 88, 303};

  public void testB() throws IOException {
    for (int k = 1; k < EXPECTED_B.length; ++k) {
      check(new String[] {"-b", String.valueOf(k)},
        ">A [-b, " + String.valueOf(k) + "]",
        ">Z " + EXPECTED_B[k] + " graphs generated in ");
    }
  }

  private static final int[] EXPECTED_BF = {0, 1, 2, 3, 6, 10, 21, 39};

  public void testBF() throws IOException {
    for (int k = 1; k < EXPECTED_BF.length; ++k) {
      check(new String[] {"-b", "-f", "-u", String.valueOf(k)},
        ">Z " + EXPECTED_BF[k] + " graphs generated in ");
    }
  }

  private static final int[] EXPECTED_F = {0, 1, 2, 4, 8, 18, 44, 117};

  public void testF() throws IOException {
    for (int k = 1; k < EXPECTED_F.length; ++k) {
      check(new String[] {"-f", "-u", String.valueOf(k)},
        ">Z " + EXPECTED_F[k] + " graphs generated in ");
    }
  }

  public void testCubic() throws IOException {
    check(new String[] {"-d", "3", "-D", "3", "4"},
      ">A [-d, 3, -D, 3, 4]",
      "C~",
      ">Z 1 graphs generated in ");
  }

  public void testResidue() throws IOException {
    check(new String[] {"-r", "2/7", "6"},
      ">A [-r, 2/7, 6]",
      "E]zg",
      "E^~w",
      ">Z 6 graphs generated in ");
  }

  public void testConnected() throws IOException {
    check(new String[] {"-c", "-u", "4"},
      ">Z 6 graphs generated in ");
  }

  public void testBiconnected() throws IOException {
    check(new String[] {"-C", "-u", "--save-memory", "4"},
      ">Z 3 graphs generated in ");
  }

}
