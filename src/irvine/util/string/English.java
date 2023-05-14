package irvine.util.string;

/**
 * English related string functions.
 * @author Sean A. Irvine
 */
public final class English extends AbstractLanguage {

  /** Instance. */
  public static final English SINGLETON = new English();

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

  @Override
  public String toText(int x) {
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
    if (x >= 1000000000) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000000) {
      final int d = x / 1000000;
      b.append(x >= 20000000 ? toText(d) : M_DIGITS[d]).append(" million ");
      x %= 1000000;
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
   * Generate strings for ordinal numbers.
   * Apart from a few exceptions for small numbers,
   * "th" is appended to the cardinal number.
   * @param x number to be converted
   * @return the English word
   */
  public String toOrdinalText(final int x) {
    if (x <= 0) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000000000) {
      throw new UnsupportedOperationException();
    }
    final int digit1 = x % 10;
    final int digit10 = x % 100 - digit1;
    String ord = toText(x);
    if (digit10 == 10) { // ends with "1d"
      ord += "th"; // fourteenth
    } else {
      if (digit1 == 0) { // ends with "0"
        if (digit10 == 4) { // "40" 
          ord = ord.substring(0, ord.length() - 6) + "fortieth"; // fourthy, remove "u"
        } else if (digit10 != 0) {
          ord = ord.substring(0, ord.length() - 1) + "ieth"; // fifty -> fiftieth
        } else { // ends with "00"
          ord += "th"; // hundredth, thousandth, millionth...
        }
      } else { // ends with [1-9]
        switch (digit1) {
          case 1:
            ord = ord.substring(0, ord.length() - 3) + "first"; // |one
            break;
          case 2:
            ord = ord.substring(0, ord.length() - 3) + "second"; // |two
            break;
          case 3:
            ord = ord.substring(0, ord.length() - 3) + "ird"; // th|ree
            break;
          case 5:
            ord = ord.substring(0, ord.length() - 2) + "fth"; // fi|ve 
            break;
          case 8:
            ord = ord + "h"; // eigh|t
            break;
          case 9:
            ord = ord.substring(0, ord.length() - 1) + "th"; // nin|e
            break;
          default:
            ord += "th";
            break;
        }
      }
    }
    return ord.replace("twelveth", "twelfth");
  }

  @Override
  public String toRawText(int x) {
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
   * @param args numerical values
   */
  public static void main(final String[] args) {
    for (final String s : args) {
      System.out.println(SINGLETON.toText(Integer.parseInt(s)));
    }
  }
}
