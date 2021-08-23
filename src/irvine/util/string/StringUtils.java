package irvine.util.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Various string utility functions.
 *
 * @author Sean A. Irvine
 */
public final class StringUtils {

  private StringUtils() { }

  /**
   * A string comprising of the same character repeated a number of times.
   * @param c character to repeat
   * @param count number of instances
   * @return string with repeated character
   */
  public static String rep(final char c, final int count) {
    if (count < 0) {
      throw new IllegalArgumentException();
    }
    final char[] s = new char[count];
    Arrays.fill(s, c);
    return new String(s);
  }

  /**
   * Test if the given string is a palindrome.
   * @param word string to test
   * @return true if is a palindrome
   */
  public static boolean isPalindrome(final CharSequence word) {
    if (word != null) {
      final int len = word.length();
      for (int i = 0, j = len - 1; i < len >>> 1; ++i, --j) {
        if (word.charAt(i) != word.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Convenience method to convert any iterable in a string with glue separating
   * the elements.
   * @param it iterable type
   * @param glue what to stick between elements
   * @param <T> type of iterable element
   * @return string representation
   */
  public static <T> String toString(final Iterable<T> it, final String glue) {
    final StringBuilder sb = new StringBuilder();
    for (final T item : it) {
      if (sb.length() > 0) {
        sb.append(glue);
      }
      sb.append(item);
    }
    return sb.toString();
  }
  
  private static final String VALID_HEX = "0123456789ABCDEFabcdef";

  /**
   * Test if a string token looks like a hexadecimal specification.
   * @param token string to test
   * @return true if the string is likely a hexadecimal number
   */
  public static boolean isHexadecimal(final String token) {
    if (token.startsWith("0x") || token.startsWith("0X")) {
      if (token.length() > 2) {
        for (int k = 2; k < token.length() - 1; ++k) {
          if (VALID_HEX.indexOf(token.charAt(k)) == -1) {
            return false;
          }
        }
        final int c = token.charAt(token.length() - 1);
        return VALID_HEX.indexOf(c) != -1 || c == 'L' || c == 'l';
      }
    } else {
      boolean sawDigit = false;
      for (int k = 0; k < token.length(); ++k) {
        final char c = token.charAt(k);
        sawDigit |= Character.isDigit(c);
        if (VALID_HEX.indexOf(c) == -1) {
          return false;
        }
      }
      return sawDigit;
    }
    return false;
  }

  /**
   * Print a dated message on standard output.
   * @param message message to print
   */
  public static void message(final String message) {
    System.out.println(Date.now() + message);
  }

  /**
   * Print a dated message on standard error.
   * @param message message to print
   */
  public static void warning(final String message) {
    System.err.println(Date.now() + message);
  }

  /**
   * Read strings from given input stream.
   *
   * @param is input stream
   * @param casing what casing should be applied
   * @return the strings
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static List<String> suckInWords(final InputStream is, final Casing casing) throws IOException {
    final List<String> res = new ArrayList<>();
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = r.readLine()) != null) {
        res.add(casing.apply(line));
      }
    }
    return res;
  }

  /**
   * Read strings from given input stream.
   *
   * @param file file containing strings
   * @param casing what casing should be applied
   * @return the strings
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static List<String> suckInWords(final File file, final Casing casing) throws IOException {
    try (final InputStream is = new FileInputStream(file)) {
      return suckInWords(is, casing);
    }
  }

  /**
   * Read strings from given input stream.
   *
   * @param file file containing strings
   * @param casing what casing should be applied
   * @return the strings
   * @throws java.io.IOException if an I/O error occurs.
   */
  public static List<String> suckInWords(final String file, final Casing casing) throws IOException {
    return suckInWords(new File(file), casing);
  }

  /**
   * Return a bit-packed syndrome representing the letters occurring in a string. Bit 0
   * is set if the string contains an <code>a</code> or <code>A</code>, but 1 is set
   * if the string contains a <code>b</code> or <code>B</code>, and so on, through to
   * bit 25 is the string contains a <code>z</code> or <code>Z</code>.  Thus, the
   * largest possible result is <code>2^26-1</code>.
   * @param s string to compute syndrome of
   * @return syndrome
   */
  public static int syndrome(final String s) {
    int syndrome = 0;
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (c >= 'a' && c <= 'z') {
        syndrome |= 1 << (c - 'a');
      } else if (c >= 'A' && c <= 'Z') {
        syndrome |= 1 << (c - 'A');
      }
    }
    return syndrome;
  }

  /**
   * Return a sane representation of a string with all whitespace converted to spaces
   * and other unprintable characters converted o <code>?</code>.
   * @param s string to sanitize
   * @return clean string
   */
  public static String sane(final String s) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final char c = s.charAt(k);
      if (Character.isWhitespace(c)) {
        sb.append(' ');
      } else if (Character.isISOControl(c)) {
        sb.append('?');
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  /**
   * Test if the string is composed entirely of uppercase Latin letters.
   * @param word the string
   * @return true iff composed entirely of uppercase Latin letters
   */
  public static boolean is26Upper(final String word) {
    for (int k = 0; k < word.length(); ++k) {
      final char c = word.charAt(k);
      if (c < 'A' || c > 'Z') {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the supplied string is square free.
   * @param s string to test
   * @return true iff string is square free
   */
  public static boolean isSquareFreeWord(final String s) {
    // Assumes that s[1] .. s[length - 1] is already square free
    for (int k = 1; k <= s.length() / 2; ++k) {
      if (s.substring(k).startsWith(s.substring(0, k))) {
        return false;
      }
    }
    return true;
  }

  private static boolean isMatch(final String v, int k, int j, final int l) {
    for (int i = 0; i < l; ++i) {
      if (v.charAt(--k) != v.charAt(--j)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Test if the supplied string is cube free.
   * @param s string to test
   * @return true iff string is cube free
   */
  public static boolean isCubeFreeWord(final String v) {
    for (int k = 3; k <= v.length(); ++k) {
      for (int j = 1; j <= k / 3; ++j) {
        if (isMatch(v, k, k - j, 2 * j)) {
          return false;
        }
      }
    }
    return true;
  }
}
