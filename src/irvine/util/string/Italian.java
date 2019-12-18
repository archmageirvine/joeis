package irvine.util.string;

/**
 * Italian related string functions.
 * @author Sean A. Irvine
 */
public final class Italian extends AbstractLanguage {

  /** Instance. */
  public static final Italian SINGLETON = new Italian();

  private Italian() { }

  private static final String[] SMALL = {
    "zero",
    "uno",
    "due",
    "tre",
    "quattro",
    "cinque",
    "sei",
    "sette",
    "otto",
    "nove",
    "dieci",
    "undici",
    "dodici",
    "tredici",
    "quattordici",
    "quindici",
    "sedici",
    "diciassette",
    "diciotto",
    "diciannove",
  };

  private static final String[] TENS = {
    null,
    null,
    "venti",
    "trenta",
    "quaranta",
    "cinquanta",
    "sessanta",
    "settanta",
    "ottanta",
    "novanta",
  };

  @Override
  public String toText(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "mille";
      }
      if (x < 2000) {
        return "mille " + toText(x % 1000);
      } else if (x % 1000 != 0) {
        return toText(x / 1000) + "mila " + toText(x % 1000);
      } else {
        return toText(x / 1000) + "mila";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "cento";
      }
      final int r = x % 100;
      final String small = r == 0 ? "" : toText(r);
      final String t = "cento" + (small.startsWith("o") && !"otto".equals(small) ? small.substring(1) : small);
      if (x < 200) {
        return t;
      } else {
        return SMALL[x / 100] + t;
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
    final String u = SMALL[units];
    final String t = TENS[tens];
    return isVowel(t.charAt(t.length() - 1)) && isVowel(u.charAt(0))
      ? t.substring(0, t.length() - 1) + u
      : t + u;
  }

  private static boolean isVowel(final char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

}
