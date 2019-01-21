package irvine.factor.project.em;

import java.io.File;
import java.io.IOException;

import irvine.StandardIoTestCase;
import irvine.TestUtils;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MeshTest extends StandardIoTestCase {

  public void test() throws IOException {
    // Cut down input file for testing
    final File mesh = TestUtils.resourceToFile("irvine/factor/project/em/mesh.dat", new File("mesh-junit"));
    try {
      System.setProperty("no.ecm", "true");
      Mesh.main("-l", "-s", "-v", "-i", mesh.getPath());
      final String s = getOut();
      //System.out.println(s);
      TestUtils.containsAll(s,
        "Added missing composite at level 8: 4297836833293963",
        "Writing tree",
        "8\t1*2*3*7*43*13*53*5*6221671",
        "Level\tNodes\tComposites",
        "0\t1\t0",
        "8\t1\t8",
        "First prime not yet in mesh: 11");
    } finally {
      assertTrue(mesh.delete());
      assertTrue(new File("mesh-junit.0").delete());
    }
  }
}
