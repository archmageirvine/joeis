package irvine.util.string;

/**
 * English related string functions.
 *
 * @author Sean A. Irvine
 */
public final class English {

  private English() { }

  // various strings used to writing numbers
  private static final String[] M_DIGITS = {
    "zero", "one", "two", "three", "four", "five", "six",
    "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
    "sixteen", "seventeen", "eighteen", "nineteen"
  };

  private static final String[] M_TENS = {
    null, "ten", "twenty", "thirty", "forty", "fifty",
    "sixty", "seventy", "eighty", "ninety"
  };

  /**
   * Return an English string representing the supplied integer value. For
   * numbers in the range -20000000 &lt; x &lt; 20000000 the returned string will be a
   * textual representation of the number. For larger values the supplied int is
   * returned as a numerical string.
   *
   * @param x number to convert
   * @return English text representation
   */
  public static String toEnglish(int x) {
    final StringBuilder b = new StringBuilder();
    if (x < 0) {
      b.append("negative ");
      x = -x;
    }
    // quick exit for small numbers
    if (x < M_DIGITS.length) {
      b.append(M_DIGITS[x]);
      return b.toString();
    }
    // for very large numbers just exit with a numerical string
    if (x > 19999999) {
      return b.append(String.valueOf(x)).toString();
    }
    // x>=20 && x <= 19000000
    if (x >= 1000000) {
      final int d = x / 1000000;
      x %= 1000000;
      b.append(M_DIGITS[d]).append(" million ");
    }

    // x>=0 && x<1000000
    if (x >= 1000) {
      if (x >= 100000) {
        final int d = x / 100000;
        x %= 100000;
        b.append(M_DIGITS[d]).append(" hundred ");
        if (x / 1000 != 0) {
          b.append("and ");
        }
      }

      // x>=0 && x<1000000
      int d = x / 1000;
      x %= 1000;
      if (d == 0) {
        b.append("thousand ");
      } else if (d < 20) {
        b.append(M_DIGITS[d]).append(" thousand ");
      } else {
        b.append(M_TENS[d / 10]);
        d %= 10;
        if (d != 0) {
          b.append('-').append(M_DIGITS[d]);
        }
        b.append(" thousand ");
      }
    }

    // x>=0 && x<1000
    if (x >= 100) {
      final int d = x / 100;
      x %= 100;
      b.append(M_DIGITS[d]).append(" hundred ");
    }

    if (x != 0) {
      if (b.length() != 0 && !"negative ".equals(b.toString())) {
        b.append("and ");
      }
      // x>0 && x<100
      if (x < 20) {
        b.append(M_DIGITS[x]);
      } else {
        final int d = x / 10;
        x %= 10;
        b.append(M_TENS[d]);
        if (x != 0) {
          b.append('-').append(M_DIGITS[x]);
        }
      }
    }

    return b.toString().trim();
  }

  /**
   * Return an English string representing the supplied integer value. For
   * numbers in the range 0 &lt;= x &lt; 20000000 the returned string will be a
   * textual representation of the number. Differs from <code>toEnglish</code> in that
   * all spaces, hyphens, etc. are omitted.
   *
   * @param x number to convert
   * @return English text representation
   */
  public static String toRawEnglish(int x) {
    final StringBuilder b = new StringBuilder();
    if (x < 0 || x > 19999999) {
      throw new UnsupportedOperationException();
    }
    // quick exit for small numbers
    if (x < M_DIGITS.length) {
      b.append(M_DIGITS[x]);
      return b.toString();
    }
    // x>=20 && x <= 19000000
    if (x >= 1000000) {
      final int d = x / 1000000;
      x %= 1000000;
      b.append(M_DIGITS[d]).append("million");
    }

    // x>=0 && x<1000000
    if (x >= 1000) {
      if (x >= 100000) {
        final int d = x / 100000;
        x %= 100000;
        b.append(M_DIGITS[d]).append("hundred");
      }

      // x>=0 && x<1000000
      int d = x / 1000;
      x %= 1000;
      if (d == 0) {
        b.append("thousand");
      } else if (d < 20) {
        b.append(M_DIGITS[d]).append("thousand");
      } else {
        b.append(M_TENS[d / 10]);
        d %= 10;
        if (d != 0) {
          b.append(M_DIGITS[d]);
        }
        b.append("thousand");
      }
    }

    // x>=0 && x<1000
    if (x >= 100) {
      final int d = x / 100;
      x %= 100;
      b.append(M_DIGITS[d]).append("hundred");
    }

    if (x != 0) {
      // x>0 && x<100
      if (x < 20) {
        b.append(M_DIGITS[x]);
      } else {
        final int d = x / 10;
        x %= 10;
        b.append(M_TENS[d]);
        if (x != 0) {
          b.append(M_DIGITS[x]);
        }
      }
    }
    return b.toString().trim();
  }

  /**
   * Print numbers.
   *
   * @param args numerical values
   */
  public static void main(final String[] args) {
    for (final String s : args) {
      System.out.println(toEnglish(Integer.parseInt(s)));
    }
  }
}
