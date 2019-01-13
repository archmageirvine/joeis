package irvine.math.generic;

import irvine.TestUtils;
import irvine.math.c.C;
import irvine.math.c.ComplexField;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class TaylorSeries0F1Test extends TestCase {

  public void test0F1() {
    final ComplexField cf = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(2.17818355660857086), TaylorSeries0F1.hypergeometric(cf, new C(0.5), new C(0.5)), 1E-12);
    TestUtils.assertEquals(new C(1.55195519961148790, -0.607313485802606785), TaylorSeries0F1.hypergeometric(cf, new C(0.5, 0.5), new C(0.5)), 1E-12);
    TestUtils.assertEquals(new C(0.4954179000348890379, -0.8775961731502915942064), TaylorSeries0F1.hypergeometric(cf, new C(0, 10), new C(10)), 1E-12);
    TestUtils.assertEquals(new C(2.716926186871473393779), TaylorSeries0F1.hypergeometric(cf, new C(1000), new C(1000)), 1E-12);
    TestUtils.assertEquals(new C(0.36769548623756510255), TaylorSeries0F1.hypergeometric(cf, new C(1000), new C(-1000)), 1E-12);
    TestUtils.assertEquals(new C(0.9999999998765432098833265), TaylorSeries0F1.hypergeometric(cf, new C(8.1), new C(-1E-9)), 1E-12);
  }

}
