/* Exact positions for multiples of 15 degrees in the unit circle
 * @(#) $Id$
 * Copyright (c) 2020 Dr. Georg Fischer
 * 2020-05-15, Georg Fischer: extracted from Tiler.java
 */
package org.teherba.tile;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Class for a exact positions for multiples of 15 degrees in the unit circle.
 * The x axis is to the right and the y axis leads downwards (SVG coordinate system).
 * The x and y coordinates are represented by tuples (a,b,c,d)
 * such that (a + b*sqrt(2) + c*sqrt(3) + d*sqrt(6)) / 4 give the
 * real value for a position.
 * All edges of unit length under angles of n * 15 degrees can exactly be represented by such tuples.
 * Cf. https://math.stackexchange.com/questions/96946/how-to-prove-1-sqrt2-sqrt3-and-sqrt6-are-linearly-independent-ove
 * @author Georg Fischer
 */
public class Position implements Serializable {
  private static final long serialVersionUID = 1L;
  public  final static String CVSID = "@(#) $Id: Position.java $";
  
  /* Linearily independant constants */
  private static final Double SQRT2 = Math.sqrt(2.0);
  private static final Double SQRT3 = Math.sqrt(3.0);
  private static final Double SQRT6 = Math.sqrt(6.0);

  /** Horizontal coordinate, left is negative */
  public int/*s*/[] xtuple;
  /** Vertical coordinate, up is negative */
  public int/*s*/[] ytuple;

  /**
   * Empty constructor - creates the origin (0,0).
   */
  public Position() {
    xtuple = new int/*s*/[4];
    ytuple = new int/*s*/[4];
    Arrays.fill(xtuple, (int/*s*/) 0);
    Arrays.fill(ytuple, (int/*s*/) 0);
  } // Position()

  /**
   * Constructor
   * @param xparm tuple for exact x representation
   * @param yparm tuple for exact y representation
   */
  public Position(final int/*s*/[] xparm, final int/*s*/[]yparm) {
    xtuple = xparm;
    ytuple = yparm;
  } // Position(int/*s*/[], int/*s*/[])

  /**
   * Computes the cartesian coordinate value from an exact {@link Position} tuple
   * @param tuple x or y values of the vector defining the exact position
   * @return a double value
   */
  public static Double cartesian(final int/*s*/[] tuple) {
    return 
        ( tuple[0]
        + tuple[1] * SQRT2
        + tuple[2] * SQRT3
        + tuple[3] * SQRT6
        ) / 4.0;
  } // cartesian

  /**
   * Adds a Position to <em>this</em> Position.
   * @param pos2 Position to be added
   * @return this + pos2
   */
  public Position add(final Position pos2) {
    Position result = new Position();
    for (int ipos = 0; ipos < 4; ipos ++) {
      result.xtuple[ipos] = (xtuple[ipos] + pos2.xtuple[ipos]);
      result.ytuple[ipos] = (ytuple[ipos] + pos2.ytuple[ipos]);
    } // for ipos
    return result;
  } // add

  /**
   * Subtracts a Position from <em>this</em> Position.
   * @param pos2 Position to be subtracted
   * @return this - pos2
   */
  private Position subtract(final Position pos2) {
    Position result = new Position();
    for (int ipos = 0; ipos < 4; ipos ++) {
      result.xtuple[ipos] = (xtuple[ipos] - pos2.xtuple[ipos]);
      result.ytuple[ipos] = (ytuple[ipos] - pos2.ytuple[ipos]);
    } // for ipos
    return result;
  } // subtract

  /**
   * Returns a representation of the Position
   * @return the cartesian coordinates like "[-3.0981,1.3660]"
   */
  public String toString() {
    StringBuffer result = new StringBuffer(64);
    for (int ipos = 0; ipos < 4; ipos ++) {
      result.append(',');
      result.append(String.valueOf(xtuple[ipos]));
      result.append(',');
      result.append(String.valueOf(ytuple[ipos]));
    } // for ipos
    result.append(']');
    result.setCharAt(0, '[');
    return result.toString();
  } // Position.toString

