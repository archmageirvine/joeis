package irvine.util.string;

/**
 * Various telephone related things.
 * Compute the letter sum of a word using the usual telephone encoding.
 * <code>2 = ABC, 3 = DEF, 4 = GHI, 5 = JKL, 6 = MNO, 7 = PQRS, 8 = TUV, 9 = WXYZ.</code>
 * @author Sean A. Irvine
 */
public final class Telephone {

  private Telephone() { }

  private static final int[] VALUE = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};

  /**
   * Return the number dialed for a given character.
   * @param c character to dial
   * @return number of the dial
   */
  public static int dial(final char c) {
    if (c >= 'A' && c <= 'Z') {
      return VALUE[c - 'A'];
    } else if (c >= 'a' && c <= 'z') {
      return VALUE[c - 'a'];
    } else if (c >= '0' && c <= '9') {
      return c - '0';
    } else {
      return -1;
    }
  }

  /**
   * Return the telephone number for a given string.  Characters which cannot be dialed
   * are ignored.
   * @param s string
   * @return telephone number
   */
  public static String dial(final String s) {
    if (s == null) {
      return null;
    }
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final int dial = dial(s.charAt(k));
      if (dial >= 0) {
        sb.append(dial);
      }
    }
    return sb.toString();
  }

  /**
   * Return the sum of numbers dialled for a particular string.
   * @param s string to dial
   * @return sum
   */
  public static int dialSum(final String s) {
    int sum = 0;
    for (int k = 0; k < s.length(); ++k) {
      final int c = dial(s.charAt(k));
      if (c > 0) {
        sum += c;
      }
    }
    return sum;
  }

}
