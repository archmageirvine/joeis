package irvine.oeis.a050;

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
    suite.addTestSuite(A050187Test.class);
    suite.addTestSuite(A050228Test.class);
    suite.addTestSuite(A050231Test.class);
    suite.addTestSuite(A050232Test.class);
    suite.addTestSuite(A050233Test.class);
    suite.addTestSuite(A050244Test.class);
    suite.addTestSuite(A050250Test.class);
    suite.addTestSuite(A050255Test.class);
    suite.addTestSuite(A050271Test.class);
    suite.addTestSuite(A050292Test.class);
    suite.addTestSuite(A050321Test.class);
    suite.addTestSuite(A050376Test.class);
    suite.addTestSuite(A050400Test.class);
    suite.addTestSuite(A050401Test.class);
    suite.addTestSuite(A050402Test.class);
    suite.addTestSuite(A050403Test.class);
    suite.addTestSuite(A050404Test.class);
    suite.addTestSuite(A050405Test.class);
    suite.addTestSuite(A050406Test.class);
    suite.addTestSuite(A050407Test.class);
    suite.addTestSuite(A050408Test.class);
    suite.addTestSuite(A050409Test.class);
    suite.addTestSuite(A050410Test.class);
    suite.addTestSuite(A050441Test.class);
    suite.addTestSuite(A050442Test.class);
    suite.addTestSuite(A050447Test.class);
    suite.addTestSuite(A050483Test.class);
    suite.addTestSuite(A050484Test.class);
    suite.addTestSuite(A050486Test.class);
    suite.addTestSuite(A050488Test.class);
    suite.addTestSuite(A050492Test.class);
    suite.addTestSuite(A050494Test.class);
    suite.addTestSuite(A050509Test.class);
    suite.addTestSuite(A050521Test.class);
    suite.addTestSuite(A050533Test.class);
    suite.addTestSuite(A050534Test.class);
    suite.addTestSuite(A050535Test.class);
    suite.addTestSuite(A050621Test.class);
    suite.addTestSuite(A050683Test.class);
    suite.addTestSuite(A050684Test.class);
    suite.addTestSuite(A050685Test.class);
    suite.addTestSuite(A050914Test.class);
    suite.addTestSuite(A050915Test.class);
    suite.addTestSuite(A050916Test.class);
    suite.addTestSuite(A050917Test.class);
    suite.addTestSuite(A050919Test.class);
    suite.addTestSuite(A050935Test.class);
    suite.addTestSuite(A050982Test.class);
    suite.addTestSuite(A050989Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

