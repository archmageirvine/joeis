package irvine.math;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ShiftRegisterTest extends TestCase {

  private static final String LS = System.lineSeparator();

  public void testBad() {
    try {
      ShiftRegister.registerToEPS(null, "x", new int[0]);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      ShiftRegister.registerToEPS(System.out, null, new int[0]);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testExactly() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try {
      try (final PrintStream ps = new PrintStream(bos)) {
        ShiftRegister.registerToEPS(ps, "01", new int[]{1});
      }
    } finally {
      bos.close();
    }
    final String s = bos.toString();
    TestUtils.containsAll(s,
      "%!PS-Adobe-3.0 EPSF-2.0",
      "%%Title: Shift Register",
      "%%Pages: 0",
      "%%BoundingBox: 0.0 0.0 180.0 100.0",
      "%%EndComments",
      "/Times-Roman findfont 20 scalefont setfont",
      "newpath 40 40 moveto 80 40 lineto 80 0 lineto 40 0 lineto closepath stroke",
      "newpath 60 (0) stringwidth pop 2 div sub 15.0 moveto (0) show",
      "newpath 80 40 moveto 120 40 lineto 120 0 lineto 80 0 lineto closepath stroke",
      "newpath 100 (1) stringwidth pop 2 div sub 15.0 moveto (1) show",
      "newpath 40 20 moveto 10 20 lineto stroke",
      "newpath 10 20 moveto 20 30 lineto 20 10 lineto closepath fill",
      "newpath 160 20 moveto 120 20 lineto stroke",
      "newpath 120 20 moveto 130 30 lineto 130 10 lineto closepath fill",
      "newpath 100 40 moveto 100 80 lineto 160 80 lineto 160 20 lineto stroke");
  }

  public void testExactly2() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try {
      try (final PrintStream ps = new PrintStream(bos)) {
        ShiftRegister.registerToEPS(ps, "001", new int[]{0, 1});
      }
    } finally {
      bos.close();
    }
    final String s = bos.toString();
    TestUtils.containsAll(s,
      "%!PS-Adobe-3.0 EPSF-2.0",
      "%%Title: Shift Register",
      "%%Pages: 0",
      "%%BoundingBox: 0.0 0.0 220.0 100.0",
      "%%EndComments",
      "/Times-Roman findfont 20 scalefont setfont",
      "newpath 40 40 moveto 80 40 lineto 80 0 lineto 40 0 lineto closepath stroke",
      "newpath 60 (0) stringwidth pop 2 div sub 15.0 moveto (0) show",
      "newpath 80 40 moveto 120 40 lineto 120 0 lineto 80 0 lineto closepath stroke",
      "newpath 100 (0) stringwidth pop 2 div sub 15.0 moveto (0) show",
      "newpath 120 40 moveto 160 40 lineto 160 0 lineto 120 0 lineto closepath stroke",
      "newpath 140 (1) stringwidth pop 2 div sub 15.0 moveto (1) show",
      "newpath 40 20 moveto 10 20 lineto stroke",
      "newpath 10 20 moveto 20 30 lineto 20 10 lineto closepath fill",
      "newpath 200 20 moveto 160 20 lineto stroke",
      "newpath 160 20 moveto 170 30 lineto 170 10 lineto closepath fill",
      "newpath 60 40 moveto 60 80 lineto 200 80 lineto 200 20 lineto stroke",
      "newpath 100 40 moveto 100 90 lineto stroke",
      "newpath 100 80 10 0 360 arc stroke",
      "%%Trailer");
  }
}
