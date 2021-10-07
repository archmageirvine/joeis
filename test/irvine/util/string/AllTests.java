package irvine.util.string;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(BracketsTest.class);
    suite.addTestSuite(CasingTest.class);
    suite.addTestSuite(CatalanTest.class);
    suite.addTestSuite(CzechTest.class);
    suite.addTestSuite(DanishTest.class);
    suite.addTestSuite(DateTest.class);
    suite.addTestSuite(DutchTest.class);
    suite.addTestSuite(EnglishTest.class);
    suite.addTestSuite(FinnishTest.class);
    suite.addTestSuite(FrenchTest.class);
    suite.addTestSuite(GermanTest.class);
    suite.addTestSuite(HungarianTest.class);
    suite.addTestSuite(IrishGaelicTest.class);
    suite.addTestSuite(ItalianTest.class);
    suite.addTestSuite(NorwegianTest.class);
    suite.addTestSuite(NynorskTest.class);
    suite.addTestSuite(PolishTest.class);
    suite.addTestSuite(PostScriptTest.class);
    suite.addTestSuite(RomanTest.class);
    suite.addTestSuite(SpanishTest.class);
    suite.addTestSuite(RussianTest.class);
    suite.addTestSuite(StringUtilsTest.class);
    suite.addTestSuite(TelephoneTest.class);
    suite.addTestSuite(TeXTest.class);
    suite.addTestSuite(TextTableTest.class);
    suite.addTestSuite(WrappingStringBufferTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
