package irvine.oeis;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

import irvine.util.io.IOUtils;
import junit.framework.TestCase;

/**
 * Test a sequence.
 * @author Sean A. Irvine
 */
public abstract class AbstractSequenceTest extends TestCase {

  private static final String TEST_TERMS_LOCATION = "irvine/oeis/test-terms.dat";
  private static final HashMap<String, Integer> TEST_TERMS = new HashMap<>();
  static {
    try (final BufferedReader r = IOUtils.reader(TEST_TERMS_LOCATION)) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty()) {
          final int space = line.indexOf(' ');
          TEST_TERMS.put(line.substring(0, space), Integer.parseInt(line.substring(space + 1)));
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

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
      final String aNumber = "A" + seqId;
      final Sequence seq = SequenceFactory.sequence(aNumber);
      final int termsToExamine = Math.min(parts.length, TEST_TERMS.getOrDefault(aNumber, Integer.MAX_VALUE));
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
