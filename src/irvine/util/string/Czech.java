package irvine.util.string;

/**
 * Czech related string functions.
 * @author Sean A. Irvine
 */
public final class Czech extends AbstractLanguage {

  /** Instance. */
  public static final Czech SINGLETON = new Czech();

  private Czech() { }

  private static final String[] SMALL = {
    "nula",
    "jeden",
    "dva",
    "t\u0159i",
    "\u010dty\u0159i",
    "p\u011bt",
    "\u0161est",
    "sedm",
    "osm",
    "dev\u011bt",
    "deset",
    "jeden\u00e1ct",
    "dvan\u00e1ct",
    "t\u0159in\u00e1ct",
    "\u010dtrn\u00e1ct",
    "patn\u00e1ct",
    "\u0161estn\u00e1ct",
    "sedmn\u00e1ct",
    "osmn\u00e1ct",
    "devaten\u00e1ct"
  };

  private static final String[] TENS = {
    null,
    null,
    "dvacet",
    "t\u0159icet",
    "\u010dty\u0159icet",
    "pades\u01cet",
    "\u0161edes\u00e1t",
    "sedmdes\u00e1t",
    "osmdes\u00e1t",
    "devades\u00e1t",
  };

  private static final String[] HUNDREDS = {
    null,
    "sto",
    "dv\u011b st\u011b",
    "t\u0159i sta",
    "\u010dty\u0159i sta",
    "p\u011bt set",
    "\u0161est set",
    "sedm set",
    "osm set",
    "dev\u011bt set",
  };

  private static final String[] THOUSANDS = {
    null,
    "tis\u00edc\u0105c",
    "tis\u00edce",
    "tis\u00edce",
    "tis\u00edce",
    "tis\u00edc",
    "tis\u00edc",
    "tis\u00edc",
    "tis\u00edc",
    "tis\u00edc",
  };

  @Override
  public String toText(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "tysi\u0105c";
      }
      if (x < 2000) {
        return "tysi\u0105c " + toText(x % 1000);
      } else if (x % 1000 != 0) {
        return toText(x / 1000) + " " + THOUSANDS[x / 1000] + " " + toText(x % 1000);
      } else {
        return toText(x / 1000) + " " + THOUSANDS[x / 1000];
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "sto";
      }
      if (x == 101) {
        return "sto jedna";
      }
      if (x < 200) {
        return "sto " + toText(x % 100);
      } else if (x % 100 != 0) {
        return HUNDREDS[x / 100] + " " + toText(x % 100);
      } else {
        return HUNDREDS[x / 100];
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
    return TENS[tens] + " " + SMALL[units];
  }

}
