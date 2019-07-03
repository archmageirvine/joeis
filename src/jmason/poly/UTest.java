package jmason.poly;

import java.util.HashSet;

/**
 * A UTest object allows you to test strings, coordinate pairs or coordinate triples, for uniqueness.
 * @author jmason
 */
public class UTest {

  private final HashSet<String> mH = new HashSet<>();

  public boolean put(final String s) {
    return mH.add(s);
  }

  public boolean put(final int x, final int y) {

    return put(prepare(x, y));
  }

  public boolean put(final int x, final int y, final int z) {

    return put(prepare(x, y, z));
  }

  public boolean isIn(final String s) {
    return mH.contains(s);
  }

  public boolean isIn(final int x, final int y) {
    return isIn(prepare(x, y));
  }

  public boolean isIn(final int x, final int y, final int z) {
    return isIn(prepare(x, y, z));
  }

  private String prepare(final int x, final int y) {
    return x + " " + y;
  }

  private String prepare(final int x, final int y, final int z) {
    return x + " " + y + " " + z;
  }

}
