package irvine.oeis.a176;

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
    suite.addTestSuite(A176010Test.class);
    suite.addTestSuite(A176027Test.class);
    suite.addTestSuite(A176040Test.class);
    suite.addTestSuite(A176060Test.class);
    suite.addTestSuite(A176127Test.class);
    suite.addTestSuite(A176174Test.class);
    suite.addTestSuite(A176177Test.class);
    suite.addTestSuite(A176222Test.class);
    suite.addTestSuite(A176260Test.class);
    suite.addTestSuite(A176281Test.class);
    suite.addTestSuite(A176288Test.class);
    suite.addTestSuite(A176290Test.class);
    suite.addTestSuite(A176326Test.class);
    suite.addTestSuite(A176333Test.class);
    suite.addTestSuite(A176364Test.class);
    suite.addTestSuite(A176367Test.class);
    suite.addTestSuite(A176368Test.class);
    suite.addTestSuite(A176369Test.class);
    suite.addTestSuite(A176370Test.class);
    suite.addTestSuite(A176372Test.class);
    suite.addTestSuite(A176373Test.class);
    suite.addTestSuite(A176374Test.class);
    suite.addTestSuite(A176375Test.class);
    suite.addTestSuite(A176376Test.class);
    suite.addTestSuite(A176377Test.class);
    suite.addTestSuite(A176378Test.class);
    suite.addTestSuite(A176380Test.class);
    suite.addTestSuite(A176381Test.class);
    suite.addTestSuite(A176382Test.class);
    suite.addTestSuite(A176384Test.class);
    suite.addTestSuite(A176386Test.class);
    suite.addTestSuite(A176387Test.class);
    suite.addTestSuite(A176415Test.class);
    suite.addTestSuite(A176447Test.class);
    suite.addTestSuite(A176448Test.class);
    suite.addTestSuite(A176449Test.class);
    suite.addTestSuite(A176476Test.class);
    suite.addTestSuite(A176485Test.class);
    suite.addTestSuite(A176503Test.class);
    suite.addTestSuite(A176513Test.class);
    suite.addTestSuite(A176514Test.class);
    suite.addTestSuite(A176563Test.class);
    suite.addTestSuite(A176592Test.class);
    suite.addTestSuite(A176593Test.class);
    suite.addTestSuite(A176640Test.class);
    suite.addTestSuite(A176646Test.class);
    suite.addTestSuite(A176672Test.class);
    suite.addTestSuite(A176691Test.class);
    suite.addTestSuite(A176710Test.class);
    suite.addTestSuite(A176711Test.class);
    suite.addTestSuite(A176712Test.class);
    suite.addTestSuite(A176737Test.class);
    suite.addTestSuite(A176738Test.class);
    suite.addTestSuite(A176739Test.class);
    suite.addTestSuite(A176743Test.class);
    suite.addTestSuite(A176758Test.class);
    suite.addTestSuite(A176763Test.class);
    suite.addTestSuite(A176764Test.class);
    suite.addTestSuite(A176765Test.class);
    suite.addTestSuite(A176766Test.class);
    suite.addTestSuite(A176767Test.class);
    suite.addTestSuite(A176768Test.class);
    suite.addTestSuite(A176769Test.class);
    suite.addTestSuite(A176770Test.class);
    suite.addTestSuite(A176771Test.class);
    suite.addTestSuite(A176772Test.class);
    suite.addTestSuite(A176773Test.class);
    suite.addTestSuite(A176776Test.class);
    suite.addTestSuite(A176777Test.class);
    suite.addTestSuite(A176778Test.class);
    suite.addTestSuite(A176780Test.class);
    suite.addTestSuite(A176805Test.class);
    suite.addTestSuite(A176812Test.class);
    suite.addTestSuite(A176818Test.class);
    suite.addTestSuite(A176880Test.class);
    suite.addTestSuite(A176889Test.class);
    suite.addTestSuite(A176895Test.class);
    suite.addTestSuite(A176900Test.class);
    suite.addTestSuite(A176916Test.class);
    suite.addTestSuite(A176961Test.class);
    suite.addTestSuite(A176963Test.class);
    suite.addTestSuite(A176965Test.class);
    suite.addTestSuite(A176968Test.class);
    suite.addTestSuite(A176971Test.class);
    suite.addTestSuite(A176972Test.class);
    suite.addTestSuite(A176974Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

