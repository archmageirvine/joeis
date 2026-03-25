package irvine.oeis.producer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import irvine.oeis.Sequence;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * The standard Producer for sequences backed by a Maple implementation.
 * @author Sean A. Irvine
 */
public class MapleProducer implements Producer {

  private static final String PROG_ROOT = System.getProperty("prog.root", "prog");
  static final String MAPLE_COMMAND = System.getProperty("maple.command", "maple");
  private static final String VERSION_TAG = "Maple ";

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  // Set once on the first attempt to use Maple. An empty string indicates no Pari was found.
  private String mMapleVersion = null;

  private boolean isMapleAvailable() {
    if (mMapleVersion == null) {
      // Do a one-off check to see if Maple is installed and try to determine
      // the version number of Maple.
      final ProcessBuilder pb = new ProcessBuilder(MAPLE_COMMAND);
      try {
        final Process proc = pb.start();
        proc.getOutputStream().close();
        final String res;
        try (final InputStream is = proc.getInputStream()) {
          res = IOUtils.readAll(is);
        }
        proc.waitFor(10, TimeUnit.SECONDS);
        final int exitCode = proc.exitValue();
        if (exitCode != 0) {
          // Unexpected return code, assume no Maple is available
          mMapleVersion = "";
        } else {
          final int versionPos = res.indexOf(VERSION_TAG);
          if (!res.contains("Maple") || versionPos < 0) {
            // Does not look like Maple output
            mMapleVersion = "";
          } else {
            final int start = versionPos + VERSION_TAG.length();
            int k = start + 1;
            while (k < res.length() && !Character.isWhitespace(res.charAt(k))) {
              ++k;
            }
            mMapleVersion = res.substring(start, k);
            if (mVerbose) {
              StringUtils.message("Found Maple version: " + mMapleVersion);
            }
          }
        }
        pb.redirectErrorStream(true);
      } catch (final IOException | InterruptedException e) {
        // Something went wrong, assume no Maple is available
        mMapleVersion = "";
      }
    }
    return !mMapleVersion.isEmpty();
  }

  @Override
  public Sequence getSequence(final String aNumber) {
    if (aNumber.length() != 7) {
      return null;
    }
    if (!isMapleAvailable()) {
      return null; // no Maple
    }
    final File path = new File(new File(new File(PROG_ROOT, "maple"), "a" + aNumber.substring(1, 4)), aNumber + ".m");
    if (!path.exists() || !path.isFile()) {
      if (mVerbose) {
        StringUtils.message("No implementation was found at " + path);
      }
      return null; // No Maple program for the sequence exists
    }
    final String mapleProgram;
    try {
      // mapleProgram = Pattern.quote(IOUtils.readAll(path));
      mapleProgram = IOUtils.readAll(path);
      if (mVerbose) {
        StringUtils.message("Program sent to Maple:\n" + mapleProgram);
      }
    } catch (final IOException e) {
      if (mVerbose) {
        StringUtils.message("Failed to read: " + path);
      }
      return null; // Failed to read the Maple program
    }
    return new MapleSequence(mapleProgram);
  }
}
