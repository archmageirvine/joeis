package irvine.factor.util;

import irvine.StandardIoTestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SnfsPolynomialTest extends StandardIoTestCase {

  private void check(final String expected, final String... args) {
    SnfsPolynomial.main(args);
    assertEquals(expected, getOut().replace('\n', '#'));
  }

  public void test1() {
    check("", "2^500000*3+5");
  }

  public void test2() {
    check("name: poly#n: 3377699720527877#c5: 3#c4: 0#c3: 0#c2: 0#c1: 0#c0: 5#Y1: 1#Y0: -1024#type: snfs#", "2^50*3+5");
  }

  public void test3() {
    check("name: poly#n: 48952169862723#c5: 1#c4: 0#c3: 0#c2: 0#c1: 0#c0: 5#Y1: 1#Y0: -1024#type: snfs#", "(2^50+5)/23");
  }

  public void test4() {
    check("name: poly#n: 1125899906842619#c5: 1#c4: 0#c3: 0#c2: 0#c1: 0#c0: -5#Y1: 1#Y0: -1024#type: snfs#", "2^50-5");
  }
}
