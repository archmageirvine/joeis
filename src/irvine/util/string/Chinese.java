package irvine.util.string;

/**
 * Chinese related string functions.
 * @author Sean A. Irvine
 */
public final class Chinese extends AbstractLanguage {

  /** Instance. */
  public static final Chinese SINGLETON = new Chinese();

  private Chinese() { }

  private static final String[] M_DIGITS = {
    "\u96f6", "\u4e00", "\u4e8c", "\u4e09", "\u56db", "\u4e94", "\u516d", "\u4e03", "\u516b", "\u4e5d", "\u5341",
  };

  @Override
  public String toText(int x) {
    if (x < 0 || x >= 100000) {
      throw new UnsupportedOperationException();
    }
    if (x < M_DIGITS.length) {
      return M_DIGITS[x];
    }
    // Special case
    if (x == 100) {
      return "\u4e00\u767e";
    }
    final StringBuilder sb = new StringBuilder();
    if (x >= 10000) {
      sb.append(M_DIGITS[x / 10000]).append('\u4e07');
      x %= 10000;
    }
    if (x >= 1000) {
      if (x / 1000 > 1) {
        sb.append(M_DIGITS[x / 1000]);
      }
      sb.append('\u5343');
      x %= 1000;
    }
    if (x >= 100) {
      if (x / 100 > 1) {
        sb.append(M_DIGITS[x / 100]);
      }
      sb.append('\u767e');
      x %= 100;
    }
    if (x >= 10) {
      if (x / 10 > 1) {
        sb.append(M_DIGITS[x / 10]);
      }
      sb.append('\u5341');
      x %= 10;
    }
    if (x != 0) {
      sb.append(M_DIGITS[x]);
    }
    return sb.toString();
  }
}
