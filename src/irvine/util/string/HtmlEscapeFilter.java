package irvine.util.string;

import irvine.util.io.IOUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Utility method to replace HTML and XML character escapes with the
 * corresponding Unicode characters. The presence of such sequences in
 * a string usually indicates a poor choice of Reader during the
 * construction of the string. However, such constructions do
 * occasionally appear in other files, for example in C or C++ code
 * variable declarations like <code>&amp;pointer;</code> are possible.
 *
 * @author Sean A. Irvine
 */
public final class HtmlEscapeFilter {

  /** Prevent instantiation of this class */
  private HtmlEscapeFilter() { }

  /** Stores the replacement versions of HTML escape sequences. */
  private static HashMap<String, String> sReplacements = null;

  /** Handle Unicode escapes in a string. */
  private static String handleUnicodeEscapes(String s) {
    if (s == null || s.length() < 2) {
      return s;
    }
    try {
      int u;
      while ((u = s.indexOf("\\u")) != -1) {
        final char v = (char) Integer.parseInt(s.substring(u + 2, u + 6), 16);
        s = s.substring(0, u) + v + s.substring(u + 6);
      }
    } catch (final StringIndexOutOfBoundsException e) {
      throw new RuntimeException(e);
    }
    return s;
  }

  /** Initialize the table of escape codes and replacements. */
  private static void init() {
    sReplacements = new HashMap<>();
    sReplacements.put("sp", " ");
    try {
      try (final BufferedReader s = IOUtils.reader("irvine/util/string/htmlaccents.dat")) {
        String line;
        while ((line = s.readLine()) != null) {
          if (line.isEmpty() || line.startsWith("#")) {
            // ignore empty lines and comment lines
            continue;
          }
          final int splitPoint = line.indexOf(' ');
          if (splitPoint != -1) {
            sReplacements.put(line.substring(0, splitPoint), handleUnicodeEscapes(line.substring(splitPoint + 1)));
          }
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }


  /** Remaps hex specified codes to Unicode where they are different */
  private static final char[] SPECIAL_MICROSOFT_REMAPPING = new char[]{
      '\u0081', '\u201A', '\u0192', '\u201E', '\u2026', '\u2020',
      '\u2021', '\u0088', '\u2030', '\u0160', '\u2039', '\u0152',
      '\u008D', '\u008E', '\u008F', '\u0090', '\u2018', '\u2019',
      '\u201C', '\u201D', '\u2022', '\u2013', '\u2014', '\u0303',
      '\u2122', '\u0161', '\u203A', '\u0153', '\u009D', '\u009E',
      '\u0178',
    };


  /**
   * Replace HTML special characters; i.e. <code>&amp;[A-Za-z]*;</code>
   * with their Unicode equivalent
   *
   * @param s string to replace characters in
   * @return string with accents removed
   */
  public static synchronized String replace(final String s) {
    if (s == null) {
      return s;
    }
    int p;
    int oldp = 0;

    // check there is at least one such accent, if not return immediately
    if ((p = s.indexOf('&')) == -1) {
      return s;
    }

    // if table is not yet initialized then do so now
    if (sReplacements == null) {
      init();
    }

    final StringBuilder sb = new StringBuilder();
    try {
      while (p != -1) {
        final char c1 = s.charAt(p + 1);
        if (c1 == '#' && Character.isDigit(s.charAt(p + 2))) {
          // test for and handle &#nnn; forms

          // try and find ;
          int lengthLimiter = 2; // at most two more digits
          int endSeq = p + 3;
          char c;
          while (Character.isDigit(c = s.charAt(endSeq)) && lengthLimiter-- > 0) {
            endSeq += 1;
          }
          if (c == ';') {
            // bingo found &[0-9]+; --  match against hashtable
            // following parse will succeed we already verified digits
            int v = Integer.parseInt(s.substring(p + 2, endSeq));
            if (v >= 0 && v < 256) {
              if (v >= 0x81 && v <= 0x9F) {
                v = SPECIAL_MICROSOFT_REMAPPING[v - 0x81];
              }
              // append everything up to but excluding the &
              if (p > oldp) {
                sb.append(s.substring(oldp, p));
              }
              // append the replacement text
              sb.append((char) v);
              p = endSeq;
              oldp = p + 1;
            }
          }
        } else if (Character.isLetter(c1) && Character.isLetter(s.charAt(p + 2))) {
          // if we get here, then we found &[A-Za-z][A-Za-z]

          // try and find ;
          int lengthLimiter = 9;
          int endSeq = p + 3;
          char c;
          while ((Character.isLetter(c = s.charAt(endSeq)) || Character.isDigit(c)) && lengthLimiter-- > 0) {
            endSeq += 1;
          }
          if (c == ';') {
            // bingo found &[A-Za-z]+; --  match against hashtable
            final String r = sReplacements.get(s.substring(p + 1, endSeq));
            if (r != null) {
              // append everything up to but excluding the &
              if (p > oldp) {
                sb.append(s.substring(oldp, p));
              }
              // append the replacement text
              sb.append(r);
              p = endSeq;
              oldp = p + 1;
            }
          }
        }
        p = s.indexOf('&', p + 1);
      }
    } catch (final StringIndexOutOfBoundsException e) {
      // can ignore this, it occurs when & occurs near end-of-string
    }
    // Append remaining string
    sb.append(s.substring(oldp));

    return sb.toString();
  }
}
