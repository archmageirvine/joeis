package irvine.oeis.a107;

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
    suite.addTestSuite(A107025Test.class);
    suite.addTestSuite(A107066Test.class);
    suite.addTestSuite(A107068Test.class);
    suite.addTestSuite(A107075Test.class);
    suite.addTestSuite(A107080Test.class);
    suite.addTestSuite(A107081Test.class);
    suite.addTestSuite(A107118Test.class);
    suite.addTestSuite(A107119Test.class);
    suite.addTestSuite(A107221Test.class);
    suite.addTestSuite(A107239Test.class);
    suite.addTestSuite(A107240Test.class);
    suite.addTestSuite(A107241Test.class);
    suite.addTestSuite(A107242Test.class);
    suite.addTestSuite(A107243Test.class);
    suite.addTestSuite(A107244Test.class);
    suite.addTestSuite(A107245Test.class);
    suite.addTestSuite(A107248Test.class);
    suite.addTestSuite(A107253Test.class);
    suite.addTestSuite(A107271Test.class);
    suite.addTestSuite(A107274Test.class);
    suite.addTestSuite(A107276Test.class);
    suite.addTestSuite(A107285Test.class);
    suite.addTestSuite(A107287Test.class);
    suite.addTestSuite(A107293Test.class);
    suite.addTestSuite(A107298Test.class);
    suite.addTestSuite(A107307Test.class);
    suite.addTestSuite(A107332Test.class);
    suite.addTestSuite(A107334Test.class);
    suite.addTestSuite(A107339Test.class);
    suite.addTestSuite(A107351Test.class);
    suite.addTestSuite(A107358Test.class);
    suite.addTestSuite(A107361Test.class);
    suite.addTestSuite(A107368Test.class);
    suite.addTestSuite(A107375Test.class);
    suite.addTestSuite(A107377Test.class);
    suite.addTestSuite(A107383Test.class);
    suite.addTestSuite(A107384Test.class);
    suite.addTestSuite(A107385Test.class);
    suite.addTestSuite(A107387Test.class);
    suite.addTestSuite(A107388Test.class);
    suite.addTestSuite(A107389Test.class);
    suite.addTestSuite(A107392Test.class);
    suite.addTestSuite(A107401Test.class);
    suite.addTestSuite(A107402Test.class);
    suite.addTestSuite(A107410Test.class);
    suite.addTestSuite(A107413Test.class);
    suite.addTestSuite(A107417Test.class);
    suite.addTestSuite(A107443Test.class);
    suite.addTestSuite(A107458Test.class);
    suite.addTestSuite(A107464Test.class);
    suite.addTestSuite(A107467Test.class);
    suite.addTestSuite(A107476Test.class);
    suite.addTestSuite(A107479Test.class);
    suite.addTestSuite(A107480Test.class);
    suite.addTestSuite(A107548Test.class);
    suite.addTestSuite(A107584Test.class);
    suite.addTestSuite(A107585Test.class);
    suite.addTestSuite(A107600Test.class);
    suite.addTestSuite(A107601Test.class);
    suite.addTestSuite(A107650Test.class);
    suite.addTestSuite(A107659Test.class);
    suite.addTestSuite(A107660Test.class);
    suite.addTestSuite(A107662Test.class);
    suite.addTestSuite(A107714Test.class);
    suite.addTestSuite(A107736Test.class);
    suite.addTestSuite(A107767Test.class);
    suite.addTestSuite(A107839Test.class);
    suite.addTestSuite(A107850Test.class);
    suite.addTestSuite(A107851Test.class);
    suite.addTestSuite(A107852Test.class);
    suite.addTestSuite(A107853Test.class);
    suite.addTestSuite(A107854Test.class);
    suite.addTestSuite(A107857Test.class);
    suite.addTestSuite(A107903Test.class);
    suite.addTestSuite(A107904Test.class);
    suite.addTestSuite(A107906Test.class);
    suite.addTestSuite(A107908Test.class);
    suite.addTestSuite(A107916Test.class);
    suite.addTestSuite(A107920Test.class);
    suite.addTestSuite(A107929Test.class);
    suite.addTestSuite(A107930Test.class);
    suite.addTestSuite(A107941Test.class);
    suite.addTestSuite(A107942Test.class);
    suite.addTestSuite(A107953Test.class);
    suite.addTestSuite(A107954Test.class);
    suite.addTestSuite(A107955Test.class);
    suite.addTestSuite(A107963Test.class);
    suite.addTestSuite(A107965Test.class);
    suite.addTestSuite(A107966Test.class);
    suite.addTestSuite(A107970Test.class);
    suite.addTestSuite(A107973Test.class);
    suite.addTestSuite(A107979Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

