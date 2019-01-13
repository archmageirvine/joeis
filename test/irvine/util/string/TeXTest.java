package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class TeXTest extends TestCase {

  public void testCases() {
    assertEquals(null, TeX.ascii(null));
    assertEquals("", TeX.ascii(""));
    assertEquals(" ", TeX.ascii(" "));
    assertEquals("  ", TeX.ascii("  "));
    assertEquals("@", TeX.ascii("@"));
    assertEquals("A", TeX.ascii("A"));
    assertEquals("", TeX.ascii("\\"));
    assertEquals("", TeX.ascii("\\'"));
    assertEquals("", TeX.ascii("\\`"));
    assertEquals("", TeX.ascii("\\^"));
    assertEquals("", TeX.ascii("\\\""));
    assertEquals("", TeX.ascii("\\~"));
    assertEquals("", TeX.ascii("\\="));
    assertEquals("", TeX.ascii("\\."));
    assertEquals("x", TeX.ascii("\\u x"));
    assertEquals("x", TeX.ascii("\\u\\x"));
    assertEquals("x", TeX.ascii("\\u{x"));
    assertEquals("XaX", TeX.ascii("X\\'aX"));
    assertEquals(" \\ ", TeX.ascii("\\c"));  // This is not ideal output
    assertEquals("iwas", TeX.ascii("\\=\\i was"));
    assertEquals("i was", TeX.ascii("\\=\\i  was"));
    assertEquals("j{}", TeX.ascii("\\j{}"));
    assertEquals("Orc", TeX.ascii("\\O rc"));
    assertEquals("Francais", TeX.ascii("Fran\\c cais"));
    assertEquals("X X", TeX.ascii("X\\verb|go|X"));
    assertEquals("X  X Y", TeX.ascii("X\\verb|go| X\\verb%%Y"));
  }
  
  public void testSuppress() {
    assertEquals("X X", TeX.suppress("X\\pfile{x.eps}X", "\\pfile"));
    assertEquals("", TeX.suppress("", "\\hi", "\\there"));
    assertEquals("  ", TeX.suppress("\\there{was}\\hi{}", "\\hi", "\\there"));
  }
  
  public void testSuppressMath() {
    assertEquals("X XY", TeX.suppressMath("X$$x$$X$y$Y"));
    assertEquals("was \\$2 NZ", TeX.suppressMath("was \\$2 $x+y$NZ"));
  }
  
  public void testSuppressHyphens() {
    assertEquals("XX", TeX.suppressHyphens("XX"));
    assertEquals("XX", TeX.suppressHyphens("X\\-X"));
    assertEquals("XX", TeX.suppressHyphens("XX\\-"));
    assertEquals("XX", TeX.suppressHyphens("\\-XX"));
  }
}
