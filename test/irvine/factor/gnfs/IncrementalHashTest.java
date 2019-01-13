package irvine.factor.gnfs;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IncrementalHashTest extends TestCase {

  public void test() throws IOException {
    final IncrementalHash h = new IncrementalHash();
    h.hash(123456, (byte) 0x30);
    h.hash(123456, (byte) 0x30);
    h.hash(123457, (byte) 0x10);
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
      h.dump(bos);
      assertEquals(132115524, Arrays.hashCode(bos.toByteArray()));
    }
  }
}
