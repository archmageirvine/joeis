package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FrenchTest extends TestCase {

  public void testIntToFrenchText() {
    assertEquals("z\u00E9ro", French.toFrench(0));
    assertEquals("un", French.toFrench(1));
    assertEquals("deux", French.toFrench(2));
    assertEquals("trois", French.toFrench(3));
    assertEquals("dix", French.toFrench(10));
    assertEquals("onze", French.toFrench(11));
    assertEquals("vingt", French.toFrench(20));
    assertEquals("cent", French.toFrench(100));
    assertEquals("cent un", French.toFrench(101));
    assertEquals("cent vingt-cinq", French.toFrench(125));
    assertEquals("deux cents", French.toFrench(200));
    assertEquals("deux cent un", French.toFrench(201));
    assertEquals("deux cent deux", French.toFrench(202));
    assertEquals("deux cent quarante-trois", French.toFrench(243));
    assertEquals("mille", French.toFrench(1000));
    assertEquals("deux mille", French.toFrench(2000));
    assertEquals("deux mille cinq cents", French.toFrench(2500));
    assertEquals("dix mille quatre cent quatre-vingt-dix-huit", French.toFrench(10498));
    assertEquals("un million", French.toFrench(1000000));
    assertEquals("deux millions", French.toFrench(2000000));
    assertEquals("trois millions huit cent mille cent sept", French.toFrench(3800107));
  }
}
