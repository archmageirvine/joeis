package irvine.util.string;

/**
 * Catalan language related string functions.
 * @author Sean A. Irvine
 */
public final class Galician extends AbstractLanguage {

  /** Instance. */
  public static final Galician SINGLETON = new Galician();

  private Galician() { }

  // various strings used to writing numbers
  private static final String[] SMALL = {
    "cero",
    "un",
    "dous",
    "tres",
    "catro",
    "cinco",
    "seis",
    "sete",
    "oito",
    "nove",
    "dez",
    "once",
    "doce",
    "trece",
    "catorce",
    "quince",
    "dezaseis",
    "dezasete",
    "dezaoito",
    "dezanove",
  };

  private static final String[] TENS = {
    null, null, "vinte",  "trinta", "corenta", "cincuenta", "sesenta", "setenta", "oitenta", "noventa", "cen",
  };

  @Override
  public String toText(int x) {
    if (x < 0 || x >= 1000) {
      throw new UnsupportedOperationException();
    }
    final StringBuilder sb = new StringBuilder();
    if (x > 100) {
      if (x >= 200) {
        sb.append(SMALL[x / 100]).append("centos");
      } else {
        sb.append("cento");
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
        sb.append(x > 30 ? " e " : " ").append(SMALL[x % 10]);
      }
    }
    return sb.toString();
  }
}
