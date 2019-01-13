package irvine.util.string;

/**
 * Spanish related string functions.
 * @author Sean A. Irvine
 */
public final class Spanish {

  private Spanish() { }

  private static final String[] SMALL = {
    "cero",
    "uno",
    "dos",
    "tres",
    "cuatro",
    "cinco",
    "seis",
    "siete",
    "ocho",
    "nueve",
    "diez",
    "once",
    "doce",
    "trece",
    "catorce",
    "quince",
    "diecis\u00E9is",
    "diecisiete",
    "dieciocho",
    "diecinueve",
    "veinte",
    "veintiuno",
    "veintid\u00F3s",
    "veintitr\u00E9s",
    "veinticuatro",
    "veinticinco",
    "veintis\u00E9is",
    "veintisiete",
    "veintiocho",
    "veintinueve",
  };

  private static final String[] TENS = {
    null,
    null,
    null, //"veinti" // The 20s have special forms
    "treinta",
    "cuarenta",
    "cincuenta",
    "sesenta",
    "setenta",
    "ochenta",
    "noventa",
  };

  private static final String[] HUNDREDS = {
    null,
    "ciento",
    "doscientos",
    "trescientos",
    "cuatrocientos",
    "quinientos",
    "seiscientos",
    "setecientos",
    "ochocientos",
    "novecientos",
  };

  /**
   * Return a Spanish string representing the supplied integer value.
   * @param x number to convert
   * @return Spanish text representation
   */
  public static String toSpanish(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "mil";
      }
      if (x < 2000) {
        return "mil " + toSpanish(x % 1000);
      } else if (x % 1000 != 0) {
        return toSpanish(x / 1000) + " mil " + toSpanish(x % 1000);
      } else {
        return toSpanish(x / 1000) + " mil";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "cien";
      }
      final String res = HUNDREDS[x / 100];
      if (x % 100 != 0) {
        return res + " " + toSpanish(x % 100);
      } else {
        return res;
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
    return TENS[tens] + " y " + SMALL[units];
  }

}
