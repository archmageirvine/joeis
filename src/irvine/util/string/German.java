package irvine.util.string;

/**
 * German related string functions.
 *
 * @author Sean A. Irvine
 */
public final class German {

  private German() { }

  private static final String[] M_DIGITS = {
    "null", "eins", "zwei", "drei", "vier", "f\u00FCnf", "sechs", "sieben", "acht",
    "neun", "zehn", "elf", "zw\u00F6lf", "dreizehn", "vierzehn", "f\u00FCnfzehn",
    "sechzehn", "siebzehn", "achtzehn", "neunzehn"
  };

  private static final String[] M_TENS = {
    null, "zehn", "zwanzig", "drei\u00DFig", "vierzig", "f\u00FCnfzig", "sechzig",
    "siebzig", "achtzig", "neunzig"
  };

  /**
   * Return an German string representing the supplied integer value.
   *
   * @param x number to convert
   * @return German text representation
   */
  public static String toGerman(int x) {
    if (x < 0) {
      throw new UnsupportedOperationException();
    }
    // quick exit for small numbers
    if (x < M_DIGITS.length) {
      return M_DIGITS[x];
    }
    if (x >= 10000) {
      throw new UnsupportedOperationException();
    }
    final StringBuilder sb = new StringBuilder();
    if (x >= 1000) {
      final int d = x / 1000;
      sb.append(d == 1 ? "ein" : M_DIGITS[d]).append("tausend");
      x %= 1000;
    }
    if (x >= 100) {
      final int d = x / 100;
      sb.append(d == 1 ? "ein" : M_DIGITS[d]).append("hundert");
      x %= 100;
    }
    if (x >= 20) {
      final int d = x / 10;
      x %= 10;
      if (x > 0) {
        sb.append(x == 1 ? "ein" : M_DIGITS[x]).append("und");
      }
      sb.append(M_TENS[d]);
    } else if (x != 0) {
      sb.append(M_DIGITS[x]);
    }
    return sb.toString();
  }

}
