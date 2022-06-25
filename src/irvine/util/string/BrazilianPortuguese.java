package irvine.util.string;

/**
 * Brazilian Portuguese related string functions.
 * @author Sean A. Irvine
 */
public final class BrazilianPortuguese extends AbstractLanguage {

  /** Instance. */
  public static final BrazilianPortuguese SINGLETON = new BrazilianPortuguese();

  private BrazilianPortuguese() { }

  /*
  Zero, um, dois, tres, quatro, cinco, seis, sete, oito, nove, dez, onze, doze, treze, quatorze, quinze, dezesseis, dezessete, dezoito, dezenove, vinte, vinte e um, vinte e dois, vinte e tres, vinte e quatro, vinte e cinco, vinte e seis, vinte e sete, vinte e oito, vinte e nove, trinta,
   */

  private static final String[] SMALL = {
    "zero",
    "um",
    "dois",
    "tres",
    "quatro",
    "cinco",
    "seis",
    "sete",
    "oito",
    "nove",
    "dez",
    "onze",
    "doze",
    "treze",
    "quatorze",
    "quinze",
    "dezesseis",
    "dezessete",
    "dezoito",
    "dezenove",
    "vinte",
  };

  private static final String[] TENS = {
    null,
    null,
    "vinte",
    "trinto",
    "quarenta",
    "cinquenta",
    "sessenta",
    "setenta",
    "oitenta",
    "noventa",
  };

  private static final String[] HUNDREDS = {
    null,
    "cento",
    "duzentos",
    "trezentos",
    "quatrocentos",
    "quinhentos",
    "seiscentos",
    "setecentos",
    "oitocentos",
    "novecentos",
  };

  @Override
  public String toText(final int x) {
    if (x < 0 || x > 99999) {
      throw new UnsupportedOperationException();
    }
    if (x >= 1000) {
      if (x == 1000) {
        return "mil";
      }
      if (x < 2000) {
        return "mil " + toText(x % 1000);
      } else if (x % 1000 != 0) {
        return toText(x / 1000) + " mil " + toText(x % 1000);
      } else {
        return toText(x / 1000) + " mil";
      }
    }
    if (x >= 100) {
      if (x == 100) {
        return "cem";
      }
      final String res = HUNDREDS[x / 100];
      if (x % 100 != 0) {
        return res + " e " + toText(x % 100);
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
    return TENS[tens] + " e " + SMALL[units];
  }

}
