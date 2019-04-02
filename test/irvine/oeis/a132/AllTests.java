package irvine.oeis.a132;

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
    suite.addTestSuite(A132079Test.class);
    suite.addTestSuite(A132109Test.class);
    suite.addTestSuite(A132112Test.class);
    suite.addTestSuite(A132117Test.class);
    suite.addTestSuite(A132122Test.class);
    suite.addTestSuite(A132123Test.class);
    suite.addTestSuite(A132151Test.class);
    suite.addTestSuite(A132158Test.class);
    suite.addTestSuite(A132208Test.class);
    suite.addTestSuite(A132270Test.class);
    suite.addTestSuite(A132308Test.class);
    suite.addTestSuite(A132314Test.class);
    suite.addTestSuite(A132337Test.class);
    suite.addTestSuite(A132344Test.class);
    suite.addTestSuite(A132353Test.class);
    suite.addTestSuite(A132354Test.class);
    suite.addTestSuite(A132355Test.class);
    suite.addTestSuite(A132356Test.class);
    suite.addTestSuite(A132357Test.class);
    suite.addTestSuite(A132365Test.class);
    suite.addTestSuite(A132366Test.class);
    suite.addTestSuite(A132367Test.class);
    suite.addTestSuite(A132380Test.class);
    suite.addTestSuite(A132395Test.class);
    suite.addTestSuite(A132397Test.class);
    suite.addTestSuite(A132400Test.class);
    suite.addTestSuite(A132401Test.class);
    suite.addTestSuite(A132418Test.class);
    suite.addTestSuite(A132419Test.class);
    suite.addTestSuite(A132421Test.class);
    suite.addTestSuite(A132429Test.class);
    suite.addTestSuite(A132433Test.class);
    suite.addTestSuite(A132434Test.class);
    suite.addTestSuite(A132458Test.class);
    suite.addTestSuite(A132469Test.class);
    suite.addTestSuite(A132583Test.class);
    suite.addTestSuite(A132584Test.class);
    suite.addTestSuite(A132592Test.class);
    suite.addTestSuite(A132593Test.class);
    suite.addTestSuite(A132594Test.class);
    suite.addTestSuite(A132596Test.class);
    suite.addTestSuite(A132607Test.class);
    suite.addTestSuite(A132644Test.class);
    suite.addTestSuite(A132677Test.class);
    suite.addTestSuite(A132696Test.class);
    suite.addTestSuite(A132697Test.class);
    suite.addTestSuite(A132698Test.class);
    suite.addTestSuite(A132699Test.class);
    suite.addTestSuite(A132700Test.class);
    suite.addTestSuite(A132701Test.class);
    suite.addTestSuite(A132702Test.class);
    suite.addTestSuite(A132703Test.class);
    suite.addTestSuite(A132704Test.class);
    suite.addTestSuite(A132706Test.class);
    suite.addTestSuite(A132707Test.class);
    suite.addTestSuite(A132708Test.class);
    suite.addTestSuite(A132709Test.class);
    suite.addTestSuite(A132711Test.class);
    suite.addTestSuite(A132712Test.class);
    suite.addTestSuite(A132713Test.class);
    suite.addTestSuite(A132714Test.class);
    suite.addTestSuite(A132715Test.class);
    suite.addTestSuite(A132716Test.class);
    suite.addTestSuite(A132717Test.class);
    suite.addTestSuite(A132718Test.class);
    suite.addTestSuite(A132719Test.class);
    suite.addTestSuite(A132721Test.class);
    suite.addTestSuite(A132753Test.class);
    suite.addTestSuite(A132754Test.class);
    suite.addTestSuite(A132755Test.class);
    suite.addTestSuite(A132756Test.class);
    suite.addTestSuite(A132757Test.class);
    suite.addTestSuite(A132758Test.class);
    suite.addTestSuite(A132759Test.class);
    suite.addTestSuite(A132760Test.class);
    suite.addTestSuite(A132761Test.class);
    suite.addTestSuite(A132762Test.class);
    suite.addTestSuite(A132763Test.class);
    suite.addTestSuite(A132764Test.class);
    suite.addTestSuite(A132765Test.class);
    suite.addTestSuite(A132766Test.class);
    suite.addTestSuite(A132767Test.class);
    suite.addTestSuite(A132768Test.class);
    suite.addTestSuite(A132769Test.class);
    suite.addTestSuite(A132770Test.class);
    suite.addTestSuite(A132771Test.class);
    suite.addTestSuite(A132772Test.class);
    suite.addTestSuite(A132773Test.class);
    suite.addTestSuite(A132798Test.class);
    suite.addTestSuite(A132804Test.class);
    suite.addTestSuite(A132805Test.class);
    suite.addTestSuite(A132868Test.class);
    suite.addTestSuite(A132899Test.class);
    suite.addTestSuite(A132922Test.class);
    suite.addTestSuite(A132925Test.class);
    suite.addTestSuite(A132951Test.class);
    suite.addTestSuite(A132954Test.class);
    suite.addTestSuite(A132998Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

