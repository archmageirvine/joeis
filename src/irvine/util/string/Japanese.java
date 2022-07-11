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
    "れい", "いち", "に", "さん", "よん", "ご", "ろく", "なな", "はち", "きゅう"
  };
  private static final String[] POWERS_OF_TEN = {
    "", // 1
    "じゅう", // 10
    "ひゃく", // 100
    "せん", // 1000
    "まん", // 10000
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
