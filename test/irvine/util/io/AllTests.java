package irvine.util.io;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Links all the tests in this package.
 *
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTest(irvine.util.io.java.AllTests.suite());
    suite.addTestSuite(Base64InputStreamTest.class);
    suite.addTestSuite(Base64OutputStreamTest.class);
    suite.addTestSuite(CustomURLStreamHandlerFactoryTest.class);
    suite.addTestSuite(HexadecimalInputStreamTest.class);
    suite.addTestSuite(HexadecimalOutputStreamTest.class);
    suite.addTestSuite(IOUtilsTest.class);
    suite.addTestSuite(MappingInputStreamTest.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
