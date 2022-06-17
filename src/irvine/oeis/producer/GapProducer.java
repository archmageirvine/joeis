package irvine.oeis.producer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import irvine.oeis.Sequence;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * The standard Producer for sequences backed by a GAP implementation.
 * @author Sean A. Irvine
 */
public class GapProducer implements Producer {

  private static final String PROG_ROOT = System.getProperty("prog.root", "prog");
  static final String GAP_COMMAND = System.getProperty("gap.command", "gap");
  private static final String VERSION_TAG = "Version ";

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  // Set once on the first attempt to use GAP. An empty string indicates no GAP was found.
  private String mGapVersion = null;

  private boolean isGapAvailable() {
    if (mGapVersion == null) {
      // Do a one-off check to see if GAP is installed and try to determine
      // the version number of GAP.
      // PARI does have --version-short (which goes to standard output), but we
      // want to do some additional checking that the executable really is GAP.
      final ProcessBuilder pb = new ProcessBuilder(GAP_COMMAND, "--help");
      try {
        final Process proc = pb.start();
        final String res;
        try (final InputStream is = proc.getErrorStream()) {
          res = IOUtils.readAll(is);
        }
        proc.waitFor(10, TimeUnit.SECONDS);
        final int exitCode = proc.exitValue();
        if (exitCode != 0) {
          // Unexpected return code, assume no GAP is available
          mGapVersion = "";
        } else {
          final int versionPos = res.indexOf(VERSION_TAG);
          if (!res.contains("gap") || versionPos < 0) {
            // Does not look like PARI output
            mGapVersion = "";
          } else {
            final int start = versionPos + VERSION_TAG.length();
            int k = start + 1;
            while (k < res.length() && !Character.isWhitespace(res.charAt(k))) {
              ++k;
            }
            mGapVersion = res.substring(start, k);
            if (mVerbose) {
              StringUtils.message("Found GAP version: " + mGapVersion);
            }
          }
        }
      } catch (final IOException | InterruptedException e) {
        // Something went wrong, assume no PARI is available
        mGapVersion = "";
      }
    }
    return !mGapVersion.isEmpty();
  }

  @Override
  public Sequence getSequence(final String aNumber) {
    if (aNumber.length() != 7) {
      return null;
    }
    if (!isGapAvailable()) {
      return null;
    }
    final File path = new File(new File(new File(PROG_ROOT, "gap"), "a" + aNumber.substring(1, 4)), aNumber + ".gap");
    if (!path.exists() || !path.isFile()) {
      if (mVerbose) {
        StringUtils.message("No implementation was found at " + path);
      }
      return null; // No GAP program for the sequence exists
    }
    final String gapProgram;
    try {
      gapProgram = IOUtils.readAll(path);
    } catch (final IOException e) {
      if (mVerbose) {
        StringUtils.message("Failed to read: " + path);
      }
      return null; // Failed to read the PARI program
    }
    return new GapSequence(gapProgram);
  }
}
