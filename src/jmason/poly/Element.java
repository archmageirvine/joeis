package jmason.poly;

/**
 *
 * @author jmason
 * a single element, be it a square or a cube
 */
public abstract class Element {
  protected int[] mCoords;
  protected int mColour;
  //public static final int EMPTY = 0;
  public static final String trans = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  public static final int BLACK = 1;
  public static final int WHITE = -BLACK;

  public static int opp(final int z) {
    // 0 -----> -1
    // 1 -----> -2
    // -1 ----> 0
    // -2 ----> 1
    return -z
      - 1
      ;
  }


  public int getX() {
    return mCoords[0];
  }

  public int getY() {
    return mCoords[1];
  }

  public int getCoord(final int z) {
    return mCoords[z];
  }

  public int getColour() {
    return mColour;
  }

  public void setColour(final int colour) {
    this.mColour = colour;
  }

  public Element clone() {
    return clone(false);
  }

  public abstract Element clone(final boolean flip);

  public static String colourString(final boolean all, final int colour) {
    if (all) {
      return trans.substring(colour, colour + 1);
    } else {
      if (colour < 0) {
        return "W";
      } else {
        return "B";
      }
    }
  }
}
