package irvine.oeis.a111;

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
    suite.addTestSuite(A111002Test.class);
    suite.addTestSuite(A111057Test.class);
    suite.addTestSuite(A111074Test.class);
    suite.addTestSuite(A111080Test.class);
    suite.addTestSuite(A111085Test.class);
    suite.addTestSuite(A111109Test.class);
    suite.addTestSuite(A111110Test.class);
    suite.addTestSuite(A111144Test.class);
    suite.addTestSuite(A111167Test.class);
    suite.addTestSuite(A111214Test.class);
    suite.addTestSuite(A111216Test.class);
    suite.addTestSuite(A111258Test.class);
    suite.addTestSuite(A111277Test.class);
    suite.addTestSuite(A111280Test.class);
    suite.addTestSuite(A111281Test.class);
    suite.addTestSuite(A111283Test.class);
    suite.addTestSuite(A111284Test.class);
    suite.addTestSuite(A111285Test.class);
    suite.addTestSuite(A111313Test.class);
    suite.addTestSuite(A111314Test.class);
    suite.addTestSuite(A111352Test.class);
    suite.addTestSuite(A111358Test.class);
    suite.addTestSuite(A111365Test.class);
    suite.addTestSuite(A111384Test.class);
    suite.addTestSuite(A111385Test.class);
    suite.addTestSuite(A111396Test.class);
    suite.addTestSuite(A111400Test.class);
    suite.addTestSuite(A111466Test.class);
    suite.addTestSuite(A111482Test.class);
    suite.addTestSuite(A111500Test.class);
    suite.addTestSuite(A111566Test.class);
    suite.addTestSuite(A111567Test.class);
    suite.addTestSuite(A111569Test.class);
    suite.addTestSuite(A111570Test.class);
    suite.addTestSuite(A111571Test.class);
    suite.addTestSuite(A111572Test.class);
    suite.addTestSuite(A111573Test.class);
    suite.addTestSuite(A111574Test.class);
    suite.addTestSuite(A111575Test.class);
    suite.addTestSuite(A111586Test.class);
    suite.addTestSuite(A111587Test.class);
    suite.addTestSuite(A111638Test.class);
    suite.addTestSuite(A111639Test.class);
    suite.addTestSuite(A111640Test.class);
    suite.addTestSuite(A111641Test.class);
    suite.addTestSuite(A111642Test.class);
    suite.addTestSuite(A111643Test.class);
    suite.addTestSuite(A111644Test.class);
    suite.addTestSuite(A111645Test.class);
    suite.addTestSuite(A111647Test.class);
    suite.addTestSuite(A111662Test.class);
    suite.addTestSuite(A111663Test.class);
    suite.addTestSuite(A111665Test.class);
    suite.addTestSuite(A111666Test.class);
    suite.addTestSuite(A111694Test.class);
    suite.addTestSuite(A111710Test.class);
    suite.addTestSuite(A111721Test.class);
    suite.addTestSuite(A111733Test.class);
    suite.addTestSuite(A111734Test.class);
    suite.addTestSuite(A111746Test.class);
    suite.addTestSuite(A111766Test.class);
    suite.addTestSuite(A111872Test.class);
    suite.addTestSuite(A111889Test.class);
    suite.addTestSuite(A111912Test.class);
    suite.addTestSuite(A111913Test.class);
    suite.addTestSuite(A111914Test.class);
    suite.addTestSuite(A111915Test.class);
    suite.addTestSuite(A111926Test.class);
    suite.addTestSuite(A111927Test.class);
    suite.addTestSuite(A111951Test.class);
    suite.addTestSuite(A111952Test.class);
    suite.addTestSuite(A111954Test.class);
    suite.addTestSuite(A111955Test.class);
    suite.addTestSuite(A111958Test.class);
    suite.addTestSuite(A111989Test.class);
    suite.addTestSuite(A111990Test.class);
    suite.addTestSuite(A111991Test.class);
    suite.addTestSuite(A111999Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

