package irvine.util.string;

/**
 * Finnish related string functions.
 * @author Sean A. Irvine
 */
public final class Finnish extends AbstractLanguage {

  /** Instance. */
  public static final Finnish SINGLETON = new Finnish();

  private Finnish() { }

  // various strings used to writing numbers
  private static final String[] M_DIGITS = {
    "nolla", "yksi", "kaksi", "kolme", "nelj\u00E4", "viisi", "kuusi", "seitsem\u00E4n",
    "kahdeksan", "yhdeks\u00E4n", "kymmenen", "yksitoista", "kaksitoista",
    "kolmetoista", "nelj\u00E4toista", "viisitoista", "kuusitoista", "seitsem\u00E4ntoista",
    "kahdeksantoista", "yhdeks\u00E4ntoista",
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
    if (x == 100) {
      return "sata";
    }
    if (x == 1000) {
      return "tuhat";
    }
    if (x >= 10000) {
      throw new UnsupportedOperationException();
    }
    final StringBuilder sb = new StringBuilder();
    if (x >= 1000) {
      final int d = x / 1000;
      if (d > 1) {
        sb.append(M_DIGITS[d]);
      }
      sb.append("tuhatta");
      x %= 1000;
    }
    if (x >= 100) {
      final int d = x / 100;
      if (d > 1) {
        sb.append(M_DIGITS[d]);
      }
      sb.append("sataa");
      x %= 100;
    }
    if (x >= 20) {
      final int d = x / 10;
      sb.append(M_DIGITS[d]).append("kymment\u00E4");
      x %= 10;
    }
    if (x != 0) {
      sb.append(M_DIGITS[x]);
    }
    return sb.toString();
  }

}
