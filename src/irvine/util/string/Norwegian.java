package irvine.util.string;

/**
 * Norwegian (Bokmal) related string functions.
 *
 * @author Sean A. Irvine
 */
public final class Norwegian {

  private Norwegian() { }

  private static final String[] SMALL = {
    "null",
    "\u00e9n",
    "to",
    "tre",
    "fire",
    "fem",
    "seks",
    "sju",
    "\u00e5tte",
    "ni",
    "ti",
    "elleve",
    "tolv",
    "tretten",
    "fjorten",
    "femten",
    "seksten",
    "sytten",
    "atten",
    "nitten"
  };

  private static final String[] TENS = {
    null,
    null,
    "tjue",
    "tretti",
    "f\u00f8rti",
    "femti",
    "seksti",
    "sytti",
    "\u00e5tti",
    "nitti"
  };

  /**
   * Return a Norwegian string representing the supplied integer value.
   *
   * @param x number to convert
   * @return Norwegian text representation
   */
  public static String toNorwegian(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "tusen";
      }
      if (x < 2000) {
        return "ett tusen " + toNorwegian(x % 1000);
      } else if (x % 1000 != 0) {
        if (x % 1000 >= 100) {
          return toNorwegian(x / 1000) + " tusen " + toNorwegian(x % 1000);
        } else {
          return toNorwegian(x / 1000) + " tusen og " + toNorwegian(x % 1000);
        }
      } else {
        return toNorwegian(x / 1000) + " tusen";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "hundre";
      }
      if (x < 200) {
        return "hundre og " + toNorwegian(x % 100);
      } else if (x % 100 != 0) {
        return toNorwegian(x / 100) + " hundre og " + toNorwegian(x % 100);
      } else {
        return toNorwegian(x / 100) + " hundre";
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