  /**
   * Gets the cartesian coordinate from a double
   * @param parm double value
   * @return a String with 4 decimal digits
   */
  public static String get(double parm) {
    return String.format("%.4f", parm).replaceAll("\\,", "."); // for German Locale
  } // getX

  /**
   * Gets the cartesian x coordinate (to the right) from <em>this</em> Position
   * @return a String with 4 decimal digits
   */
  public String getX() {
    return String.format("%.4f", cartesian(xtuple)).replaceAll("\\,", "."); // for German Locale
  } // getX

  /**
   * Gets the cartesian y coordinate (downwards, because of SVG) from <em>this</em> Position
   * @return a String with 4 decimal digits
   */
  public String getY() {
    return String.format("%.4f", cartesian(ytuple)).replaceAll("\\,", "."); // for German Locale
  } // getY

  /** Positions in the unit circle = increments for the next {@link Vertex} */
  private static final Position[] sUnitCirclePoints = new Position[]
      { new Position(new int/*s*/[] { 4, 0, 0, 0}, new int/*s*/[] { 0, 0, 0, 0}) // [ 0]   0     1.0000,    0.0000
      , new Position(new int/*s*/[] { 0, 1, 0, 1}, new int/*s*/[] { 0,-1, 0, 1}) // [ 1]  15     0.9659,    0.2588
      , new Position(new int/*s*/[] { 0, 0, 2, 0}, new int/*s*/[] { 2, 0, 0, 0}) // [ 2]  30     0.8660,    0.5000
      , new Position(new int/*s*/[] { 0, 2, 0, 0}, new int/*s*/[] { 0, 2, 0, 0}) // [ 3]  45     0.7071,    0.7071
      , new Position(new int/*s*/[] { 2, 0, 0, 0}, new int/*s*/[] { 0, 0, 2, 0}) // [ 4]  60     0.5000,    0.8660
      , new Position(new int/*s*/[] { 0,-1, 0, 1}, new int/*s*/[] { 0, 1, 0, 1}) // [ 5]  75     0.2588,    0.9659
      , new Position(new int/*s*/[] { 0, 0, 0, 0}, new int/*s*/[] { 4, 0, 0, 0}) // [ 6]  90     0.0000,    1.0000
      , new Position(new int/*s*/[] { 0, 1, 0,-1}, new int/*s*/[] { 0, 1, 0, 1}) // [ 7] 105    -0.2588,    0.9659
      , new Position(new int/*s*/[] {-2, 0, 0, 0}, new int/*s*/[] { 0, 0, 2, 0}) // [ 8] 120    -0.5000,    0.8660
      , new Position(new int/*s*/[] { 0,-2, 0, 0}, new int/*s*/[] { 0, 2, 0, 0}) // [ 9] 135    -0.7071,    0.7071
      , new Position(new int/*s*/[] { 0, 0,-2, 0}, new int/*s*/[] { 2, 0, 0, 0}) // [10] 150    -0.8660,    0.5000
      , new Position(new int/*s*/[] { 0,-1, 0,-1}, new int/*s*/[] { 0,-1, 0, 1}) // [11] 165    -0.9659,    0.2588
      , new Position(new int/*s*/[] {-4, 0, 0, 0}, new int/*s*/[] { 0, 0, 0, 0}) // [12] 180    -1.0000,    0.0000
      , new Position(new int/*s*/[] { 0,-1, 0,-1}, new int/*s*/[] { 0, 1, 0,-1}) // [13] 195    -0.9659,   -0.2588
      , new Position(new int/*s*/[] { 0, 0,-2, 0}, new int/*s*/[] {-2, 0, 0, 0}) // [14] 210    -0.8660,   -0.5000
      , new Position(new int/*s*/[] { 0,-2, 0, 0}, new int/*s*/[] { 0,-2, 0, 0}) // [15] 225    -0.7071,   -0.7071
      , new Position(new int/*s*/[] {-2, 0, 0, 0}, new int/*s*/[] { 0, 0,-2, 0}) // [16] 240    -0.5000,   -0.8660
      , new Position(new int/*s*/[] { 0, 1, 0,-1}, new int/*s*/[] { 0,-1, 0,-1}) // [17] 255    -0.2588,   -0.9659
      , new Position(new int/*s*/[] { 0, 0, 0, 0}, new int/*s*/[] {-4, 0, 0, 0}) // [18] 270     0.0000,   -1.0000
      , new Position(new int/*s*/[] { 0,-1, 0, 1}, new int/*s*/[] { 0,-1, 0,-1}) // [19] 285     0.2588,   -0.9659
      , new Position(new int/*s*/[] { 2, 0, 0, 0}, new int/*s*/[] { 0, 0,-2, 0}) // [20] 300     0.5000,   -0.8660
      , new Position(new int/*s*/[] { 0, 2, 0, 0}, new int/*s*/[] { 0,-2, 0, 0}) // [21] 315     0.7071,   -0.7071
      , new Position(new int/*s*/[] { 0, 0, 2, 0}, new int/*s*/[] {-2, 0, 0, 0}) // [22] 330     0.8660,   -0.5000
      , new Position(new int/*s*/[] { 0, 1, 0, 1}, new int/*s*/[] { 0, 1, 0,-1}) // [23] 345     0.9659,   -0.2588
      };

