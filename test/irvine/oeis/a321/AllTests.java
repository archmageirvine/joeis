package irvine.oeis.a321;

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
    suite.addTestSuite(A321002Test.class);
    suite.addTestSuite(A321003Test.class);
    suite.addTestSuite(A321008Test.class);
    suite.addTestSuite(A321009Test.class);
    suite.addTestSuite(A321011Test.class);
    suite.addTestSuite(A321012Test.class);
    suite.addTestSuite(A321013Test.class);
    suite.addTestSuite(A321019Test.class);
    suite.addTestSuite(A321022Test.class);
    suite.addTestSuite(A321025Test.class);
    suite.addTestSuite(A321045Test.class);
    suite.addTestSuite(A321048Test.class);
    suite.addTestSuite(A321049Test.class);
    suite.addTestSuite(A321119Test.class);
    suite.addTestSuite(A321120Test.class);
    suite.addTestSuite(A321123Test.class);
    suite.addTestSuite(A321124Test.class);
    suite.addTestSuite(A321129Test.class);
    suite.addTestSuite(A321130Test.class);
    suite.addTestSuite(A321131Test.class);
    suite.addTestSuite(A321133Test.class);
    suite.addTestSuite(A321148Test.class);
    suite.addTestSuite(A321153Test.class);
    suite.addTestSuite(A321173Test.class);
    suite.addTestSuite(A321174Test.class);
    suite.addTestSuite(A321175Test.class);
    suite.addTestSuite(A321180Test.class);
    suite.addTestSuite(A321195Test.class);
    suite.addTestSuite(A321202Test.class);
    suite.addTestSuite(A321212Test.class);
    suite.addTestSuite(A321218Test.class);
    suite.addTestSuite(A321219Test.class);
    suite.addTestSuite(A321220Test.class);
    suite.addTestSuite(A321232Test.class);
    suite.addTestSuite(A321237Test.class);
    suite.addTestSuite(A321244Test.class);
    suite.addTestSuite(A321251Test.class);
    suite.addTestSuite(A321257Test.class);
    suite.addTestSuite(A321268Test.class);
    suite.addTestSuite(A321269Test.class);
    suite.addTestSuite(A321306Test.class);
    suite.addTestSuite(A321307Test.class);
    suite.addTestSuite(A321311Test.class);
    suite.addTestSuite(A321324Test.class);
    suite.addTestSuite(A321353Test.class);
    suite.addTestSuite(A321358Test.class);
    suite.addTestSuite(A321383Test.class);
    suite.addTestSuite(A321398Test.class);
    suite.addTestSuite(A321416Test.class);
    suite.addTestSuite(A321417Test.class);
    suite.addTestSuite(A321418Test.class);
    suite.addTestSuite(A321421Test.class);
    suite.addTestSuite(A321442Test.class);
    suite.addTestSuite(A321461Test.class);
    suite.addTestSuite(A321463Test.class);
    suite.addTestSuite(A321465Test.class);
    suite.addTestSuite(A321466Test.class);
    suite.addTestSuite(A321483Test.class);
    suite.addTestSuite(A321499Test.class);
    suite.addTestSuite(A321541Test.class);
    suite.addTestSuite(A321542Test.class);
    suite.addTestSuite(A321546Test.class);
    suite.addTestSuite(A321573Test.class);
    suite.addTestSuite(A321574Test.class);
    suite.addTestSuite(A321579Test.class);
    suite.addTestSuite(A321614Test.class);
    suite.addTestSuite(A321617Test.class);
    suite.addTestSuite(A321632Test.class);
    suite.addTestSuite(A321635Test.class);
    suite.addTestSuite(A321636Test.class);
    suite.addTestSuite(A321637Test.class);
    suite.addTestSuite(A321638Test.class);
    suite.addTestSuite(A321639Test.class);
    suite.addTestSuite(A321640Test.class);
    suite.addTestSuite(A321641Test.class);
    suite.addTestSuite(A321642Test.class);
    suite.addTestSuite(A321643Test.class);
    suite.addTestSuite(A321656Test.class);
    suite.addTestSuite(A321664Test.class);
    suite.addTestSuite(A321672Test.class);
    suite.addTestSuite(A321684Test.class);
    suite.addTestSuite(A321703Test.class);
    suite.addTestSuite(A321714Test.class);
    suite.addTestSuite(A321715Test.class);
    suite.addTestSuite(A321773Test.class);
    suite.addTestSuite(A321774Test.class);
    suite.addTestSuite(A321775Test.class);
    suite.addTestSuite(A321776Test.class);
    suite.addTestSuite(A321777Test.class);
    suite.addTestSuite(A321786Test.class);
    suite.addTestSuite(A321837Test.class);
    suite.addTestSuite(A321847Test.class);
    suite.addTestSuite(A321848Test.class);
    suite.addTestSuite(A321849Test.class);
    suite.addTestSuite(A321850Test.class);
    suite.addTestSuite(A321942Test.class);
    suite.addTestSuite(A321965Test.class);
    suite.addTestSuite(A321984Test.class);
    suite.addTestSuite(A321986Test.class);
    suite.addTestSuite(A321988Test.class);
    suite.addTestSuite(A321993Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

