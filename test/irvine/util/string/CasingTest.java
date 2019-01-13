package irvine.util.string;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CasingTest extends TestCase {

  public void testEnum() {
    TestUtils.testEnum(Casing.class, "[NONE, LOWER, UPPER]");
    assertEquals("hI", Casing.NONE.apply("hI"));
    assertEquals("hi", Casing.LOWER.apply("hI"));
    assertEquals("HI", Casing.UPPER.apply("hI"));
  }

}