  /** Angles in degrees for regular polygons */
  public static final int[] mRegularAngles = new int[] { 0
      , 360 // [ 1] full circle
      , 180 // [ 2] half circle
      ,  60 // [ 3] triangle
      ,  90 // [ 4] square
      , 108 // [ 5] pentagon
      , 120 // [ 6] hexagon
      ,   0 // [ 7] (heptagon)
      , 135 // [ 8] octogon
      , 140 // [ 9] nonagon
      , 144 // [10] decagon
      ,   0 // [11] (hendecagon)
      , 150 // [12] dodecagon
      };

  /**
   * Moves <em>this</em> Position by a unit distance in some angle
   * @param angle in degrees 0..360
   * @return new Position
   */
  public Position moveUnit(final int angle) {
    final int icircle = Math.round(angle / 15) % 24;
    return add(sUnitCirclePoints[icircle]);
  } // moveUnit
 
  /**
   * Tests the computation of all 24 exact {@link Position}s
   */
  public static void testCirclePositions() {
  /* start test code //
    Position origin = new Position();
    SVGFile.sEnabled = true;
    if (SVGFile.sEnabled) {
      SVGFile.sFileName = "circle.svg";
      SVGFile.open(2, "");
    }
    for (int ipos = 0; ipos < sUnitCirclePoints.length + 1; ipos ++) {
      final Position pos = origin.moveUnit(ipos * 15);
      System.out.println(String.format("[%2d], %3d = %s", ipos, ipos * 15, pos.toString()));
      if (SVGFile.sEnabled) {
        SVGFile.write("<line class=\"l" + String.valueOf(ipos % 4)
             + "\" x1=\"0.0\" y1=\"0.0\" x2=\"" + pos.getX() + "\" y2=\"" + pos.getY() + "\"></line>");
      }
    } // for ipos
    if (SVGFile.sEnabled) {
      SVGFile.close();
    }
    for (int ipos = 0; ipos < sUnitCirclePoints.length; ipos += 4) {
      final int ipos8 = (ipos + 8) % 24;
      final Position hexPos = sUnitCirclePoints[ipos].add(sUnitCirclePoints[ipos8]);
      System.out.println(String.format("[%2d] + [%2d] = %8s,%8s"
          , ipos, ipos8, hexPos.getX(), hexPos.getY()));
    } // for ipos
  // end   test code */
  } // testCirclePositions

  /**
   * Main method - tests the unit circle Positions.
   * @param args command line arguments: -circle
   */
  public static void main(String[] args) {
  /* start test code //
    try {
      int iarg = 0;
      while (iarg < args.length) { // consume all arguments
        String opt        = args[iarg ++];
        if (false) {
        } else if (opt.equals("-circle")) {
          Position.testCirclePositions();
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } // while args
    } catch (Exception exc) {
      // log.error(exc.getMessage(), exc);
      System.err.println(exc.getMessage());
      exc.printStackTrace();
    }
  // end   test code */
  } // main

} // class Position
