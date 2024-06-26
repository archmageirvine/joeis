package irvine.oeis;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.util.io.IOUtils;
import junit.framework.TestCase;

/**
 * Test a sequence.
 * @author Sean A. Irvine
 */
public class AbstractSequenceTest extends TestCase {

  private static final String TEST_TERMS_LOCATION = "irvine/oeis/test-terms.dat";
  private static final HashMap<String, Integer> TEST_TERMS = new HashMap<>();
  static {
    try (final BufferedReader r = IOUtils.reader(TEST_TERMS_LOCATION)) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty()) {
          final int space = line.indexOf(' ');
          TEST_TERMS.put(line.substring(0, space), Integer.valueOf(line.substring(space + 1)));
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static final int LINES_PER_FILE = 1000;
  private static final long TIMEOUT = 30000;

  private final String mClassName;

  public AbstractSequenceTest(final String className) {
    super("test");
    mClassName = className;
  }

  public AbstractSequenceTest() {
    this(null);
  }

  @Override
  public String getName() {
    return mClassName;
  }

  private String getTestVector(final int id) throws IOException {
    final String path = "irvine/oeis/seq/" + String.format("%03d", id / LINES_PER_FILE);
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

  private void check(final String className) throws IOException {
    final int len = className.length();
    final String seqId = className.endsWith("Test") ? className.substring(len - 10, len - 4) : className.substring(len - 6);
    final int id = Integer.parseInt(seqId);
    final String vector = getTestVector(id);
    if (vector == null) {
      System.err.println("Skipping: " + className + " because there is no active test vector");
    } else {
      final long start = System.currentTimeMillis();
      final String aNumber = "A" + seqId;
      try {
        final String[] parts = vector.split(",");
        assertTrue(parts.length > 0);
        final int termsToExamine = Math.min(parts.length, TEST_TERMS.getOrDefault(aNumber, Integer.MAX_VALUE));
        if (termsToExamine > 0) {
          final Sequence seq = SequenceFactory.sequence(aNumber);
          if (!(seq instanceof DeadSequence)) {
            for (int k = 0; k < termsToExamine; ++k) {
              final Z term = seq.next();
              if (term == null) {
                throw new NullPointerException("Unexpected null returned at position " + k);
              }
              assertEquals("a(" + (k + seq.getOffset()) + ")", parts[k], term.toString());
              final long timeSoFar = System.currentTimeMillis() - start;
              if (timeSoFar > TIMEOUT) {
                System.out.println("A" + seqId + " Aborting computation at " + k + " terms due to timeout");
                break;
              }
            }
          }
          if (seq instanceof Closeable) {
            ((Closeable) seq).close();
          }
        }
        final long delta = System.currentTimeMillis() - start;
        if (delta > 9000) {
          System.out.println("A" + seqId + " " + (delta / 1000) + " s");
        }
      } catch (final UnimplementedException | IOException e) {
        // ok, these get a free pass
      }
    }
  }

  public void test() throws IOException {
    check(mClassName == null ? getClass().getName() : mClassName);
  }

  /**
   * Directly test the supplied sequences.
   * @param args sequences to test
   * @throws Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    for (final String aNumber : args) {
      System.out.println("Running " + aNumber);
      new AbstractSequenceTest().check(aNumber.endsWith(".java") ? aNumber.substring(0, aNumber.length() - 5) : aNumber);
    }
  }
}
