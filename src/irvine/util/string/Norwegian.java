package irvine.util.string;

/**
 * Norwegian (Bokmal) related string functions.
 * @author Sean A. Irvine
 */
public class Norwegian extends AbstractLanguage {

  /** Instance. */
  public static final Norwegian SINGLETON = new Norwegian();

  protected Norwegian() { }

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

  static final String[] TENS = {
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
        if (x % 1000 >= 100) {
          return toText(x / 1000) + " tusen " + toText(x % 1000);
        } else {
          return toText(x / 1000) + " tusen og " + toText(x % 1000);
        }
      } else {
        return toText(x / 1000) + " tusen";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "hundre";
      }
      if (x < 200) {
        return "hundre og " + toText(x % 100);
      } else if (x % 100 != 0) {
        return toText(x / 100) + " hundre og " + toText(x % 100);
      } else {
        return toText(x / 100) + " hundre";
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
