package irvine.factor.project.factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

import irvine.StandardIoTestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PrimoCertificateTest extends StandardIoTestCase {

  public void test() throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(new GZIPInputStream(PrimoCertificateTest.class.getClassLoader().getResourceAsStream("irvine/factor/project/factorial/certificates/f177m.gz"))))) {
      assertTrue(PrimoCertificate.verify(r, false));
    }
    assertEquals("............................................[OK]", getOut().trim());
  }
}
