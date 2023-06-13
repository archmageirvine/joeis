package irvine.util.string;

/**
 * Dutch related string functions.
 * @author Sean A. Irvine
 */
public final class Dutch extends AbstractLanguage {

  /** Instance. */
  public static final Dutch SINGLETON = new Dutch();

  private Dutch() {
  }

  // various strings used to writing numbers
  private static final String[] SMALL = {
    "nul",
    "een",
    "twee",
    "drie",
    "vier",
    "vijf",
    "zes",
    "zeven",
    "acht",
    "negen",
    "tien",
    "elf",
    "twaalf",
    "dertien",
    "veertien",
    "vijftien",
    "zestien",
    "zeventien",
    "achttien",
    "negentien",
    "twintig",
    "eenentwintig",
    "twee\u00EBntwintig",
    "drie\u00EBntwintig",
    "vierentwintig",
    "vijfentwintig",
    "zesentwintig",
    "zevenentwintig",
    "achtentwintig",
    "negenentwintig",
    "dertig",
    "eenendertig",
    "twee\u00EBndertig",
    "drie\u00EBndertig",
    "vierendertig",
    "vijfendertig",
    "zesendertig",
    "zevenendertig",
    "achtendertig",
    "negenendertig",
    "veertig",
    "eenenveertig",
    "twee\u00EBnveertig",
    "drie\u00EBnveertig",
    "vierenveertig",
    "vijfenveertig",
    "zesenveertig",
    "zevenenveertig",
    "achtenveertig",
    "negenenveertig",
    "vijftig",
    "eenenvijftig",
    "twee\u00EBnvijftig",
    "drie\u00EBnvijftig",
    "vierenvijftig",
    "vijfenvijftig",
    "zesenvijftig",
    "zevenenvijftig",
    "achtenvijftig",
    "negenenvijftig",
    "zestig",
    "eenenzestig",
    "twee\u00EBnzestig",
    "drie\u00EBnzestig",
    "vierenzestig",
    "vijfenzestig",
    "zesenzestig",
    "zevenenzestig",
    "achtenzestig",
    "negenenzestig",
    "zeventig",
    "eenenzeventig",
    "twee\u00EBnzeventig",
    "drie\u00EBnzeventig",
    "vierenzeventig",
    "vijfenzeventig",
    "zesenzeventig",
    "zevenenzeventig",
    "achtenzeventig",
    "negenenzeventig",
    "tachtig",
    "eenentachtig",
    "twee\u00EBntachtig",
    "drie\u00EBntachtig",
    "vierentachtig",
    "vijfentachtig",
    "zesentachtig",
    "zevenentachtig",
    "achtentachtig",
    "negenentachtig",
    "negentig",
    "eenennegentig",
    "twee\u00EBnnegentig",
    "drie\u00EBnnegentig",
    "vierennegentig",
    "vijfennegentig",
    "zesennegentig",
    "zevenennegentig",
    "achtennegentig",
    "negenennegentig",
  };

  private static String toDutch1(int x) {
    final StringBuilder sb = new StringBuilder();
    if (x >= 1000000) {
      final int d = x / 1000000;
      x %= 1000000;
      sb.append(toDutch1(d)).append(" miljoen");
      if (x == 0) {
        return sb.toString().trim();
      }
    }
    if (x == 1000) {
      sb.append("duizend");
      return sb.toString().trim();
    }
    if (x >= 2000 || (x >= 1000 && x < 1100)) {
      x %= 1000;
      sb.append("duizend");
      if (x == 0) {
        return sb.toString().trim();
      }
    }
    if (x >= 100) {
      final int d = x / 100;
      x %= 100;
      if (d > 1) {
        sb.append(' ').append(SMALL[d]);
      }
      sb.append("honderd");
      if (x == 0) {
        return sb.toString().trim();
      }
    }
    sb.append(' ').append(SMALL[x]);
    return sb.toString().trim();
  }

  @Override
  public String toText(final int x) {
    if (x < 0) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000000000) {
      throw new UnsupportedOperationException();
    }
    return toDutch1(x);
  }

  /**
   * Print numbers.
   * @param args numerical values
   */
  public static void main(final String[] args) {
    for (final String s : args) {
      System.out.println(SINGLETON.toText(Integer.parseInt(s)));
    }
  }
}
