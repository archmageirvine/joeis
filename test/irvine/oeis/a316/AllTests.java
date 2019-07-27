package irvine.oeis.a316;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A316087Test.class);
    suite.addTestSuite(A316088Test.class);
    suite.addTestSuite(A316224Test.class);
    suite.addTestSuite(A316261Test.class);
    suite.addTestSuite(A316316Test.class);
    suite.addTestSuite(A316317Test.class);
    suite.addTestSuite(A316318Test.class);
    suite.addTestSuite(A316340Test.class);
    suite.addTestSuite(A316349Test.class);
    suite.addTestSuite(A316357Test.class);
    suite.addTestSuite(A316386Test.class);
    suite.addTestSuite(A316387Test.class);
    suite.addTestSuite(A316412Test.class);
    suite.addTestSuite(A316456Test.class);
    suite.addTestSuite(A316457Test.class);
    suite.addTestSuite(A316458Test.class);
    suite.addTestSuite(A316459Test.class);
    suite.addTestSuite(A316466Test.class);
    suite.addTestSuite(A316492Test.class);
    suite.addTestSuite(A316526Test.class);
    suite.addTestSuite(A316528Test.class);
    suite.addTestSuite(A316562Test.class);
    suite.addTestSuite(A316601Test.class);
    suite.addTestSuite(A316631Test.class);
    suite.addTestSuite(A316671Test.class);
    suite.addTestSuite(A316672Test.class);
    suite.addTestSuite(A316699Test.class);
    suite.addTestSuite(A316708Test.class);
    suite.addTestSuite(A316709Test.class);
    suite.addTestSuite(A316724Test.class);
    suite.addTestSuite(A316725Test.class);
    suite.addTestSuite(A316726Test.class);
    suite.addTestSuite(A316729Test.class);
    suite.addTestSuite(A316742Test.class);
    suite.addTestSuite(A316743Test.class);
    suite.addTestSuite(A316779Test.class);
    suite.addTestSuite(A316831Test.class);
    suite.addTestSuite(A316937Test.class);
    suite.addTestSuite(A316966Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
