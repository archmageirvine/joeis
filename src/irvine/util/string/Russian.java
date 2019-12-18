package irvine.util.string;

/**
 * Russian related string functions.
 * @author Sean A. Irvine
 */
public final class Russian extends AbstractLanguage {

  /** Instance. */
  public static final Russian SINGLETON = new Russian();

  private Russian() { }

  private static final String[] M_DIGITS = {
    "\u043d\u043e\u043b\u044c", "\u043e\u0434\u0438\u043d", "\u0434\u0432\u0430", "\u0442\u0440\u0438", "\u0447\u0435\u0442\u044b\u0440\u0435", "\u043f\u044f\u0442\u044c", "\u0448\u0435\u0441\u0442\u044c", "\u0441\u0435\u043c\u044c", "\u0432\u043e\u0441\u0435\u043c\u044c",
    "\u0434\u0435\u0432\u044f\u0442\u044c", "\u0434\u0435\u0441\u044f\u0442\u044c", "\u043e\u0434\u0438\u043d\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0434\u0432\u0435\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0442\u0440\u0438\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0447\u0435\u0442\u044b\u0440\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u043f\u044f\u0442\u043d\u0430\u0434\u0446\u0430\u0442\u044c",
    "\u0448\u0435\u0441\u0442\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0441\u0435\u043c\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0432\u043e\u0441\u0435\u043c\u043d\u0430\u0434\u0446\u0430\u0442\u044c", "\u0434\u0435\u0432\u044f\u0442\u043d\u0430\u0434\u0446\u0430\u0442\u044c"
  };

  private static final String[] M_TENS = {
    null, "\u0434\u0435\u0441\u044f\u0442\u044c", "\u0434\u0432\u0430\u0434\u0446\u0430\u0442\u044c", "\u0442\u0440\u0438\u0434\u0446\u0430\u0442\u044c", "\u0441\u043e\u0440\u043e\u043a", "\u043f\u044f\u0442\u044c\u0434\u0435\u0441\u044f\u0442", "\u0448\u0435\u0441\u0442\u044c\u0434\u0435\u0441\u044f\u0442",
    "\u0441\u0435\u043c\u044c\u0434\u0435\u0441\u044f\u0442", "\u0432\u043e\u0441\u0435\u043c\u044c\u0434\u0435\u0441\u044f\u0442", "\u0434\u0435\u0432\u044f\u043d\u043e\u0441\u0442\u043e"
  };

  private static final String[] M_HUNDREDS = {
    null, "\u0441\u0442\u043e", "\u0434\u0432\u0435\u0441\u0442\u0438", "\u0442\u0440\u0438\u0441\u0442\u0430", "\u0447\u0435\u0442\u044b\u0440\u0435\u0441\u0442\u0430", "\u043f\u044f\u0442\u044c\u0441\u043e\u0442", "\u0448\u0435\u0441\u0442\u044c\u0441\u043e\u0442",
    "\u0441\u0435\u043c\u044c\u0441\u043e\u0442", "\u0432\u043e\u0441\u0435\u043c\u044c\u0441\u043e\u0442", "\u0434\u0435\u0432\u044f\u0442\u044c\u0441\u043e\u0442"
  };

  @Override
  public String toText(int x) {
    if (x < 0 || x >= 2000) {
      throw new UnsupportedOperationException();
    }
    if (x < M_DIGITS.length) {
      return M_DIGITS[x];
    }
    final StringBuilder sb = new StringBuilder();
    if (x >= 1000) {
      sb.append("\u0442\u044b\u0441\u044f\u0447\u0430");
      x %= 1000;
    }
    if (x >= 100) {
      final int d = x / 100;
      sb.append(' ').append(M_HUNDREDS[d]);
      x %= 100;
    }
    if (x >= 20) {
      final int d = x / 10;
      sb.append(' ').append(M_TENS[d]);
      x %= 10;
    }
    if (x != 0) {
      sb.append(' ').append(M_DIGITS[x]);
    }
    return sb.toString().trim();
  }

}
