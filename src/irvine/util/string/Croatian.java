package irvine.util.string;

/**
 * Serbo-Croatian related string functions.
 * @author Sean A. Irvine
 */
public final class Croatian extends AbstractLanguage {

  /** Instance. */
  public static final Croatian SINGLETON = new Croatian();

  private Croatian() { }

  private static final String[] M_DIGITS = {
    "nula",
    "jedan",
    "dva",
    "tri",
    "\u010Detiri",
    "pet",
    "\u0161est",
    "sedam",
    "osam",
    "devet",
    "deset",
    "jedanaest",
    "dvanaest",
    "trinaest",
    "\u010Detrnaest",
    "petnaest",
    "\u0161esnaest",
    "sedamnaest",
    "osamnaest",
    "devetnaest",
  };

  private static final String[] M_TENS = {
    null, null, "dvadeset", "trideset", "\u010Detrdeset", "pedeset", "\u0161ezdeset", "sedamdeset", "osamdeset", "devedeset"
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
      sb.append(d == 1 ? "" : M_DIGITS[d]).append(' ').append("tisu\u0107u");
      x %= 1000;
    }
    if (x >= 100) {
      final int d = x / 100;
      sb.append(d == 1 ? "" : M_DIGITS[d]).append(' ').append("stotine");
      x %= 100;
    }
    if (x >= M_DIGITS.length) {
      final int d = x / 10;
      x %= 10;
      sb.append(M_TENS[d]);
      if (x > 0) {
        sb.append(M_DIGITS[x]);
      }
    } else if (x != 0) {
      sb.append(M_DIGITS[x]);
    }
    return sb.toString();
  }

}
