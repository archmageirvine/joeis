package irvine.oeis.a090;

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
    suite.addTestSuite(A090017Test.class);
    suite.addTestSuite(A090018Test.class);
    suite.addTestSuite(A090019Test.class);
    suite.addTestSuite(A090020Test.class);
    suite.addTestSuite(A090021Test.class);
    suite.addTestSuite(A090022Test.class);
    suite.addTestSuite(A090023Test.class);
    suite.addTestSuite(A090024Test.class);
    suite.addTestSuite(A090034Test.class);
    suite.addTestSuite(A090035Test.class);
    suite.addTestSuite(A090036Test.class);
    suite.addTestSuite(A090040Test.class);
    suite.addTestSuite(A090041Test.class);
    suite.addTestSuite(A090042Test.class);
    suite.addTestSuite(A090076Test.class);
    suite.addTestSuite(A090131Test.class);
    suite.addTestSuite(A090132Test.class);
    suite.addTestSuite(A090133Test.class);
    suite.addTestSuite(A090139Test.class);
    suite.addTestSuite(A090166Test.class);
    suite.addTestSuite(A090168Test.class);
    suite.addTestSuite(A090169Test.class);
    suite.addTestSuite(A090176Test.class);
    suite.addTestSuite(A090197Test.class);
    suite.addTestSuite(A090198Test.class);
    suite.addTestSuite(A090199Test.class);
    suite.addTestSuite(A090200Test.class);
    suite.addTestSuite(A090247Test.class);
    suite.addTestSuite(A090248Test.class);
    suite.addTestSuite(A090249Test.class);
    suite.addTestSuite(A090251Test.class);
    suite.addTestSuite(A090277Test.class);
    suite.addTestSuite(A090278Test.class);
    suite.addTestSuite(A090279Test.class);
    suite.addTestSuite(A090280Test.class);
    suite.addTestSuite(A090281Test.class);
    suite.addTestSuite(A090282Test.class);
    suite.addTestSuite(A090283Test.class);
    suite.addTestSuite(A090284Test.class);
    suite.addTestSuite(A090288Test.class);
    suite.addTestSuite(A090294Test.class);
    suite.addTestSuite(A090297Test.class);
    suite.addTestSuite(A090300Test.class);
    suite.addTestSuite(A090301Test.class);
    suite.addTestSuite(A090305Test.class);
    suite.addTestSuite(A090306Test.class);
    suite.addTestSuite(A090307Test.class);
    suite.addTestSuite(A090308Test.class);
    suite.addTestSuite(A090309Test.class);
    suite.addTestSuite(A090310Test.class);
    suite.addTestSuite(A090313Test.class);
    suite.addTestSuite(A090314Test.class);
    suite.addTestSuite(A090316Test.class);
    suite.addTestSuite(A090326Test.class);
    suite.addTestSuite(A090327Test.class);
    suite.addTestSuite(A090328Test.class);
    suite.addTestSuite(A090381Test.class);
    suite.addTestSuite(A090386Test.class);
    suite.addTestSuite(A090390Test.class);
    suite.addTestSuite(A090391Test.class);
    suite.addTestSuite(A090392Test.class);
    suite.addTestSuite(A090393Test.class);
    suite.addTestSuite(A090394Test.class);
    suite.addTestSuite(A090399Test.class);
    suite.addTestSuite(A090400Test.class);
    suite.addTestSuite(A090401Test.class);
    suite.addTestSuite(A090407Test.class);
    suite.addTestSuite(A090409Test.class);
    suite.addTestSuite(A090411Test.class);
    suite.addTestSuite(A090448Test.class);
    suite.addTestSuite(A090449Test.class);
    suite.addTestSuite(A090453Test.class);
    suite.addTestSuite(A090454Test.class);
    suite.addTestSuite(A090466Test.class);
    suite.addTestSuite(A090468Test.class);
    suite.addTestSuite(A090491Test.class);
    suite.addTestSuite(A090492Test.class);
    suite.addTestSuite(A090508Test.class);
    suite.addTestSuite(A090509Test.class);
    suite.addTestSuite(A090570Test.class);
    suite.addTestSuite(A090572Test.class);
    suite.addTestSuite(A090579Test.class);
    suite.addTestSuite(A090580Test.class);
    suite.addTestSuite(A090581Test.class);
    suite.addTestSuite(A090589Test.class);
    suite.addTestSuite(A090590Test.class);
    suite.addTestSuite(A090591Test.class);
    suite.addTestSuite(A090596Test.class);
    suite.addTestSuite(A090597Test.class);
    suite.addTestSuite(A090666Test.class);
    suite.addTestSuite(A090667Test.class);
    suite.addTestSuite(A090692Test.class);
    suite.addTestSuite(A090727Test.class);
    suite.addTestSuite(A090728Test.class);
    suite.addTestSuite(A090729Test.class);
    suite.addTestSuite(A090730Test.class);
    suite.addTestSuite(A090731Test.class);
    suite.addTestSuite(A090732Test.class);
    suite.addTestSuite(A090733Test.class);
    suite.addTestSuite(A090771Test.class);
    suite.addTestSuite(A090772Test.class);
    suite.addTestSuite(A090773Test.class);
    suite.addTestSuite(A090809Test.class);
    suite.addTestSuite(A090812Test.class);
    suite.addTestSuite(A090843Test.class);
    suite.addTestSuite(A090860Test.class);
    suite.addTestSuite(A090937Test.class);
    suite.addTestSuite(A090946Test.class);
    suite.addTestSuite(A090948Test.class);
    suite.addTestSuite(A090949Test.class);
    suite.addTestSuite(A090965Test.class);
    suite.addTestSuite(A090986Test.class);
    suite.addTestSuite(A090989Test.class);
    suite.addTestSuite(A090990Test.class);
    suite.addTestSuite(A090991Test.class);
    suite.addTestSuite(A090992Test.class);
    suite.addTestSuite(A090993Test.class);
    suite.addTestSuite(A090994Test.class);
    suite.addTestSuite(A090995Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

