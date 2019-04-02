package irvine.oeis.a062;

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
    suite.addTestSuite(A062025Test.class);
    suite.addTestSuite(A062026Test.class);
    suite.addTestSuite(A062074Test.class);
    suite.addTestSuite(A062075Test.class);
    suite.addTestSuite(A062092Test.class);
    suite.addTestSuite(A062112Test.class);
    suite.addTestSuite(A062113Test.class);
    suite.addTestSuite(A062114Test.class);
    suite.addTestSuite(A062116Test.class);
    suite.addTestSuite(A062119Test.class);
    suite.addTestSuite(A062123Test.class);
    suite.addTestSuite(A062125Test.class);
    suite.addTestSuite(A062159Test.class);
    suite.addTestSuite(A062189Test.class);
    suite.addTestSuite(A062200Test.class);
    suite.addTestSuite(A062317Test.class);
    suite.addTestSuite(A062318Test.class);
    suite.addTestSuite(A062346Test.class);
    suite.addTestSuite(A062392Test.class);
    suite.addTestSuite(A062393Test.class);
    suite.addTestSuite(A062394Test.class);
    suite.addTestSuite(A062395Test.class);
    suite.addTestSuite(A062396Test.class);
    suite.addTestSuite(A062397Test.class);
    suite.addTestSuite(A062508Test.class);
    suite.addTestSuite(A062510Test.class);
    suite.addTestSuite(A062544Test.class);
    suite.addTestSuite(A062546Test.class);
    suite.addTestSuite(A062547Test.class);
    suite.addTestSuite(A062708Test.class);
    suite.addTestSuite(A062709Test.class);
    suite.addTestSuite(A062717Test.class);
    suite.addTestSuite(A062725Test.class);
    suite.addTestSuite(A062728Test.class);
    suite.addTestSuite(A062741Test.class);
    suite.addTestSuite(A062748Test.class);
    suite.addTestSuite(A062781Test.class);
    suite.addTestSuite(A062783Test.class);
    suite.addTestSuite(A062786Test.class);
    suite.addTestSuite(A062828Test.class);
    suite.addTestSuite(A062882Test.class);
    suite.addTestSuite(A062890Test.class);
    suite.addTestSuite(A062938Test.class);
    suite.addTestSuite(A062964Test.class);
    suite.addTestSuite(A062966Test.class);
    suite.addTestSuite(A062989Test.class);
    suite.addTestSuite(A062990Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

