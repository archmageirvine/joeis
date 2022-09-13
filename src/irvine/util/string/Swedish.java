package irvine.util.string;

/**
 * Swedish related string functions.
 * @author Sean A. Irvine
 */
public class Swedish extends AbstractLanguage {

  /** Instance. */
  public static final Swedish SINGLETON = new Swedish();

  protected Swedish() { }

  private static final String[] SMALL = {
    "noll",
    "ett",
    "tv\u00E5",
    "tre",
    "fyra",
    "fem",
    "sex",
    "sju",
    "\u00E5tta",
    "nio",
    "tio",
    "elva",
    "tolv",
    "tretton",
    "fjorton",
    "femton",
    "sexton",
    "sjutton",
    "arton",
    "nitton",
    "tjugo",
  };

  static final String[] TENS = {
    null,
    null,
    "tjugo",
    "trettio",
    "fyrtio",
    "femtio",
    "sextio",
    "sjuttio",
    "\u00E5ttio",
    "nittio",
  };

  protected String[] small() {
    return SMALL;
  }

  @Override
  public String toText(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "tusen";
      }
      if (x < 2000) {
        return "ett tusen " + toText(x % 1000);
      } else if (x % 1000 != 0) {
        return toText(x / 1000) + " tusen " + toText(x % 1000);
      } else {
        return toText(x / 1000) + " tusen";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "hundra";
      }
      if (x < 200) {
        return "hundra " + toText(x % 100);
      } else if (x % 100 != 0) {
        return toText(x / 100) + " hundra " + toText(x % 100);
      } else {
        return toText(x / 100) + " hundra";
      }
    }
    if (x < small().length) {
      return small()[x];
    }
    final int tens = x / 10;
    final int units = x % 10;
    if (units == 0) {
      return TENS[tens];
    }
    return TENS[tens] + small()[units];
  }
}
