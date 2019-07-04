package jmason.poly;

/**
 * A single element, be it a square or a cube.
 * @author jmason
 * @param <T> type of element
 */
abstract class Element<T extends Element<T>> {
  protected int[] mCoords;
  protected int mColour;
  //public static final int EMPTY = 0;
  private static final String TRANS = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static final int BLACK = 1;
  static final int WHITE = -BLACK;

  static int opp(final int z) {
    // 0 -----> -1
    // 1 -----> -2
    // -1 ----> 0
    // -2 ----> 1
    return -z - 1;
  }

  int getX() {
    return mCoords[0];
  }

  int getY() {
    return mCoords[1];
  }

  int getCoord(final int z) {
    return mCoords[z];
  }

  int getColour() {
    return mColour;
  }

  void setColour(final int colour) {
    this.mColour = colour;
  }

  protected T copy() {
    return copy(false);
  }

  protected abstract T copy(final boolean flip);

  static String colourString(final boolean all, final int colour) {
    if (all) {
      return TRANS.substring(colour, colour + 1);
    } else {
      return colour < 0 ? "W" : "B";
    }
  }
}
