package irvine.util.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import irvine.util.io.IOUtils;

/**
 * Convert UTF-8 encoded text to LaTeX.
 * @author Sean A. Irvine
 */
public final class UtfToLaTeX {

  private UtfToLaTeX() { }

  private static final HashMap<Character, String> REPLACEMENTS = new HashMap<>();

  static {
    try {
      try (final BufferedReader s = IOUtils.reader("irvine/util/string/latex.dat")) {
        String line;
        while ((line = s.readLine()) != null) {
          if (line.isEmpty() || line.startsWith("#")) {
            // ignore empty lines and comment lines
            continue;
          }
          final int splitPoint = line.indexOf(' ');
          if (splitPoint != -1) {
            REPLACEMENTS.put((char) Integer.parseInt(line.substring(0, splitPoint), 16), line.substring(splitPoint + 1));
          }
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Convert text of standard input into LaTeX formatted text.
   * @param args ignored
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
      String line;
      while ((line = r.readLine()) != null) {
        final StringBuilder sb = new StringBuilder();
        for (int k = 0; k < line.length(); ++k) {
          final char c = line.charAt(k);
          final String map = REPLACEMENTS.get(c);
          if (map == null) {
            sb.append(c);
          } else {
            sb.append(map);
          }
        }
        System.out.println(sb.toString());
      }
    }
  }
}
