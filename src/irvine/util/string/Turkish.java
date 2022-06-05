package irvine.util.string;

/**
 * Danish related string functions.
 * @author Sean A. Irvine
 */
public final class Turkish extends AbstractLanguage {

  /** Instance. */
  public static final Turkish SINGLETON = new Turkish();

  private Turkish() { }

  private static final String[] SMALL = {
    "s\u0131f\u0131r",
    "bir",
    "iki",
    "\u00FC\u00E7",
    "d\u00F6rt",
    "be\u015F",
    "alt\u0131",
    "yedi",
    "sekiz",
    "dokuz",
  };

  private static final String[] TENS = {
    null,
    "on",
    "yirmi",
    "otuz",
    "k\u0131rk",
    "elli",
    "altm\u0131\u015F",
    "yetmi\u015F",
    "seksen",
    "doksan",
  };

  @Override
  public String toText(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "bin";
      }
      if (x % 1000 != 0) {
        return toText(x / 1000) + " bin " + toText(x % 1000);
      } else {
        return toText(x / 1000) + " bin";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "y\u00FCz";
      }
      if (x % 100 != 0) {
        return toText(x / 100) + " y\u00FCz " + toText(x % 100);
      } else {
        return toText(x / 100) + " y\u00FCz";
      }
    }
    if (x < SMALL.length) {
      return SMALL[x];
    }
    final int tens = x / 10;
    final int units = x % 10;
    if (units == 0) {
      return TENS[tens];
    }
    return SMALL[units] + " " + TENS[tens];
  }
}
