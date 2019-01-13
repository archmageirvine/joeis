package irvine.util.string;

/**
 * Polish related string functions.
 *
 * @author Sean A. Irvine
 */
public final class Polish {

  private Polish() { }

  private static final String[] SMALL = {
    "zero",
    "jeden",
    "dwa",
    "trzy",
    "cztery",
    "pi\u0119\u0107",
    "sze\u015b\u0107",
    "siedem",
    "osiem",
    "dziewi\u0119\u0107",
    "dziesi\u0119\u0107",
    "jedena\u015bcie",
    "dwana\u015bcie",
    "trzyna\u015bcie",
    "czterna\u015bcie",
    "pi\u0119tna\u015bcie",
    "szesna\u015bcie",
    "siedemna\u015bcie",
    "osiemna\u015bcie",
    "dziewi\u0119tna\u015bcie"
  };

  private static final String[] TENS = {
    null,
    null,
    "dwadzie\u015bcia",
    "trzydzie\u015bci",
    "czterdzie\u015bci",
    "pi\u0119\u0107dziesi\u0105t",
    "sze\u015b\u0107dziesi\u0105t",
    "siedemdziesi\u0105t",
    "osiemdziesi\u0105t",
    "dziewi\u0119\u0107dziesi\u0105t",
  };

  private static final String[] HUNDREDS = {
    null,
    "sto",
    "dwie\u015bcie",
    "trzysta",
    "czterysta",
    "pi\u0119\u0107set",
    "sze\u015b\u0107set",
    "siedemset",
    "osiemset",
    "dziewi\u0119\u0107set",
  };

  private static final String[] THOUSANDS = {
    null,
    "tysi\u0105c",
    "tysi\u0105ce",
    "tysi\u0105ce",
    "tysi\u0105ce",
    "tysi\u0119cy",
    "tysi\u0119cy",
    "tysi\u0119cy",
    "tysi\u0119cy",
    "tysi\u0119cy",
  };

  /**
   * Return a Polish string representing the supplied integer value.
   *
   * @param x number to convert
   * @return Polish text representation
   */
  public static String toPolish(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "tysi\u0105c";
      }
      if (x < 2000) {
        return "tysi\u0105c " + toPolish(x % 1000);
      } else if (x % 1000 != 0) {
        return toPolish(x / 1000) + " " + THOUSANDS[x / 1000] + " " + toPolish(x % 1000);
      } else {
        return toPolish(x / 1000) + " " + THOUSANDS[x / 1000];
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "sto";
      }
      if (x < 200) {
        return "sto " + toPolish(x % 100);
      } else if (x % 100 != 0) {
        return HUNDREDS[x / 100] + " " + toPolish(x % 100);
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
    return TENS[tens] + SMALL[units];
  }

}
