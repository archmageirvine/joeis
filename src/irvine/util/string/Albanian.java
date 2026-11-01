package irvine.util.string;

/**
 * Albanian numbers.
 * @author Sean A. Irvine
 */
public final class Albanian extends AbstractLanguage {

  /** Instance. */
  public static final Albanian SINGLETON = new Albanian();

  private Albanian() {
  }

  private static final String[] UNITS = {
    "", "nje", "dy", "tre", "kater", "pese", "gjashte", "shtate", "tete", "nente"
  };

  private static final String[] TEENS = {
    "dhjete", "njembedhjete", "dymbedhjete", "trembedhjete", "katermbedhjete", "pesembedhjete", "gjashtembedhjete", "shtatembedhjete", "tetembedhjete", "nentembedhjete"
  };

  private static final String[] TENS = {
    "", "", "njezet", "tridhjete", "dyzet", "pesedhjete", "gjashtedhjete", "shtatedhjete", "tetedhjete", "nentedhjete"
  };

  private static final String[] HUNDREDS = {
    "", "njeqind", "dyqind", "treqind", "katerqind", "peseqind", "gjashteqind", "shtateqind", "teteqind", "nenteqind"
  };

  private static String under100(final int n) {
    if (n < 10) {
      return UNITS[n];
    }
    if (n < 20) {
      return TEENS[n - 10];
    }
    return TENS[n / 10] + (n % 10 == 0 ? "" : " e " + UNITS[n % 10]);
  }

  private static String under1000(final int n) {
    if (n < 100) {
      return under100(n);
    }
    final String s = HUNDREDS[n / 100];
    return n % 100 == 0 ? s : s + " e " + under100(n % 100);
  }

  @Override
  public String toText(final int x) {
    if (x < 0 || x >= 10000) {
      throw new UnsupportedOperationException();
    }
    if (x == 0) {
      return "zero";
    }
    final StringBuilder s = new StringBuilder();
    if (x >= 1000) {
      final int th = x / 1000;
      if (th == 1) {
        s.append("nje mije");
      } else {
        s.append(under100(th)).append(" mije");
      }
      if (x % 1000 != 0) {
        s.append(" e ").append(under1000(x % 1000));
      }
    } else {
      s.append(under1000(x));
    }
    return s.toString();
  }
}
