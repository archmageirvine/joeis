package irvine.oeis.a080;

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
    suite.addTestSuite(A080002Test.class);
    suite.addTestSuite(A080003Test.class);
    suite.addTestSuite(A080004Test.class);
    suite.addTestSuite(A080005Test.class);
    suite.addTestSuite(A080006Test.class);
    suite.addTestSuite(A080007Test.class);
    suite.addTestSuite(A080008Test.class);
    suite.addTestSuite(A080009Test.class);
    suite.addTestSuite(A080010Test.class);
    suite.addTestSuite(A080011Test.class);
    suite.addTestSuite(A080012Test.class);
    suite.addTestSuite(A080013Test.class);
    suite.addTestSuite(A080014Test.class);
    suite.addTestSuite(A080018Test.class);
    suite.addTestSuite(A080040Test.class);
    suite.addTestSuite(A080041Test.class);
    suite.addTestSuite(A080043Test.class);
    suite.addTestSuite(A080061Test.class);
    suite.addTestSuite(A080097Test.class);
    suite.addTestSuite(A080204Test.class);
    suite.addTestSuite(A080239Test.class);
    suite.addTestSuite(A080250Test.class);
    suite.addTestSuite(A080260Test.class);
    suite.addTestSuite(A080335Test.class);
    suite.addTestSuite(A080340Test.class);
    suite.addTestSuite(A080341Test.class);
    suite.addTestSuite(A080412Test.class);
    suite.addTestSuite(A080420Test.class);
    suite.addTestSuite(A080421Test.class);
    suite.addTestSuite(A080422Test.class);
    suite.addTestSuite(A080423Test.class);
    suite.addTestSuite(A080424Test.class);
    suite.addTestSuite(A080425Test.class);
    suite.addTestSuite(A080444Test.class);
    suite.addTestSuite(A080455Test.class);
    suite.addTestSuite(A080457Test.class);
    suite.addTestSuite(A080458Test.class);
    suite.addTestSuite(A080460Test.class);
    suite.addTestSuite(A080513Test.class);
    suite.addTestSuite(A080610Test.class);
    suite.addTestSuite(A080637Test.class);
    suite.addTestSuite(A080653Test.class);
    suite.addTestSuite(A080663Test.class);
    suite.addTestSuite(A080674Test.class);
    suite.addTestSuite(A080675Test.class);
    suite.addTestSuite(A080679Test.class);
    suite.addTestSuite(A080688Test.class);
    suite.addTestSuite(A080709Test.class);
    suite.addTestSuite(A080737Test.class);
    suite.addTestSuite(A080738Test.class);
    suite.addTestSuite(A080742Test.class);
    suite.addTestSuite(A080782Test.class);
    suite.addTestSuite(A080806Test.class);
    suite.addTestSuite(A080827Test.class);
    suite.addTestSuite(A080843Test.class);
    suite.addTestSuite(A080855Test.class);
    suite.addTestSuite(A080856Test.class);
    suite.addTestSuite(A080857Test.class);
    suite.addTestSuite(A080859Test.class);
    suite.addTestSuite(A080860Test.class);
    suite.addTestSuite(A080861Test.class);
    suite.addTestSuite(A080872Test.class);
    suite.addTestSuite(A080874Test.class);
    suite.addTestSuite(A080877Test.class);
    suite.addTestSuite(A080878Test.class);
    suite.addTestSuite(A080879Test.class);
    suite.addTestSuite(A080880Test.class);
    suite.addTestSuite(A080891Test.class);
    suite.addTestSuite(A080892Test.class);
    suite.addTestSuite(A080920Test.class);
    suite.addTestSuite(A080921Test.class);
    suite.addTestSuite(A080924Test.class);
    suite.addTestSuite(A080926Test.class);
    suite.addTestSuite(A080930Test.class);
    suite.addTestSuite(A080937Test.class);
    suite.addTestSuite(A080938Test.class);
    suite.addTestSuite(A080952Test.class);
    suite.addTestSuite(A080956Test.class);
    suite.addTestSuite(A080957Test.class);
    suite.addTestSuite(A080960Test.class);
    suite.addTestSuite(A080961Test.class);
    suite.addTestSuite(A080962Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

