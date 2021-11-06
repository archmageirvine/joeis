package irvine.util.string;

/**
 * Catalan language related string functions.
 * @author Sean A. Irvine
 */
public final class Catalan extends AbstractLanguage {

  /** Instance. */
  public static final Catalan SINGLETON = new Catalan();

  private Catalan() { }

  // various strings used to writing numbers
  private static final String[] SMALL = {
    "zero", "un", "dos", "tres", "quatre", "cinc", "sis", "set", "vuit", "nou", "deu", "onze", "dotze", "tretze", "catorze", "quinze", "setze", "disset", "divuit", "dinou", "vint"
  };

  private static final String[] TENS = {
    null, null, "vint", "trenta", "quaranta", "cinquanta", "seixanta", "setanta", "vuitanta", "noranta", "cent"
  };

  @Override
  public String toText(int x) {
    if (x < 0 || x >= 1000) {
      throw new UnsupportedOperationException();
    }
    final StringBuilder sb = new StringBuilder();
    if (x > 100) {
      if (x >= 200) {
        sb.append(SMALL[x / 100]).append("-cents");
      } else {
        sb.append("cent");
      }
      x %= 100;
      if (x == 0) {
        return sb.toString();
      }
      sb.append(' ');
    }
    if (x < SMALL.length) {
      sb.append(SMALL[x]);
    } else {
      sb.append(TENS[x / 10]);
      if (x % 10 != 0) {
        sb.append(x < 30 ? "-i-" : "-").append(SMALL[x % 10]);
      }
    }
    return sb.toString();
  }
}
