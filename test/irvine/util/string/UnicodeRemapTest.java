package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests corresponding class.
 *
 * @author Sean A. Irvine
 */
public class UnicodeRemapTest extends TestCase {

  public UnicodeRemapTest(final String name) {
    super(name);
  }

  public void testRemap() {
    assertEquals('\0', UnicodeRemap.remap('\0'));
    assertEquals('\uFFFF', UnicodeRemap.remap('\uFFFF'));
    assertEquals(' ', UnicodeRemap.remap(' '));
    assertEquals(' ', UnicodeRemap.remap('\n'));
    assertEquals('a', UnicodeRemap.remap('a'));
    assertEquals('1', UnicodeRemap.remap('1'));
    assertEquals('A', UnicodeRemap.remap('A'));
    assertEquals('A', UnicodeRemap.remap('\u00C0'));
    assertEquals('i', UnicodeRemap.remap('\u00EE'));
    assertEquals('\u00B1', UnicodeRemap.remap('\u00B1'));
  }
}
