package irvine.util.string;

import java.awt.Color;
import java.io.PrintStream;

import irvine.math.r.DoubleUtils;

/**
 * PostScript related string functions.
 * @author Sean A. Irvine
 */
public final class PostScript {

  private PostScript() { }

  /**
   * Print centered text.
   * @param out output stream
   * @param text text to print
   */
  public static void centerText(final PrintStream out, final String text) {
    out.println("newpath 10 (" + text + ") stringwidth sub 2 div -1 moveto (" + text + ") show");
  }

  /**
   * Print centered text.
   * @param out output stream
   * @param n number to print
   */
  public static void centerText(final PrintStream out, final int n) {
    centerText(out, String.valueOf(n));
  }

  /**
   * Print a standard header.
   * @param out output stream
   * @param creator creator (typically class name)
   * @param title the title
   * @param x0 left
   * @param y0 bottom
   * @param x1 right
   * @param y1 top
   * @param extra extra header lines
   */
  public static void header(final PrintStream out, final Class<?> creator, final String title, final double x0, final double y0, final double x1, final double y1, final String... extra) {
    out.println("%!PS-Adobe-3.0 EPSF-2.0");
    out.println("%%Creator: " + creator.getName());
    out.println("%%CreationDate: " + Date.now().trim());
    out.println("%%Title: " + title);
    out.println("%%Pages: 0");
    out.println("%%LanguageLevel: 2");
    out.println("%%Orientation: Portrait");
    out.println("%%BoundingBox: " + x0 + " " + y0 + " " + x1 + " " + y1);
    if (extra != null) {
      for (final String line : extra) {
        out.println(line);
      }
    }
    out.println("%%EndComments");
    out.println("gsave");
  }

  /**
   * Print a standard header.
   * @param out output stream
   * @param creator creator (typically class name)
   * @param title the title
   * @param x1 right
   * @param y1 top
   */
  public static void header(final PrintStream out, final Class<?> creator, final String title, final double x1, final double y1) {
    header(out, creator, title, 0, 0, x1, y1);
  }

  /**
   * Print standard trailer.
   * @param out output stream.
   */
  public static void trailer(final PrintStream out) {
    out.println("grestore");
    out.println("%%Trailer");
    out.println("%%EOF");
  }

  /**
   * Set PostScript color based on Java color.
   * @param c color
   * @return PostScript color command
   */
  public static String setRgbColor(final Color c) {
    return DoubleUtils.NF3.format(c.getRed() / 255.0) + " " + DoubleUtils.NF3.format(c.getGreen() / 255.0) + " " + DoubleUtils.NF3.format(c.getBlue() / 255.0) + " setrgbcolor";
  }

}
