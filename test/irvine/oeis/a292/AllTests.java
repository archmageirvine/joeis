package irvine.oeis.a292;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    suite.addTestSuite(A292000Test.class);
    suite.addTestSuite(A292001Test.class);
    suite.addTestSuite(A292018Test.class);
    suite.addTestSuite(A292022Test.class);
    suite.addTestSuite(A292026Test.class);
    suite.addTestSuite(A292027Test.class);
    suite.addTestSuite(A292034Test.class);
    suite.addTestSuite(A292035Test.class);
    suite.addTestSuite(A292044Test.class);
    suite.addTestSuite(A292045Test.class);
    suite.addTestSuite(A292051Test.class);
    suite.addTestSuite(A292053Test.class);
    suite.addTestSuite(A292054Test.class);
    suite.addTestSuite(A292055Test.class);
    suite.addTestSuite(A292056Test.class);
    suite.addTestSuite(A292057Test.class);
    suite.addTestSuite(A292058Test.class);
    suite.addTestSuite(A292059Test.class);
    suite.addTestSuite(A292061Test.class);
    suite.addTestSuite(A292074Test.class);
    suite.addTestSuite(A292082Test.class);
    suite.addTestSuite(A292151Test.class);
    suite.addTestSuite(A292185Test.class);
    suite.addTestSuite(A292209Test.class);
    suite.addTestSuite(A292277Test.class);
    suite.addTestSuite(A292278Test.class);
    suite.addTestSuite(A292281Test.class);
    suite.addTestSuite(A292282Test.class);
    suite.addTestSuite(A292290Test.class);
    suite.addTestSuite(A292291Test.class);
    suite.addTestSuite(A292292Test.class);
    suite.addTestSuite(A292293Test.class);
    suite.addTestSuite(A292294Test.class);
    suite.addTestSuite(A292295Test.class);
    suite.addTestSuite(A292296Test.class);
    suite.addTestSuite(A292297Test.class);
    suite.addTestSuite(A292298Test.class);
    suite.addTestSuite(A292299Test.class);
    suite.addTestSuite(A292301Test.class);
    suite.addTestSuite(A292320Test.class);
    suite.addTestSuite(A292321Test.class);
    suite.addTestSuite(A292322Test.class);
    suite.addTestSuite(A292323Test.class);
    suite.addTestSuite(A292324Test.class);
    suite.addTestSuite(A292325Test.class);
    suite.addTestSuite(A292326Test.class);
    suite.addTestSuite(A292327Test.class);
    suite.addTestSuite(A292328Test.class);
    suite.addTestSuite(A292329Test.class);
    suite.addTestSuite(A292343Test.class);
    suite.addTestSuite(A292344Test.class);
    suite.addTestSuite(A292345Test.class);
    suite.addTestSuite(A292346Test.class);
    suite.addTestSuite(A292350Test.class);
    suite.addTestSuite(A292360Test.class);
    suite.addTestSuite(A292397Test.class);
    suite.addTestSuite(A292398Test.class);
    suite.addTestSuite(A292399Test.class);
    suite.addTestSuite(A292400Test.class);
    suite.addTestSuite(A292401Test.class);
    suite.addTestSuite(A292402Test.class);
    suite.addTestSuite(A292403Test.class);
    suite.addTestSuite(A292404Test.class);
    suite.addTestSuite(A292412Test.class);
    suite.addTestSuite(A292423Test.class);
    suite.addTestSuite(A292439Test.class);
    suite.addTestSuite(A292440Test.class);
    suite.addTestSuite(A292443Test.class);
    suite.addTestSuite(A292460Test.class);
    suite.addTestSuite(A292465Test.class);
    suite.addTestSuite(A292472Test.class);
    suite.addTestSuite(A292478Test.class);
    suite.addTestSuite(A292479Test.class);
    suite.addTestSuite(A292480Test.class);
    suite.addTestSuite(A292481Test.class);
    suite.addTestSuite(A292482Test.class);
    suite.addTestSuite(A292483Test.class);
    suite.addTestSuite(A292484Test.class);
    suite.addTestSuite(A292485Test.class);
    suite.addTestSuite(A292486Test.class);
    suite.addTestSuite(A292487Test.class);
    suite.addTestSuite(A292488Test.class);
    suite.addTestSuite(A292489Test.class);
    suite.addTestSuite(A292490Test.class);
    suite.addTestSuite(A292491Test.class);
    suite.addTestSuite(A292492Test.class);
    suite.addTestSuite(A292493Test.class);
    suite.addTestSuite(A292494Test.class);
    suite.addTestSuite(A292521Test.class);
    suite.addTestSuite(A292532Test.class);
    suite.addTestSuite(A292533Test.class);
    suite.addTestSuite(A292534Test.class);
    suite.addTestSuite(A292535Test.class);
    suite.addTestSuite(A292536Test.class);
    suite.addTestSuite(A292537Test.class);
    suite.addTestSuite(A292540Test.class);
    suite.addTestSuite(A292542Test.class);
    suite.addTestSuite(A292543Test.class);
    suite.addTestSuite(A292545Test.class);
    suite.addTestSuite(A292551Test.class);
    suite.addTestSuite(A292576Test.class);
    suite.addTestSuite(A292612Test.class);
    suite.addTestSuite(A292616Test.class);
    suite.addTestSuite(A292696Test.class);
    suite.addTestSuite(A292748Test.class);
    suite.addTestSuite(A292749Test.class);
    suite.addTestSuite(A292752Test.class);
    suite.addTestSuite(A292764Test.class);
    suite.addTestSuite(A292850Test.class);
    suite.addTestSuite(A292851Test.class);
    suite.addTestSuite(A292872Test.class);
    suite.addTestSuite(A292878Test.class);
    suite.addTestSuite(A292897Test.class);
    suite.addTestSuite(A292903Test.class);
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
