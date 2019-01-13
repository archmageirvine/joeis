package irvine.oeis;

import irvine.util.io.IOUtils;
import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractSequenceTest extends TestCase {

  private static final int LINES_PER_FILE = 1000;

  private String getTestVector(final int id) throws IOException {
    final String path = "irvine/oeis/seq/" + id / LINES_PER_FILE;
    try (final BufferedReader r = IOUtils.reader(path)) {
      final int skip = id % LINES_PER_FILE;
      for (int k = 0; k < skip; ++k) {
        r.readLine();
      }
      final String c = r.readLine();
      if (c == null) {
        return null;
      }
      if (!c.isEmpty() && c.charAt(0) == '#') {
        return null;
      }
      return c;
    }
  }

  protected int maxTerms() {
    return Integer.MAX_VALUE;
  }

  public void test() throws IOException {
    final String name = getClass().getName();
    final int len = name.length();
    final String seqId = name.substring(len - 10, len - 4);
    final int id = Integer.parseInt(seqId);
    final String vector = getTestVector(id);
    final long start = System.currentTimeMillis();
    if (vector == null) {
      System.err.println("Skipping: " + name + " because there is no active test vector");
    } else {
      final String[] parts = vector.split(",");
      assertTrue(parts.length > 0);
      final Sequence seq = SequenceFactory.sequence("A" + seqId);
      final int termsToExamine = Math.min(parts.length, maxTerms());
      for (int k = 0; k < termsToExamine; ++k) {
        assertEquals("a(" + (k + 1) + ")", parts[k], seq.next().toString());
      }
      if (seq instanceof Closeable) {
        ((Closeable) seq).close();
      }
    }
    final long delta = System.currentTimeMillis() - start;
    if (delta > 9000) {
      System.out.println("A" + seqId + " " + (delta / 1000) + " s");
    }
  }
}
