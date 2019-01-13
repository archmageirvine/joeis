package irvine.factor.project.em;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import irvine.StandardIoTestCase;
import irvine.factor.factor.ListFactorizer;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MeshIncrementTest extends StandardIoTestCase {

  private static final String INPUT =
    "# Euclid-Mullin graph.\n"
      + "1\n"
      + ".2\n"
      + "..3\n"
      + "...7\n"
      + "....43\n"
      + ".....13\n"
      + ".....139\n";

  public void test() throws IOException {
    System.setProperty("no.ecm", "true");
    try (final BufferedReader mesh = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(INPUT.getBytes())))) {
      String line;
      while ((line = mesh.readLine()) != null) {
        MeshIncrement.process(line, 10, null);
      }
    }
    assertEquals("", getErr());
    // Run should do nothing
    assertEquals(INPUT, getOut());
  }

  private static final String INPUT2 =
    "# Euclid-Mullin graph.\n"
      + "1\n"
      + ".2\n"
      + "..3\n"
      + "...7\n"
      + "....43\n"
      + ".....(1807)1\n";

  public void test2() throws IOException {
    System.setProperty("no.ecm", "true");
    final ListFactorizer lf = new ListFactorizer(Arrays.asList(Z.valueOf(123456789), Z.valueOf(54321), Z.valueOf(13)));
    try (final BufferedReader mesh = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(INPUT2.getBytes())))) {
      String line;
      while ((line = mesh.readLine()) != null) {
        MeshIncrement.process(line, 10, lf);
      }
    }
    assertEquals("Factored using list: 1807\n-> Found prime factor 13\n-> Found prime factor 139\n", getErr());
    assertEquals(INPUT, getOut());
  }
}
