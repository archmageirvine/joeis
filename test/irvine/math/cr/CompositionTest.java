package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class CompositionTest extends TestCase {

  public void testComposition() {
    final Composition c = new Composition(new Abs(), new Cos());
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.ZERO));
    CRTest.assertEquals("composition", CR.ONE, c.execute(CR.PI));
  }
}
