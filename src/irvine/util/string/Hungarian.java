package irvine.util.string;

/**
 * Hungarian related string functions.
 * @author Sean A. Irvine
 */
public final class Hungarian extends AbstractLanguage {

  /** Instance. */
  public static final Hungarian SINGLETON = new Hungarian();

  private Hungarian() { }

  private static final String[] M_DIGITS = {
    "nulla", "egy", "kett\u00F6", "h\u00E1rom", "n\u00E9gy", "\u00F6t", "hat", "h\u00E9t", "nyolc", "kilenc", "t\u00EDz"
  };

  private static final String[] M_TENS = {
    null, "t\u00EDzen", "huszon", "harminc", "negyven", "\u00F6tven", "hatvan", "hetven", "nyolcvan", "kilencven"
  };

  @Override
  public String toText(int x) {
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
      sb.append(d == 1 ? "" : M_DIGITS[d]).append("ezer");
      x %= 1000;
      if (x != 0) {
        sb.append(" \u00E9s ");
      }
    }
    if (x >= 100) {
      final int d = x / 100;
      sb.append(d == 1 ? "" : M_DIGITS[d]).append("sz\u00E1z");
      x %= 100;
    }
    if (x >= 10) {
      final int d = x / 10;
      x %= 10;
      if (x == 0 && d == 2) {
        sb.append("h\u00FAsz");
      } else {
        sb.append(M_TENS[d]);
        if (x > 0) {
          sb.append(M_DIGITS[x]);
        }
      }
    } else if (x != 0) {
      sb.append(M_DIGITS[x]);
    }
    return sb.toString();
  }

}
