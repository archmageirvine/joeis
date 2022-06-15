package irvine.oeis.producer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import irvine.oeis.Sequence;
import irvine.util.io.IOUtils;
import irvine.util.string.StringUtils;

/**
 * The standard Producer for sequences backed by a PARI implementation.
 * @author Sean A. Irvine
 */
public class PariProducer implements Producer {

  private static final String PARI_ROOT = System.getProperty("pari.root", "gp");
  static final String PARI_COMMAND = System.getProperty("pari.command", "gp");
  private static final String VERSION_TAG = "Version ";

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  // Set once on the first attempt to use PARI. An empty string indicates no Pari was found.
  private String mPariVersion = null;

  private boolean isPariAvailable() {
    if (mPariVersion == null) {
      // Do a one-off check to see if PARI is installed and try to determine
      // the version number of PARI.
      // PARI does have --version-short (which goes to standard output), but we
      // want to do some additional checking that the executable really is PARI.
      final ProcessBuilder pb = new ProcessBuilder(PARI_COMMAND, "--fast", "--version");
      try {
        final Process proc = pb.start();
        final String res;
        // PARI version information is on standard error
        try (final InputStream is = proc.getErrorStream()) {
          res = IOUtils.readAll(is);
        }
        proc.waitFor(10, TimeUnit.SECONDS);
        final int exitCode = proc.exitValue();
        if (exitCode != 0) {
          // Unexpected return code, assume no PARI is available
          mPariVersion = "";
        } else {
          final int versionPos = res.indexOf(VERSION_TAG);
          if (!res.contains("GP/PARI") || versionPos < 0) {
            // Does not look like PARI output
            mPariVersion = "";
          } else {
            final int start = versionPos + VERSION_TAG.length();
            int k = start + 1;
            while (k < res.length() && !Character.isWhitespace(res.charAt(k))) {
              ++k;
            }
            mPariVersion = res.substring(start, k);
            if (mVerbose) {
              StringUtils.message("Found PARI version: " + mPariVersion);
            }
          }
        }
      } catch (final IOException | InterruptedException e) {
        // Something went wrong, assume no PARI is available
        mPariVersion = "";
      }
    }
    return !mPariVersion.isEmpty();
  }

  @Override
  public Sequence getSequence(final String aNumber) {
    if (aNumber.length() != 7) {
      return null;
    }
    if (!isPariAvailable()) {
      return null; // no PARI
    }
    final File path = new File(new File(PARI_ROOT, "a" + aNumber.substring(1, 4)), aNumber + ".gp");
    if (!path.exists() || !path.isFile()) {
      return null; // No PARI program for the sequence exists
    }
    final String pariProgram;
    try {
      pariProgram = IOUtils.readAll(path);
    } catch (final IOException e) {
      if (mVerbose) {
        StringUtils.message("Failed to read: " + path);
      }
      return null; // Failed to read the PARI program
    }
    return new PariSequence(pariProgram);
  }
}
