package irvine.factor.project.em;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EuclidMullinVerifyTest extends TestCase {

  public void test() throws IOException {
    try (final InputStream in = EuclidMullinVerifyTest.class.getClassLoader().getResourceAsStream("irvine/factor/project/em/em2");
         final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos)) {
      EuclidMullinVerify.verify(in, out, true);
      final String s = bos.toString();
      //System.out.println(s);
      TestUtils.containsAll(s,
        "1 1",
        "2 1",
        "3 2",
        "5 5",
        "51 335",
        "Smallest prime not yet in sequence: 41 (step 52)",
        "#Current target: 968294");
    }
  }
}
