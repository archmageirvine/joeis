package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FrenchTest extends TestCase {

  public void testIntToFrenchText() {
    assertEquals("z\u00E9ro", French.SINGLETON.toText(0));
    assertEquals("un", French.SINGLETON.toText(1));
    assertEquals("deux", French.SINGLETON.toText(2));
    assertEquals("trois", French.SINGLETON.toText(3));
    assertEquals("dix", French.SINGLETON.toText(10));
    assertEquals("onze", French.SINGLETON.toText(11));
    assertEquals("vingt", French.SINGLETON.toText(20));
    assertEquals("cent", French.SINGLETON.toText(100));
    assertEquals("cent un", French.SINGLETON.toText(101));
    assertEquals("cent vingt-cinq", French.SINGLETON.toText(125));
    assertEquals("deux cents", French.SINGLETON.toText(200));
    assertEquals("deux cent un", French.SINGLETON.toText(201));
    assertEquals("deux cent deux", French.SINGLETON.toText(202));
    assertEquals("deux cent quarante-trois", French.SINGLETON.toText(243));
    assertEquals("mille", French.SINGLETON.toText(1000));
    assertEquals("deux mille", French.SINGLETON.toText(2000));
    assertEquals("deux mille cinq cents", French.SINGLETON.toText(2500));
    assertEquals("dix mille quatre cent quatre-vingt-dix-huit", French.SINGLETON.toText(10498));
    assertEquals("un million", French.SINGLETON.toText(1000000));
    assertEquals("deux millions", French.SINGLETON.toText(2000000));
    assertEquals("trois millions huit cent mille cent sept", French.SINGLETON.toText(3800107));
  }
}
