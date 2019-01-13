package irvine.util.string;

import java.util.Locale;

/**
 * Parse strings representing Roman numerals.  Tries to be fairly
 * lenient on what is accepted.
 *
 * @author Sean A. Irvine
 */
public final class Roman {

  private Roman() { }

  private static final String RANK = "IVXLCDM";
  private static final int[] VALUE = {1, 5, 10, 50, 100, 500, 1000};

  /**
   * Parse a Roman numeral.
   *
   * @param roman Roman numeral
   * @return value
   */
  public static int parse(final String roman) {
    int v = 0;
    final String uc = roman.toUpperCase(Locale.getDefault());
    final int rlen = roman.length();
    for (int k = 0; k < rlen; ++k) {
      final int r = RANK.indexOf(uc.charAt(k));
      if (r == -1) {
        throw new IllegalArgumentException(roman);
      }
      final int t = VALUE[r];
      if (k != rlen - 1 && RANK.indexOf(uc.charAt(k + 1)) > r) {
        // Subtractive principle
        v -= t;
      } else {
        v += t;
      }
    }
    return v;
  }

  private static final String S = "M2D5C2L5X2V5I";

  /**
   * Convert a number to Roman numerals.
   *
   * @param number number to convert
   * @return Roman representation
   */
  public static String roman(final int number) {
    int n = number;
    int v = 1000;
    int j = 0;
    final StringBuilder sb = new StringBuilder();
    while (true) {
      while (n >= v) {
        sb.append(S.charAt(j));
        n -= v;
      }
      if (n <= 0) {
        return sb.toString();
      }
      int k = j + 2;
      int u = v / (S.charAt(k - 1) - '0');
      if (S.charAt(k - 1) == '2') {
        k += 2;
        u /= S.charAt(k - 1) - '0';
      }
      if (n + u >= v) {
        sb.append(S.charAt(k));
        n += u;
      } else {
        j += 2;
        v /= S.charAt(j - 1) - '0';
      }
    }
  }

  /**
   * Print Roman numerals for an integer.
   * @param args values
   */
  public static void main(final String... args) {
    for (final String s : args) {
      System.out.println(s + " " + roman(Integer.parseInt(s)));
    }
  }
}
