package irvine.util.string;

/**
 * Japanese related string functions.
 * @author Sean A. Irvine
 */
public final class Japanese extends AbstractLanguage {

  /** Instance. */
  public static final Japanese SINGLETON = new Japanese();

  private Japanese() {
  }

  private static final String[] SMALL = {
    "\u308C\u3044", "\u3044\u3061", "\u306B", "\u3055\u3093", "\u3088\u3093", "\u3054", "\u308D\u304F", "\u306A\u306A", "\u306F\u3061", "\u304D\u3085\u3046"
  };
  private static final String[] POWERS_OF_TEN = {
    "", // 1
    "\u3058\u3085\u3046", // 10
    "\u3072\u3083\u304F", // 100
    "\u305B\u3093", // 1000
    "\u307E\u3093", // 10000
  };

  @Override
  public String toText(final int x) {
    if (x >= 100000) {
      throw new UnsupportedOperationException();
    }
    if (x == 0) {
      return SMALL[0];
    }
    int log = 0;
    int y = 10;
    while (y <= x) {
      y *= 10;
      ++log;
    }
    y /= 10;
    int r = x;
    final StringBuilder sb = new StringBuilder();
    while (y > 0) {
      final int q = r / y;
      r = r % y;
      if (q > 1 || y == 1) {
        sb.append(SMALL[q]);
      }
      sb.append(POWERS_OF_TEN[log]);
      if (r == 0) {
        break;
      }
      --log;
      y /= 10;
    }
    return sb.toString();
  }
}
