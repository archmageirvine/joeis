package irvine.util.string;

/**
 * Esperanto related string functions.
 * @author Sean A. Irvine
 */
public final class Esperanto extends AbstractLanguage {

  /** Instance. */
  public static final Esperanto SINGLETON = new Esperanto();

  private Esperanto() {
  }

  private static final String[] SMALL = {
    "nul", "unu", "du", "tri", "kvar", "kvin", "ses", "sep", "ok", "na\u016D"
  };
  private static final String[] TENS = {
    null, "dek", "dudek", "tridek", "kvardek", "kvindek", "sesdek", "sepdek", "okdek", "na\u016Ddek"
  };
  private static final String[] HUNDREDS = {
    null, "cent", "ducent", "tricent", "kvarcent", "kvincent", "sescent", "sepcent", "okcent", "na\u016Dcent"
  };

  @Override
  public String toText(final int x) {
    if (x >= 1000000) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      final int q = x / 1000;
      final int r = x % 1000;
      if (r == 0) {
        return q == 1 ? "mil" : toText(q) + " mil";
      } else {
        return q == 1 ? "mil " + toText(r) : toText(q) + " mil" + toText(r);
      }
    }
    if (x >= 100) {
      final int q = x / 100;
      final int r = x % 100;
      return r == 0 ? HUNDREDS[q] : HUNDREDS[q] + " " + toText(r);
    }
    if (x >= 10) {
      final int q = x / 10;
      final int r = x % 10;
      return r == 0 ? TENS[q] : TENS[q] + " " + toText(r);
    }
    return SMALL[x];
  }
}
