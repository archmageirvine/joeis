package irvine.oeis.a117;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A117066Test.class);
    suite.addTestSuite(A117080Test.class);
    suite.addTestSuite(A117081Test.class);
    suite.addTestSuite(A117088Test.class);
    suite.addTestSuite(A117142Test.class);
    suite.addTestSuite(A117143Test.class);
    suite.addTestSuite(A117188Test.class);
    suite.addTestSuite(A117189Test.class);
    suite.addTestSuite(A117199Test.class);
    suite.addTestSuite(A117202Test.class);
    suite.addTestSuite(A117273Test.class);
    suite.addTestSuite(A117302Test.class);
    suite.addTestSuite(A117353Test.class);
    suite.addTestSuite(A117373Test.class);
    suite.addTestSuite(A117374Test.class);
    suite.addTestSuite(A117378Test.class);
    suite.addTestSuite(A117388Test.class);
    suite.addTestSuite(A117412Test.class);
    suite.addTestSuite(A117413Test.class);
    suite.addTestSuite(A117441Test.class);
    suite.addTestSuite(A117444Test.class);
    suite.addTestSuite(A117445Test.class);
    suite.addTestSuite(A117447Test.class);
    suite.addTestSuite(A117451Test.class);
    suite.addTestSuite(A117472Test.class);
    suite.addTestSuite(A117473Test.class);
    suite.addTestSuite(A117474Test.class);
    suite.addTestSuite(A117475Test.class);
    suite.addTestSuite(A117476Test.class);
    suite.addTestSuite(A117560Test.class);
    suite.addTestSuite(A117571Test.class);
    suite.addTestSuite(A117573Test.class);
    suite.addTestSuite(A117576Test.class);
    suite.addTestSuite(A117585Test.class);
    suite.addTestSuite(A117591Test.class);
    suite.addTestSuite(A117614Test.class);
    suite.addTestSuite(A117616Test.class);
    suite.addTestSuite(A117619Test.class);
    suite.addTestSuite(A117625Test.class);
    suite.addTestSuite(A117642Test.class);
    suite.addTestSuite(A117647Test.class);
    suite.addTestSuite(A117652Test.class);
    suite.addTestSuite(A117717Test.class);
    suite.addTestSuite(A117748Test.class);
    suite.addTestSuite(A117761Test.class);
    suite.addTestSuite(A117791Test.class);
    suite.addTestSuite(A117792Test.class);
    suite.addTestSuite(A117794Test.class);
    suite.addTestSuite(A117855Test.class);
    suite.addTestSuite(A117856Test.class);
    suite.addTestSuite(A117857Test.class);
    suite.addTestSuite(A117858Test.class);
    suite.addTestSuite(A117859Test.class);
    suite.addTestSuite(A117860Test.class);
    suite.addTestSuite(A117861Test.class);
    suite.addTestSuite(A117862Test.class);
    suite.addTestSuite(A117863Test.class);
    suite.addTestSuite(A117864Test.class);
    suite.addTestSuite(A117865Test.class);
    suite.addTestSuite(A117866Test.class);
    suite.addTestSuite(A117867Test.class);
    suite.addTestSuite(A117868Test.class);
    suite.addTestSuite(A117899Test.class);
    suite.addTestSuite(A117909Test.class);
    suite.addTestSuite(A117910Test.class);
    suite.addTestSuite(A117917Test.class);
    suite.addTestSuite(A117950Test.class);
    suite.addTestSuite(A117951Test.class);
    suite.addTestSuite(A117975Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

