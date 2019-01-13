package irvine.oeis.a238;

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
    suite.addTestSuite(A238108Test.class);
    suite.addTestSuite(A238188Test.class);
    suite.addTestSuite(A238315Test.class);
    suite.addTestSuite(A238328Test.class);
    suite.addTestSuite(A238340Test.class);
    suite.addTestSuite(A238355Test.class);
    suite.addTestSuite(A238356Test.class);
    suite.addTestSuite(A238357Test.class);
    suite.addTestSuite(A238358Test.class);
    suite.addTestSuite(A238359Test.class);
    suite.addTestSuite(A238360Test.class);
    suite.addTestSuite(A238374Test.class);
    suite.addTestSuite(A238377Test.class);
    suite.addTestSuite(A238379Test.class);
    suite.addTestSuite(A238383Test.class);
    suite.addTestSuite(A238389Test.class);
    suite.addTestSuite(A238391Test.class);
    suite.addTestSuite(A238410Test.class);
    suite.addTestSuite(A238411Test.class);
    suite.addTestSuite(A238419Test.class);
    suite.addTestSuite(A238420Test.class);
    suite.addTestSuite(A238468Test.class);
    suite.addTestSuite(A238469Test.class);
    suite.addTestSuite(A238470Test.class);
    suite.addTestSuite(A238536Test.class);
    suite.addTestSuite(A238537Test.class);
    suite.addTestSuite(A238538Test.class);
    suite.addTestSuite(A238539Test.class);
    suite.addTestSuite(A238540Test.class);
    suite.addTestSuite(A238600Test.class);
    suite.addTestSuite(A238601Test.class);
    suite.addTestSuite(A238602Test.class);
    suite.addTestSuite(A238603Test.class);
    suite.addTestSuite(A238604Test.class);
    suite.addTestSuite(A238702Test.class);
    suite.addTestSuite(A238705Test.class);
    suite.addTestSuite(A238706Test.class);
    suite.addTestSuite(A238738Test.class);
    suite.addTestSuite(A238823Test.class);
    suite.addTestSuite(A238824Test.class);
    suite.addTestSuite(A238826Test.class);
    suite.addTestSuite(A238828Test.class);
    suite.addTestSuite(A238829Test.class);
    suite.addTestSuite(A238830Test.class);
    suite.addTestSuite(A238832Test.class);
    suite.addTestSuite(A238846Test.class);
    suite.addTestSuite(A238976Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

