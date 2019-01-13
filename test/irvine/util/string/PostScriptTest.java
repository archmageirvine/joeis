package irvine.util.string;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PostScriptTest extends TestCase {

  private static final String LS = System.lineSeparator();

  public void testCenter() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos)) {
      PostScript.centerText(out, 42);
      assertEquals("newpath 10 (42) stringwidth sub 2 div -1 moveto (42) show" + LS, bos.toString());
    }
  }

  public void testHeader() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos)) {
      PostScript.header(out, PostScriptTest.class, "test", 1, 2, 3, 4);
      final String s = bos.toString();
      //System.out.println(s);
      TestUtils.containsAll(s,
        "%!PS-Adobe-3.0 EPSF-2.0",
        "%%Creator: irvine.util.string.PostScriptTest",
        "%%CreationDate: 2",
        "%%Title: test",
        "%%Pages: 0",
        "%%LanguageLevel: 2",
        "%%Orientation: Portrait",
        "%%BoundingBox: 1.0 2.0 3.0 4.0",
        "%%EndComments",
        "gsave");
    }
  }

  public void testTrailer() throws IOException {
    try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
         final PrintStream out = new PrintStream(bos)) {
      PostScript.trailer(out);
      assertEquals("grestore" + LS + "%%Trailer" + LS + "%%EOF" + LS, bos.toString());
    }
  }

  public void testSetRgbColor() {
    assertEquals("1.000 0.000 0.000 setrgbcolor", PostScript.setRgbColor(Color.RED));
    assertEquals("0.753 0.753 0.753 setrgbcolor", PostScript.setRgbColor(Color.LIGHT_GRAY));
  }
}
