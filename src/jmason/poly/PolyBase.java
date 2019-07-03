package jmason.poly;

/**
 * A class offering a function for building an ordered string of strings.
 * @author jmason
 */
public abstract class PolyBase {
  public String insert(final String total, final String bit, final int bitSize) {
    if (total.isEmpty()) {
      return bit;
    }
    int len = total.length();
    for (int i = 0; i < len; i += bitSize) {
      if (total.substring(i, i + bitSize).compareTo(bit) > 0) {
        return total.substring(0, i) + bit + total.substring(i);
      }
    }
    return total + bit;
  }
}
