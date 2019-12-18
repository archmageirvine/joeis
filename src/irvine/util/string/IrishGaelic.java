package irvine.util.string;

/**
 * Irish Gaelic related string functions.
 * @author Sean A. Irvine
 */
public final class IrishGaelic extends AbstractLanguage {

  /** Instance. */
  public static final IrishGaelic SINGLETON = new IrishGaelic();

  private IrishGaelic() { }

  // various strings used to writing numbers
  private static final String[] M_DIGITS = {
    "n\u00E1id", "aon", "d\u00F3", "tr\u00ED", "ceathair", "c\u00FAig", "s\u00E9", "seacht", "ocht", "naoi", "deich",
    "aon d\u00E9ag", "d\u00F3 dh\u00E9ag",
  };

  private static final String[] TENS = {
    null, null, "fiche", "tr\u00EDocha", "ceathracha", "caoga", "seasca", "seacht\u00F3", "hoch\u00F3", "n\u00F3cha",
    "c\u00E9ad",
  };

  @Override
  public String toText(final int x) {
    if (x < 0) {
      throw new UnsupportedOperationException();
    }
    // quick exit for small numbers
    if (x < M_DIGITS.length) {
      return M_DIGITS[x];
    }
    if (x == 1000) {
      return "m\u00EDle";
    }
    if (x < 20) {
      return M_DIGITS[x - 10] + " d\u00E9ag";
    }
    if (x < 110) {
      final StringBuilder sb = new StringBuilder();
      final int u = x % 10;
      sb.append(TENS[x / 10]);
      if (u != 0) {
        sb.append(' ');
        if (u == 1 || u == 8) {
          sb.append('h');
        }
        sb.append(M_DIGITS[u]);
      }
      return sb.toString();
    }
    throw new UnsupportedOperationException();
  }

}
