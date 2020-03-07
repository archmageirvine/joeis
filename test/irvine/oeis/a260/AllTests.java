package irvine.oeis.a260;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A260006Test.class);
    suite.addTestSuite(A260033Test.class);
    suite.addTestSuite(A260034Test.class);
    suite.addTestSuite(A260057Test.class);
    suite.addTestSuite(A260058Test.class);
    suite.addTestSuite(A260074Test.class);
    suite.addTestSuite(A260081Test.class);
    suite.addTestSuite(A260089Test.class);
    suite.addTestSuite(A260096Test.class);
    suite.addTestSuite(A260109Test.class);
    suite.addTestSuite(A260110Test.class);
    suite.addTestSuite(A260114Test.class);
    suite.addTestSuite(A260118Test.class);
    suite.addTestSuite(A260145Test.class);
    suite.addTestSuite(A260150Test.class);
    suite.addTestSuite(A260158Test.class);
    suite.addTestSuite(A260160Test.class);
    suite.addTestSuite(A260162Test.class);
    suite.addTestSuite(A260163Test.class);
    suite.addTestSuite(A260164Test.class);
    suite.addTestSuite(A260165Test.class);
    suite.addTestSuite(A260166Test.class);
    suite.addTestSuite(A260167Test.class);
    suite.addTestSuite(A260168Test.class);
    suite.addTestSuite(A260181Test.class);
    suite.addTestSuite(A260183Test.class);
    suite.addTestSuite(A260186Test.class);
    suite.addTestSuite(A260190Test.class);
    suite.addTestSuite(A260192Test.class);
    suite.addTestSuite(A260196Test.class);
    suite.addTestSuite(A260214Test.class);
    suite.addTestSuite(A260215Test.class);
    suite.addTestSuite(A260217Test.class);
    suite.addTestSuite(A260220Test.class);
    suite.addTestSuite(A260221Test.class);
    suite.addTestSuite(A260249Test.class);
    suite.addTestSuite(A260253Test.class);
    suite.addTestSuite(A260259Test.class);
    suite.addTestSuite(A260260Test.class);
    suite.addTestSuite(A260295Test.class);
    suite.addTestSuite(A260301Test.class);
    suite.addTestSuite(A260302Test.class);
    suite.addTestSuite(A260304Test.class);
    suite.addTestSuite(A260307Test.class);
    suite.addTestSuite(A260308Test.class);
    suite.addTestSuite(A260309Test.class);
    suite.addTestSuite(A260313Test.class);
    suite.addTestSuite(A260314Test.class);
    suite.addTestSuite(A260316Test.class);
    suite.addTestSuite(A260334Test.class);
    suite.addTestSuite(A260344Test.class);
    suite.addTestSuite(A260345Test.class);
    suite.addTestSuite(A260387Test.class);
    suite.addTestSuite(A260412Test.class);
    suite.addTestSuite(A260414Test.class);
    suite.addTestSuite(A260415Test.class);
    suite.addTestSuite(A260486Test.class);
    suite.addTestSuite(A260505Test.class);
    suite.addTestSuite(A260513Test.class);
    suite.addTestSuite(A260514Test.class);
    suite.addTestSuite(A260515Test.class);
    suite.addTestSuite(A260516Test.class);
    suite.addTestSuite(A260518Test.class);
    suite.addTestSuite(A260545Test.class);
    suite.addTestSuite(A260546Test.class);
    suite.addTestSuite(A260547Test.class);
    suite.addTestSuite(A260574Test.class);
    suite.addTestSuite(A260575Test.class);
    suite.addTestSuite(A260585Test.class);
    suite.addTestSuite(A260598Test.class);
    suite.addTestSuite(A260599Test.class);
    suite.addTestSuite(A260600Test.class);
    suite.addTestSuite(A260637Test.class);
    suite.addTestSuite(A260644Test.class);
    suite.addTestSuite(A260679Test.class);
    suite.addTestSuite(A260686Test.class);
    suite.addTestSuite(A260692Test.class);
    suite.addTestSuite(A260696Test.class);
    suite.addTestSuite(A260699Test.class);
    suite.addTestSuite(A260708Test.class);
    suite.addTestSuite(A260710Test.class);
    suite.addTestSuite(A260727Test.class);
    suite.addTestSuite(A260751Test.class);
    suite.addTestSuite(A260810Test.class);
    suite.addTestSuite(A260814Test.class);
    suite.addTestSuite(A260819Test.class);
    suite.addTestSuite(A260820Test.class);
    suite.addTestSuite(A260826Test.class);
    suite.addTestSuite(A260846Test.class);
    suite.addTestSuite(A260917Test.class);
    suite.addTestSuite(A260918Test.class);
    suite.addTestSuite(A260937Test.class);
    suite.addTestSuite(A260939Test.class);
    suite.addTestSuite(A260941Test.class);
    suite.addTestSuite(A260942Test.class);
    suite.addTestSuite(A260943Test.class);
    suite.addTestSuite(A260944Test.class);
    suite.addTestSuite(A260945Test.class);
    suite.addTestSuite(A260953Test.class);
    suite.addTestSuite(A260955Test.class);
    suite.addTestSuite(A260958Test.class);
    suite.addTestSuite(A260990Test.class);
    suite.addTestSuite(A260991Test.class);
    suite.addTestSuite(A260993Test.class);
    suite.addTestSuite(A260994Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
